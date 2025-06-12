package com.github.frostycityman.inlinesqlcommentor.sql.parser

import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlLexer
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlParserBaseVisitor
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream


/**
 * SELECT 절의 각 컬럼 식별자를 수집하는 방문자(Visitor).
 * MySqlParser를 기준으로 했지만, PostgreSQL이나 Oracle도 유사하게 구현할 수 있습니다.
 */
/**
 * PL/SQL SELECT 절에서 컬럼 이름을 수집하는 Visitor
 * gen/oracle 디렉터리의 기본 패키지에 생성된 ANTLR 클래스를 사용합니다.
 */
class ColumnCommentVisitor : PlSqlParserBaseVisitor<Unit>() {
    private val columns = mutableListOf<String>()

    /**
     * SELECT 문(statement) 노드를 방문하여, select_list 안의 column_name과 general_element를 수집
     */
    override fun visitSelected_list(ctx: PlSqlParser.Selected_listContext) {
        ctx.select_list_elements().forEach { element ->
            element.expression()?.let { expr ->
                element.column_alias()?.let { colCtx ->
                    columns += colCtx.text
                }

            }
        }
        super.visitSelected_list(ctx)
    }

    /**
     * 주어진 SQL을 파싱하여 컬럼명을 추출
     */
    fun parseColumns(sql: String): List<String> {
        val lexer = PlSqlLexer(CharStreams.fromString(sql))
        val tokens = CommonTokenStream(lexer)
        val parser = PlSqlParser(tokens)
        visit(parser.sql_script())
        return columns.toList()
    }

    fun main() {
        println("Hello, Kotlin!")
    }

}
