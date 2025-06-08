package com.github.frostycityman.inlinesqlcommentor.injector

import com.github.frostycityman.inlinesqlcommentor.parser.ColumnCommentVisitor
import com.github.frostycityman.inlinesqlcommentor.provider.ColumnCommentProvider

class SqlCommentInjector(
    private val commentProvider: ColumnCommentProvider
) {
    fun injectComments(sql: String): String {
        val visitor = ColumnCommentVisitor()
        val columns = visitor.parseColumns(sql)

        val sb = StringBuilder(sql)
        columns.forEach { column ->
            val comment = commentProvider.getComment("UNKNOWN", column) ?: return@forEach
            val idx = sb.indexOf(column)
            if (idx >= 0) {
                sb.insert(idx + column.length, " -- $comment")
            }
        }
        return sb.toString()
    }
}
