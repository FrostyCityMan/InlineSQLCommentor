package com.github.frostycityman.inlinesqlcommentor.action

//import com.github.frostycityman.inlinesqlcommentor.injector.SqlCommentInjector
import com.github.frostycityman.inlinesqlcommentor.injector.SqlCommentInjector
import com.github.frostycityman.inlinesqlcommentor.provider.DummyColumnCommentProvider
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.command.WriteCommandAction

class AutoCommentAction : AnAction("자동 주석 삽입") {

    override fun actionPerformed(event: AnActionEvent) {
        val project = event.project ?: return
        val editor = event.getData(CommonDataKeys.EDITOR) ?: return
        val document = editor.document
        val sql = document.text

        val injector = SqlCommentInjector(DummyColumnCommentProvider())
        val sqlWithComments = injector.injectComments(sql)

        WriteCommandAction.runWriteCommandAction(project) {
            document.setText(sqlWithComments)
        }
    }
}
