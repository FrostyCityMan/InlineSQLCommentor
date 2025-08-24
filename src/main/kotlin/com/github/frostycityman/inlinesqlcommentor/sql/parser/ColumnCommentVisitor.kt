package com.github.frostycityman.inlinesqlcommentor.sql.parser

import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlLexer
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlParser
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlParserBaseVisitor
import groovyjarjarantlr.ParseTree
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
            // 기본 삽입 위치는 expression의 끝
            val expr = element.expression() ?: return@forEach
            var stopIndex = expr.stop.stopIndex

            // alias가 있다면 alias 토큰 뒤로 삽입 위치를 조정
            if (element.column_alias() != null) {
                stopIndex = element.column_alias().stop.stopIndex
            }

            // expression으로부터 테이블 별칭과 실제 컬럼명을 추출
            val extracted = extractAliasAndColumn(expr)

            // 단순 컬럼 참조(T1.COL 또는 COL)인 경우에만 코멘트 대상에 포함
            if (extracted != null) {
                val (tableAlias, realColumnName) = extracted

                insertionInfos.add(
                    CommentInsertionInfo(
                        columnName = realColumnName,
                        tableAlias = tableAlias,
                        insertionIndex = stopIndex
                    )
                )
            }
        }
//  columns.add(ColumnInfo(name = columnName, tableAlias = tableAlias))
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
        // 1) 우선: 파스트리 기반(General_element)으로 안전하게 시도
        try {
            var current: RuleContext = expression
            while (current.childCount == 1) {
                val child = current.getChild(0)
                if (child is RuleContext) {
                    current = child
                } else {
                    break
                }
            }
            if (current is PlSqlParser.General_elementContext) {
                var test =  current.general_element().text
                println("test = ${test}")
                val idParts = current.general_element_part().mapNotNull { part ->
                    try { part.id_expression().text } catch (_: Exception) { null }
                }
                if (idParts.isNotEmpty()) {
                    // 요구사항: current.general_element().text 는 tableAlias, current.general_element_part() 는 컬럼
                    val columnName = idParts.last().trim('"', '`')
                    val aliasRaw = try { current.general_element().text } catch (_: Exception) { null }
                    var tableAlias = aliasRaw?.trim('"', '`')
                    // tableAlias가 'SCHEMA.USERS.ID' 같은 형태일 수 있으므로 컬럼 꼬리를 제거
                    if (!tableAlias.isNullOrBlank() && tableAlias.contains('.')) {
                        val lastDot = tableAlias.lastIndexOf('.')
                        if (lastDot >= 0) {
                            val tail = tableAlias.substring(lastDot + 1)
                            if (tail.equals(columnName, ignoreCase = true)) {
                                tableAlias = tableAlias.substring(0, lastDot)
                            }
                        }
                    }
                    // 컬럼만 있는 경우(tableAlias와 column이 동일하거나 alias가 비어있음)에는 별칭 없음으로 처리
                    if (tableAlias.isNullOrBlank() || tableAlias.equals(columnName, ignoreCase = true)) {
                        tableAlias = null
                    }
                    return Pair(tableAlias, columnName)
                }
            }
        } catch (_: Exception) {
            // 무시하고 텍스트 기반 폴백으로 진행
        }

        // 2) 폴백: 순수한 식별자(따옴표/백틱 허용)와 점(.)만으로 구성된 단순 컬럼 참조만 인식
        val text = expression.text

        // 공백이나 연산자/괄호 등의 문자가 섞여 있으면 복잡 표현식으로 간주하고 스킵
        val allowedOnly = Regex("^[A-Za-z0-9_$#.`\"]+(?:\\.[A-Za-z0-9_$#.`\"]+)*").matchEntire(text) != null
        if (!allowedOnly) return null

        // 토큰화: "id" 또는 `id` 또는 식별자
        val tokenRegex = Regex("\"([^\"]+)\"|`([^`]+)`|([A-Za-z_][A-Za-z0-9_$#]*)")
        val parts = tokenRegex.findAll(text).map { m ->
            m.groups[1]?.value ?: m.groups[2]?.value ?: m.groups[3]?.value ?: ""
        }.filter { it.isNotEmpty() }.toList()

        if (parts.isEmpty()) return null

        // 텍스트가 토큰과 점(.)만으로 이루어졌는지 추가 확인 (안전성 향상)
        val scrubbed = text.replace(tokenRegex, "").replace(".", "")
        if (scrubbed.isNotEmpty()) return null

        val columnName = parts.last()
        val tableAlias = if (parts.size >= 2) parts[parts.size - 2] else null
        return Pair(tableAlias, columnName)
    }
}
