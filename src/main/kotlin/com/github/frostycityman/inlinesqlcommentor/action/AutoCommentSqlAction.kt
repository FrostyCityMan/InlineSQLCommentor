package com.github.frostycityman.inlinesqlcommentor.action

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.github.frostycityman.inlinesqlcommentor.sql.provider.DummyColumnCommentProvider

/**
 * IntelliJ Editor에서 SQL 텍스트 위에 “컬럼 주석”을 자동으로 삽입하는 액션.
 * 단축키(Ctrl+Alt+C) 등으로 호출할 수 있습니다.
 */
class AutoCommentSqlAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: return
        val editor  = e.getData(CommonDataKeys.EDITOR) ?: return
        val document = editor.document
        val originalSql = document.text

        // 1) DummyProvider 대신 실제 DB Provider를 주입할 수 있습니다.
        val provider = DummyColumnCommentProvider()
//        val injector = SqlCommentInjector(project, provider)

        // 2) 주석이 삽입된 새로운 SQL 생성
//        val newSql = injector.injectComments(originalSql)

        // 3) 문서 수정은 WriteCommandAction 내에서 수행해야 합니다.
//        WriteCommandAction.runWriteCommandAction(project) {
//            document.setText(newSql)
//        }
    }
}
