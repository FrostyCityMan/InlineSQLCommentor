package com.github.frostycityman.inlinesqlcommentor.action

import com.github.frostycityman.inlinesqlcommentor.sql.SqlCommentInjector
import com.github.frostycityman.inlinesqlcommentor.sql.ColumnCommentProvider
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.editor.Document
import com.intellij.openapi.fileEditor.FileEditorManager
import com.intellij.psi.PsiDocumentManager

class MyPluginAction : AnAction() {
  override fun actionPerformed(e: AnActionEvent) {
    val project = e.project ?: return
    val editor = FileEditorManager.getInstance(project).selectedTextEditor ?: return
    val document: Document = editor.document
    val psiFile = PsiDocumentManager.getInstance(project).getPsiFile(document) ?: return

    // 문서 커밋
    PsiDocumentManager.getInstance(project).commitDocument(document)

    val provider = ColumnCommentProvider()
    val injector = SqlCommentInjector(provider)

    // 안전한 쓰기 작업
    WriteCommandAction.runWriteCommandAction(project) {
      injector.injectComments(psiFile, document)
    }
  }
}
