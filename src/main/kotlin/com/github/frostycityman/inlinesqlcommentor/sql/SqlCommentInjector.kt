package com.github.frostycityman.inlinesqlcommentor.sql

import com.intellij.openapi.editor.Document
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.sql.psi.SqlReferenceExpression

class SqlCommentInjector(private val commentProvider: ColumnCommentProvider) {
    fun injectComments(psiFile: PsiFile, document: Document) {
        val elements = PsiTreeUtil.collectElements(psiFile) {
            it is SqlReferenceExpression && commentProvider.getComment(it.text) != null
        }

        val lineToColumns = mutableMapOf<Int, MutableList<Pair<String, String>>>()

        for (element in elements) {
            val lineNumber = document.getLineNumber(element.textOffset)
            val column = element.text
            val comment = commentProvider.getComment(column) ?: continue
            lineToColumns.getOrPut(lineNumber) { mutableListOf() }.add(column to comment)
        }

        for ((lineNumber, columns) in lineToColumns.entries.sortedByDescending { it.key }) {
            val lineStart = document.getLineStartOffset(lineNumber)
            val lineEnd = document.getLineEndOffset(lineNumber)
            val originalLine = document.getText().substring(lineStart, lineEnd).trim()

            val transformedLines = columns.mapIndexed { idx, (col, comment) ->
                val prefix = if (idx == 0) originalLine else ""
                "$prefix $col -- $comment"
            }

            val newText = transformedLines.joinToString(separator = "\n")
            document.replaceString(lineStart, lineEnd, newText)
        }
    }
}
