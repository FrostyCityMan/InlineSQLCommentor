package com.github.frostycityman.inlinesqlcommentor

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.util.TextRange
import com.intellij.psi.PsiDocumentManager
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.sql.psi.SqlFile
import com.intellij.sql.psi.SqlIdentifier

class MyPluginAction : AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        val project: Project = e.project ?: return
        val editor: Editor = FileEditorManager.getInstance(project).selectedTextEditor ?: return
        val document = editor.document
        val psiFile = PsiDocumentManager.getInstance(project).getPsiFile(document) as? SqlFile ?: return

        val identifiers = PsiTreeUtil.collectElementsOfType(psiFile, SqlIdentifier::class.java)

        WriteCommandAction.runWriteCommandAction(project) {
            val sorted = identifiers.sortedByDescending { it.textOffset }
            for (id in sorted) {
                val columnName = id.text
                val comment = getCommentForColumn(columnName) ?: continue

                val offset = id.textRange.endOffset
                document.insertString(offset, " -- $comment")
            }
            PsiDocumentManager.getInstance(project).commitDocument(document)
        }
    }

    private fun getCommentForColumn(columnName: String): String? {
        return when (columnName.lowercase()) {
            "user_id" -> "사용자 고유번호"
            "created_at" -> "생성 시각"
            "status" -> "상태 코드"
            else -> null
        }
    }
}
