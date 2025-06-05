
import org.jetbrains.changelog.Changelog
import org.jetbrains.changelog.markdownToHTML
import org.jetbrains.intellij.platform.gradle.TestFrameworkType

plugins {
    id("java")
    alias(libs.plugins.kotlin)
    alias(libs.plugins.intelliJPlatform)
    alias(libs.plugins.changelog)
    alias(libs.plugins.qodana)
    alias(libs.plugins.kover)

    // Gradle 내장 ANTLR 플러그인
    id("antlr")
}

group = providers.gradleProperty("pluginGroup").get()
version = providers.gradleProperty("pluginVersion").get()

kotlin {
    jvmToolchain(21)
}

repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") } // JitPack 저장소 추가
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    // ANTLR 4 런타임/컴파일러
    antlr("org.antlr:antlr4:4.13.0")

    // antlr4-intellij-adaptor (JitPack)
    implementation("com.github.antlr:antlr4-intellij-adaptor:1.3.0")

    // 테스트용
    testImplementation(libs.junit)
    testImplementation(libs.opentest4j)

    // IntelliJ Platform Plugin
    intellijPlatform {
        create(
            providers.gradleProperty("platformType"),
            providers.gradleProperty("platformVersion")
        )
        bundledPlugins(
            providers.gradleProperty("platformBundledPlugins")
                .map { it.split(',') }
        )
        testFramework(TestFrameworkType.Platform)
    }
}

// ANTLR이 생성한 Java 코드를 컴파일러가 인식하도록 src/main/gen을 소스 루트로 지정
sourceSets {
    main {
        java {
            srcDir("src/main/gen")
        }
    }
}

tasks {
    // 내장 ANTLR 플러그인의 generateGrammarSource 설정
    named<AntlrTask>("generateGrammarSource") {
        // src/main/antlr/**/*.g4 파일을 모두 인식 (별도 지정 불필요)
        // 필요할 경우, 특정 폴더만 포함하도록 아래처럼 설정 가능:
        //
        // source = fileTree("src/main/antlr") {
        //     include("mysql/*.g4", "postgresql/*.g4", "oracle/PlSql.g4")
        // }

        // ANTLR 옵션: Visitor 자동 생성 & 패키지 경로 지정
        arguments = listOf(
            "-visitor",
            "-package", "com.github.frostycityman.inlinesqlcommentor.sql.parser.generated"
        )

        // 생성된 Java 코드를 저장할 위치
        outputDirectory = file("src/main/gen")

        // Combined Grammar 한 파일(예: PlSql.g4) 방식이면 libraries 불필요
        // 별도 Lexer/Parser 쌍을 사용할 때만 libraries 지정:
        // libraries = listOf(
        //     file("src/main/antlr/mysql"),
        //     file("src/main/antlr/postgresql"),
        //     file("src/main/antlr/oracle")
        // )
    }

    wrapper {
        gradleVersion    = providers.gradleProperty("gradleVersion").get()
        distributionType = Wrapper.DistributionType.ALL
    }

    publishPlugin {
        dependsOn(patchChangelog)
    }
}

intellijPlatform {
    pluginConfiguration {
        name    = providers.gradleProperty("pluginName")
        version = providers.gradleProperty("pluginVersion")

        // README.md 에서 Plugin description 추출
        description = providers.fileContents(layout.projectDirectory.file("README.md")).asText.map {
            val start = "<!-- Plugin description -->"
            val end   = "<!-- Plugin description end -->"
            val lines = it.lines()
            if (!lines.containsAll(listOf(start, end))) {
                throw GradleException("Plugin description section not found in README.md:\n$start ... $end")
            }
            lines.subList(lines.indexOf(start) + 1, lines.indexOf(end))
                .joinToString("\n")
                .let(::markdownToHTML)
        }

        // Changelog 설정
        val changelog = project.changelog
        changeNotes = providers.gradleProperty("pluginVersion").map { pluginVersion ->
            changelog.renderItem(
                (changelog.getOrNull(pluginVersion) ?: changelog.getUnreleased())
                    .withHeader(false)
                    .withEmptySections(false),
                Changelog.OutputType.HTML
            )
        }

        ideaVersion {
            sinceBuild = providers.gradleProperty("pluginSinceBuild")
            untilBuild = providers.gradleProperty("pluginUntilBuild")
        }
    }

    signing {
        certificateChain = providers.environmentVariable("CERTIFICATE_CHAIN")
        privateKey       = providers.environmentVariable("PRIVATE_KEY")
        password         = providers.environmentVariable("PRIVATE_KEY_PASSWORD")
    }

    publishing {
        token    = providers.environmentVariable("PUBLISH_TOKEN")
        channels = providers.gradleProperty("pluginVersion").map { ver ->
            listOf(ver.substringAfter('-').substringBefore('.').ifEmpty { "default" })
        }
    }

    pluginVerification {
        ides {
            recommended()
        }
    }
}

changelog {
    groups.empty()
    repositoryUrl = providers.gradleProperty("pluginRepositoryUrl")
}

kover {
    reports {
        total {
            xml {
                onCheck = true
            }
        }
    }
}

intellijPlatformTesting {
    runIde {
        register("runIdeForUiTests") {
            task {
                jvmArgumentProviders += CommandLineArgumentProvider {
                    listOf(
                        "-Drobot-server.port=8082",
                        "-Dide.mac.message.dialogs.as.sheets=false",
                        "-Djb.privacy.policy.text=<!--999.999-->",
                        "-Djb.consents.confirmation.enabled=false"
                    )
                }
            }
            plugins {
                robotServerPlugin()
            }
        }
    }
}
