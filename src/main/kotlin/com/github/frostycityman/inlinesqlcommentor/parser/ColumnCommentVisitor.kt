package com.github.frostycityman.inlinesqlcommentor.parser

import plsql.parser.PlSqlLexer
import plsql.parser.PlSqlParser
import plsql.parser.PlSqlParserBaseVisitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

class ColumnCommentVisitor : PlSqlParserBaseVisitor<Unit>() {

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
