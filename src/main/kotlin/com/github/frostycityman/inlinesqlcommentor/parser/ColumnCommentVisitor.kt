package com.github.frostycityman.inlinesqlcommentor.parser
//
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlLexer
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlParser
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlParserBaseVisitor
import groovyjarjarantlr4.v4.runtime.*
import org.antlr.v4.runtime.CharStream
import org.antlr.v4.runtime.TokenStream

class ColumnCommentVisitor : PlSqlParserBaseVisitor<Unit>() {

    private val columns = mutableListOf<String>()

    override fun visitSelected_list(ctx: PlSqlParser.Selected_listContext) {
        ctx.select_list_elements().forEach { element ->
            element.expression()?.let { expr ->
                expr.logical_expression()?.let { columnCtx ->
                    columns += columnCtx.text
                }

                expr.cursor_expression()?.let { generalCtx ->
                    columns += generalCtx.text
                }
            }
        }
        super.visitSelected_list(ctx)
    }

    fun parseColumns(sql: String): List<String> {
        val lexer = PlSqlLexer(CharStreams.fromString(sql) as CharStream?)
        val tokens = CommonTokenStream(lexer as TokenSource?)
        val parser = PlSqlParser(tokens as TokenStream?)
        visit(parser.sql_script())
        return columns.toList()
    }
}
