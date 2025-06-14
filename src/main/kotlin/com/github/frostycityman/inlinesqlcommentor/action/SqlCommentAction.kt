package com.github.frostycityman.inlinesqlcommentor.action

import com.github.frostycityman.inlinesqlcommentor.sql.injector.SqlCommentInjector
import com.github.frostycityman.inlinesqlcommentor.sql.provider.ColumnCommentProvider
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.ui.Messages

class SqlCommentAction : AnAction("Insert Column Comments") {

    override fun actionPerformed(e: AnActionEvent) {
        val editor = e.getData(com.intellij.openapi.actionSystem.CommonDataKeys.EDITOR)
        val project = e.project

        if (editor != null && project != null) {
            val selectedText = editor.selectionModel.selectedText
            if (!selectedText.isNullOrBlank()) {
                val injector = SqlCommentInjector(ColumnCommentProvider())
                val commentedSql = injector.injectComments(selectedText)

                WriteCommandAction.runWriteCommandAction(project) {
                    replaceSelectedText(editor, commentedSql)
                }
            } else {
                Messages.showMessageDialog(project, "SQL을 먼저 선택해 주세요.", "경고", Messages.getWarningIcon())
            }
        }
    }

    private fun replaceSelectedText(editor: Editor, text: String) {
        val document = editor.document
        val selectionModel = editor.selectionModel
        document.replaceString(selectionModel.selectionStart, selectionModel.selectionEnd, text)
        selectionModel.removeSelection()
    }
}
