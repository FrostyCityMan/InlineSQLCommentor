package com.github.frostycityman.inlinesqlcommentor.action

import com.github.frostycityman.inlinesqlcommentor.sql.SqlCommentInjector
import com.github.frostycityman.inlinesqlcommentor.sql.ColumnCommentProvider
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.editor.Document
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.psi.PsiDocumentManager
import com.intellij.psi.PsiFile

/**
 * SQL 주석 삽입 액션 엔트리포인트
 */
class MyPluginAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        val project = e.project ?: return
        val editor: Editor = FileEditorManager.getInstance(project).selectedTextEditor ?: return
        val document: Document = editor.document
        val psiFile: PsiFile = PsiDocumentManager.getInstance(project).getPsiFile(document) ?: return

        // Ensure latest document state
        PsiDocumentManager.getInstance(project).commitDocument(document)

        // 주석 제공자와 인젝터 생성
        val provider = ColumnCommentProvider()
        val injector = SqlCommentInjector(provider)

        // WriteCommandAction으로 안전하게 문서 수정
        WriteCommandAction.runWriteCommandAction(project) {
            injector.injectComments(psiFile, document)
        }
    }
}
