package com.github.frostycityman.inlinesqlcommentor.startup

import com.intellij.openapi.diagnostic.thisLogger
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity

class MyProjectActivity : ProjectActivity {

    override suspend fun execute(project: Project) {
        thisLogger().warn("`plugin.xml`에 해당 등록 항목으로 모든 필요없는 샘플 코드 파일을 제거하는 것을 잊지 마십시오.")
    }
}
