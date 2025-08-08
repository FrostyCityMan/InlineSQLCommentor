package com.github.frostycityman.inlinesqlcommentor.sql.parser

import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlLexer
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlParser
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlParserBaseVisitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.RuleContext

/**
 * SQL을 수정하는 데 필요한 정보를 담는 데이터 클래스.
 *
 * @param columnName 코멘트 조회를 위한 순수 컬럼 이름 (예: "USER_ID")
 * @param tableAlias SELECT 절에서 사용된 테이블 별칭 (예: "T1"). 없으면 null.
 * @param insertionIndex 코멘트가 삽입될 위치 (원본 SQL 문자열 기준).
 */
data class CommentInsertionInfo(
    val columnName: String,
    val tableAlias: String?, // FROM 절과 매핑하기 위한 키
    val insertionIndex: Int
)

/**
 * 파싱된 컬럼의 상세 정보를 담는 클래스
 * @property columnName 컬럼의 이름 (예: "user_name")
 * @property tableName 컬럼이 속한 테이블의 이름 또는 에일리어스 (예: "users", "u")
 */
data class ColumnInfos(
    val columnName: String,
    val tableName: String?
)

data class ColumnInfo(
    val name: String,           // 컬럼명
    val tableAlias: String?     // 테이블 별칭 (없다면 null)
)

/**
 * 파싱된 테이블의 상세 정보를 담는 클래스
 * @property tableName 실제 테이블 이름 (예: "users")
 * @property alias 테이블의 에일리어스(별칭) (예: "u"). 에일리어스가 없으면 null.
 */
data class TableInfos(
    val tableName: String,
    val alias: String?
)


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

    // 최종 목표: 코멘트를 삽입할 위치와 컬럼 정보 목록
    val insertionInfos = mutableListOf<CommentInsertionInfo>()


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
            val expression = element.expression() ?: return@forEach

            // expression에서 테이블 별칭과 실제 컬럼명을 추출합니다.
            val (tableAlias, columnName) =
                extractAliasAndColumn(expression) ?: (null to expression.text)

            // 별칭이 존재하면 별칭 이후에 주석을 삽입하고, 그렇지 않으면 표현식 뒤에 삽입합니다.
            val stopIndex = element.column_alias()?.stop?.stopIndex ?: expression.stop.stopIndex

            insertionInfos.add(
                CommentInsertionInfo(
                    columnName = columnName,
                    tableAlias = tableAlias,
                    insertionIndex = stopIndex
                )
            )
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
    fun parseColumns(sql: String): List<CommentInsertionInfo> {
        insertionInfos.clear()


        val lexer = PlSqlLexer(CharStreams.fromString(sql))
        val tokens = CommonTokenStream(lexer)
        val parser = PlSqlParser(tokens)

        // SQL 문법 트리를 방문하여 컬럼 수집
        visit(parser.sql_script())

        // 수집된 컬럼 리스트를 외부에 복사본으로 제공
        return insertionInfos
    }

    /**
     * expression의 내부 트리를 탐색하여 테이블 별칭과 컬럼 이름을 추출합니다.
     * @return Pair(tableAlias, columnName) 또는 추출 실패 시 null.
     */
    private fun extractAliasAndColumn(expression: PlSqlParser.ExpressionContext): Pair<String?, String>? {
        try {
            // 변수 타입을 ParseTree 대신 RuleContext로 변경하여 타입 불일치 오류를 해결합니다.
            var current: RuleContext = expression

            // expression의 가장 깊은 곳까지 한 단계씩 탐색해 내려갑니다.
            // 자식이 하나뿐인 노드는 의미있는 정보가 아닌 중간 단계일 확률이 높습니다.
            while (current.childCount == 1) {
                // getChild()의 반환 타입은 ParseTree이지만, RuleContext는 ParseTree의 자식이므로
                // 이 탐색에서는 문제가 되지 않습니다. 다만, 다음 할당을 위해 캐스팅이 필요할 수 있습니다.
                val child = current.getChild(0)
                if (child is RuleContext) {
                    current = child
                } else {
                    // 더 이상 RuleContext가 아니면 탐색 중단
                    break
                }
            }

            // 가장 깊은 곳에 도달한 노드가 일반적인 요소(general_element)인지 확인합니다.
            // 이 경로는 실제 사용하는 PL/SQL 문법(.g4 파일)에 따라 달라질 수 있습니다.
            if (current is PlSqlParser.General_elementContext) {
                // general_element는 보통 id_expression의 연속으로 구성됩니다.
                // 예: T1.ID -> id_expression("T1"), id_expression("ID")
                val idParts = current.general_element_part().map { it.id_expression().text }

                if (idParts.isNotEmpty()) {
                    val columnName = idParts.last()
                    // id_parts가 ["T1", "ID"] 라면, 별칭은 "T1", 컬럼은 "ID" 입니다.
                    val tableAlias = if (idParts.size > 1) idParts.getOrNull(idParts.size - 2) else null
                    return Pair(tableAlias, columnName)
                }
            }
        } catch (e: Exception) {
            // 복잡한 표현식(함수, 리터럴 등)을 파싱하려다 실패할 경우 null을 반환하여 건너뜁니다.
            return null
        }

        // 간단한 컬럼명/별칭 구조가 아닌 경우 (예: 함수 호출, 리터럴 등)
        return null
    }
}
