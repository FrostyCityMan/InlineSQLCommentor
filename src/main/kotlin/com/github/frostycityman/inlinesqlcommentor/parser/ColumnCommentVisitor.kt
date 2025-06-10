package com.github.frostycityman.inlinesqlcommentor.parser
//
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlLexer
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlParser
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlParserBaseVisitor
import groovyjarjarantlr4.v4.runtime.*

abstract class ColumnCommentVisitor : PlSqlParserBaseVisitor<Unit>() {

    private val columns = mutableListOf<String>()

    override fun visitSelected_list(ctx: PlSqlParser.Selected_listContext) {
        ctx.select_list_elements().forEach { element ->
            element.expression()?.let { expr ->
                expr.column_name()?.let { columnCtx ->
                    columns += columnCtx.text
                }

                expr.general_element()?.let { generalCtx ->
                    columns += generalCtx.text
                }
            }
        }
        super.visitSelected_list(ctx)
    }

    fun parseColumns(sql: String): List<String> {
        val lexer = PlSqlLexer(CharStreams.fromString(sql))
        val tokens = CommonTokenStream(lexer)
        val parser = PlSqlParser(tokens)
        visit(parser.sql_script())
        return columns.toList()
    }
}
