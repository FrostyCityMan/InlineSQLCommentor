package com.github.frostycityman.inlinesqlcommentor.sql.parser

import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlLexer
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlParser
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlParserBaseVisitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

/**
 * Oracle PL/SQL 쿼리의 SELECT 또는 INSERT 문으로부터 컬럼명을 추출하는 방문자(Visitor) 클래스입니다.
 *
 * ANTLR을 사용하여 파싱된 SQL 구문 트리를 순회하며,
 * - SELECT 절의 컬럼 리스트
 * - INSERT 절의 컬럼 리스트
 * 로부터 명시된 컬럼명을 수집합니다.
 *
 * 컬럼 주석 자동 삽입과 같은 기능에서 사용되며,
 * 실제 컬럼명뿐 아니라 SELECT 절 내 alias도 수집 대상에 포함됩니다.
 *
 * @constructor 기본 생성자는 내부적으로 수집된 컬럼 리스트를 초기화합니다.
 */
class ColumnCommentVisitor : PlSqlParserBaseVisitor<Unit>() {

    // 추출된 컬럼명을 저장하는 리스트
    private val columns = mutableListOf<String>()

    /**
     * SELECT 절에서 컬럼 리스트(`SELECT col1, col2 AS alias2 ...`)를 순회하며
     * 각 컬럼 혹은 별칭(alias)를 컬럼 리스트에 추가합니다.
     *
     * @param ctx SELECT 절의 `selected_list` 파싱 컨텍스트
     */
    override fun visitSelected_list(ctx: PlSqlParser.Selected_listContext) {
        ctx.select_list_elements().forEach { element ->
            // 별칭(alias)이 명시된 경우 해당 이름을 저장
            if (element.column_alias() != null) {
                columns += element.column_alias().identifier().text
            }
            // 별칭이 없고 직접 식(expression)인 경우 원문 텍스트를 저장
            else if (element.expression() != null) {
                columns += element.expression().text
            }
        }

        // 하위 노드 탐색을 위해 부모 클래스의 visit 호출
        super.visitSelected_list(ctx)
    }

    /**
     * INSERT INTO 문에서 명시된 컬럼 리스트(`INSERT INTO table (col1, col2)`)를 추출합니다.
     *
     * @param ctx INSERT 문의 `column_list` 파싱 컨텍스트
     */
    override fun visitColumn_list(ctx: PlSqlParser.Column_listContext?) {
        ctx?.column_name()?.forEach { element ->
            columns += element.identifier().text
        }

        return super.visitColumn_list(ctx)
    }

    /**
     * 주어진 SQL 문자열을 파싱하여 컬럼명을 추출합니다.
     * - SELECT 문: SELECT 절 내 컬럼 또는 alias
     * - INSERT 문: INSERT 절 내 컬럼
     *
     * @param sql 파싱 대상 SQL 문자열
     * @return 추출된 컬럼명 리스트
     */
    fun parseColumns(sql: String): List<String> {
        val lexer = PlSqlLexer(CharStreams.fromString(sql))
        val tokens = CommonTokenStream(lexer)
        val parser = PlSqlParser(tokens)

        // SQL 문법 트리를 방문하여 컬럼 수집
        visit(parser.sql_script())

        // 수집된 컬럼 리스트를 외부에 복사본으로 제공
        return columns.toList()
    }

    /**
     * 디버깅 또는 독립 실행 테스트용 main 함수
     */
    fun main() {
        println("Hello, Kotlin!")
    }
}
