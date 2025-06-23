package com.github.frostycityman.inlinesqlcommentor.sql.injector

import com.github.frostycityman.inlinesqlcommentor.sql.parser.ColumnCommentVisitor
import com.github.frostycityman.inlinesqlcommentor.sql.provider.ColumnCommentProvider

class SqlCommentInjector(
    private val commentProvider: ColumnCommentProvider
) {

    fun injectComments(sql: String): String {
        val visitor = ColumnCommentVisitor()
        val columns = visitor.parseColumns(sql) //컬럼 추출
        var commentedSql = sql

        columns.forEach { col ->
            commentProvider.getComment(col, "TEST")?.let { comment ->
                commentedSql = commentedSql.replace(col, "$col /* $comment */")
            }
        }

        return commentedSql
    }
}
