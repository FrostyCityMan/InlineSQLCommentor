package com.github.frostycityman.inlinesqlcommentor.sql.parser

import ai.grazie.utils.text
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlLexer
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlParserBaseVisitor
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlParser
import com.jetbrains.rd.util.string.println
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
     * SELECT 문의 select_list 노드를 방문하여, 각 요소(expression)의 텍스트를 컬럼 리스트에 추가합니다.
     * 별칭(alias)이 있는 경우 별칭을 사용하고, 별칭이 없으면 expression의 원본 텍스트를 사용합니다.
     */
    override fun visitSelected_list(ctx: PlSqlParser.Selected_listContext) {
        var ctxText = ctx.select_list_elements(2).text
        println("ctx = ${ctxText}")
        ctx.select_list_elements().forEach { element ->
            // 컬럼에 별칭(alias)이 지정된 경우 별칭 이름을 추가
            if (element.column_alias() != null) {
                columns += element.column_alias().identifier().text
            }
            // 별칭이 없는 일반 표현식은 원본 텍스트를 추가
            else if (element.expression() != null) {
                columns += element.expression().text
            }
        }
        // 부모 클래스의 방문 메소드를 호출하여 추가 탐색을 진행
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
