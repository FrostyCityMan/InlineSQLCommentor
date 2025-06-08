import org.gradle.api.plugins.antlr.AntlrTask
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

    // ▶ Gradle 내장 ANTLR 플러그인 활성화
    id("antlr")
}

group = providers.gradleProperty("pluginGroup").get()
version = providers.gradleProperty("pluginVersion").get()

kotlin {
    jvmToolchain(21)
}

repositories {
    mavenCentral()
    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    // ▶ ANTLR 4.13.2 컴파일러/런타임 의존성
    antlr("org.antlr:antlr4:4.13.2")

    // ▶ 테스트 의존성
    testImplementation(libs.junit)
    testImplementation(libs.opentest4j)

    // ▶ IntelliJ Platform Plugin 의존성
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

// ANTLR이 생성한 Java 코드를 Kotlin/Java 컴파일러가 인식하게 src/main/kotlin 소스 루트로 지정
sourceSets {
    main {
        java {
            srcDir("src/main/kotlin")
        }
    }
}

tasks {
    // ── ANTLR generateGrammarSource 태스크 설정 ──
    named<AntlrTask>("generateGrammarSource") {
        // 1) .g4 파일이 있는 디렉터리 지정
        source = fileTree("src/main/antlr") {
            include(
                "oracle/*.g4"      // Oracle Combined Grammar (PlSql.g4)
            )
        }

        // 2) ANTLR 컴파일러 옵션: Visitor 생성 + 패키지 지정
        arguments = listOf(
            "-visitor",
            "-package", "com.github.frostycityman.inlinesqlcommentor.sql.parser.generated"
        )

        // 3) 생성된 Java 코드를 저장할 위치
        outputDirectory = file("src/main/kotlin/com/github/frostycityman/inlinesqlcommentor/sql/parser/generated")

    }

    wrapper {
        gradleVersion = providers.gradleProperty("gradleVersion").get()
        distributionType = Wrapper.DistributionType.ALL
    }

    publishPlugin {
        dependsOn(patchChangelog)
    }
}

intellijPlatform {
    pluginConfiguration {
        name = providers.gradleProperty("pluginName")
        version = providers.gradleProperty("pluginVersion")

        description = providers.fileContents(layout.projectDirectory.file("README.md"))
            .asText.map { text ->
                val start = "<!-- Plugin description -->"
                val end = "<!-- Plugin description end -->"
                val lines = text.lines()
                if (!lines.containsAll(listOf(start, end))) {
                    throw GradleException(
                        "Plugin description section not found in README.md:\n$start ... $end"
                    )
                }
                lines.subList(lines.indexOf(start) + 1, lines.indexOf(end))
                    .joinToString("\n")
                    .let(::markdownToHTML)
            }

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
        privateKey = providers.environmentVariable("PRIVATE_KEY")
        password = providers.environmentVariable("PRIVATE_KEY_PASSWORD")
    }

    publishing {
        token = providers.environmentVariable("PUBLISH_TOKEN")
        channels = providers.gradleProperty("pluginVersion").map { ver ->
            listOf(ver.substringAfter('-', "").substringBefore('.').ifEmpty { "default" })
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
            xml { onCheck = true }
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
