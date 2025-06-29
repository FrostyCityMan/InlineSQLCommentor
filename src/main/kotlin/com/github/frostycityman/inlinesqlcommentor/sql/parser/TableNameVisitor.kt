package com.github.frostycityman.inlinesqlcommentor.sql.parser

import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlLexer
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlParser
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlParserBaseVisitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree

/**
 * SQL 쿼리에서 추출된 단일 테이블의 정보를 나타냅니다.
 *
 * @property tableName 테이블의 이름 (예: "EMPLOYEES").
 * @property alias 테이블에 할당된 별칭(alias), 없는 경우 null (예: "e" in "FROM EMPLOYEES e").
 * @property context 테이블이 발견된 SQL 문맥 (예: "FROM_CLAUSE", "INSERT_INTO", "UPDATE_TABLE").
 */
data class TableInfo(
    val tableName: String,
    val alias: String? = null,
    val context: String
)

/**
 * PL/SQL 스크립트의 ANTLR 파스 트리를 순회하여 모든 테이블 이름을 추출하는 Visitor 클래스입니다.
 *
 * 이 클래스는 **"아래에서 위로(Bottom-up)"** 접근 방식을 사용합니다.
 * 즉, 상위 레벨의 구문(예: `UPDATE` 문)에서 아래로 탐색하는 대신,
 * 가장 구체적인 노드인 `tableview_name`(테이블 이름)을 먼저 찾은 다음,
 * 부모 노드를 거슬러 올라가며 해당 테이블이 어떤 문맥(FROM 절, UPDATE 문 등)에 속해 있는지 파악합니다.
 * 이 방식은 복잡하고 다양한 SQL 문법 구조에 훨씬 더 견고하고 유연하게 대처할 수 있습니다.
 *
 * @see PlSqlParserBaseVisitor
 */
class TableNameVisitor : PlSqlParserBaseVisitor<Unit>() {

    /** 추출된 테이블 정보를 중복 없이 저장하는 Set */
    val extractedTables = mutableSetOf<TableInfo>()

    /**
     * SQL 스크립트 방문의 시작점입니다.
     * 스크립트는 여러 개의 독립적인 구문(unit_statement)으로 구성될 수 있습니다.
     *
     * @param ctx `sql_script` 규칙에 대한 컨텍스트.
     */
    override fun visitSql_script(ctx: PlSqlParser.Sql_scriptContext): Unit {
        // SQL 스크립트는 하나 이상의 'unit_statement'로 구성되므로, 각각을 모두 방문해야 합니다.
        ctx.unit_statement()?.forEach { visit(it) }
    }

    /**
     * `tableview_name` 노드를 방문할 때마다 호출됩니다. 이 메소드가 추출 로직의 핵심입니다.
     *
     * 파스 트리에서 테이블 이름이 발견될 때마다 이 메소드가 실행됩니다.
     * 그런 다음, 부모 노드를 재귀적으로 검사하여 이 테이블이 사용된 SQL 문맥을 결정합니다.
     *
     * @param ctx `tableview_name` 규칙에 대한 컨텍스트로, 테이블 이름을 직접 포함합니다.
     */
    override fun visitTableview_name(ctx: PlSqlParser.Tableview_nameContext): Unit {
        // 컨텍스트에서 테이블 이름의 원시 텍스트를 추출합니다.
        val tableName = ctx.text
        // 별칭과 문맥을 저장할 변수를 초기화합니다.
        var alias: String? = null
        var context = "UNKNOWN" // 기본값은 "알 수 없음"

        // 현재 노드의 부모에서부터 '아래에서 위로' 탐색을 시작합니다.
        var parent: ParseTree? = ctx.parent
        // 파스 트리의 최상단에 도달하거나, 문맥을 찾을 때까지 부모 노드를 계속 따라 올라갑니다.
        while (parent != null) {
            // 부모 노드의 타입에 따라 문맥을 결정합니다.
            when (parent) {
                // 부모가 WITH 절(Subquery_factoring_clause)인 경우: CTE의 원본 테이블.
                // 이 문맥은 일반적인 FROM 절보다 더 구체적이므로 먼저 확인합니다.
                is PlSqlParser.Subquery_factoring_clauseContext -> {
                    context = "CTE_SOURCE_TABLE" // "WITH 절에서 사용된 원본 테이블"로 문맥 설정

                    // 이 테이블의 별칭(alias)을 찾기 위해 다시 부모 노드를 탐색합니다.
                    // 현재 테이블(ctx)에서 시작하여 WITH 절 컨텍스트를 벗어나기 전까지만 찾습니다.
                    var p: ParseTree? = ctx.parent
                    while (p != null && p !is PlSqlParser.Subquery_factoring_clauseContext) {
                        if (p is PlSqlParser.Table_ref_auxContext) {
                            alias = p.table_alias()?.identifier()?.text
                            break // 가장 가까운 별칭을 찾았으므로 탐색 중단
                        }
                        p = p.parent
                    }
                    break // 문맥을 찾았으므로 외부 while 루프를 중단합니다.
                }

                // 부모가 FROM 또는 JOIN 절의 테이블 참조(Table_ref_aux)인 경우
                is PlSqlParser.Table_ref_auxContext -> {
                    context = "FROM_CLAUSE"
                    // 별칭은 Table_ref_auxContext의 직접적인 자식이므로 바로 가져올 수 있습니다.
                    alias = parent.table_alias()?.identifier()?.text
                    break
                }

                // 부모가 UPDATE 문인 경우
                is PlSqlParser.Update_statementContext -> {
                    context = "UPDATE_TABLE"
                    break
                }

                // 부모가 DELETE 문인 경우
                is PlSqlParser.Delete_statementContext -> {
                    context = "DELETE_FROM"
                    break
                }

                // 부모가 INSERT 문인 경우
                is PlSqlParser.Insert_statementContext -> {
                    context = "INSERT_INTO"
                    break
                }
            }
            // 다음 상위 부모 노드로 이동합니다.
            parent = parent.parent
        }

        // 수집된 테이블 정보(이름, 별칭, 문맥)를 결과 Set에 추가합니다.
        extractedTables.add(TableInfo(tableName, alias, context))

        // 기본 Visitor 동작을 계속합니다 (tableview_name은 자식이 거의 없어 큰 의미는 없음).
        super.visitTableview_name(ctx)
    }

    /**
     * 주어진 SQL 문자열을 파싱하고 모든 테이블 정보를 추출하는 메인 공개 메소드입니다.
     *
     * @param sql 파싱할 SQL 스크립트 문자열.
     * @return 스크립트에서 발견된 고유한 `TableInfo` 객체들의 Set.
     */
    fun parseTableNames(sql: String): Set<TableInfo> {
        // 새로운 파싱 작업을 시작하기 전에 이전 결과를 모두 지웁니다.
        extractedTables.clear()

        // ANTLR PL/SQL 문법은 대소문자를 구분하지 않지만, 대문자로 변환하여 처리할 때 가장 안정적으로 동작합니다.
        val upperCaseSql = sql.uppercase()

        // ANTLR의 표준 처리 절차: Lexer -> Token Stream -> Parser 생성
        val lexer = PlSqlLexer(CharStreams.fromString(upperCaseSql))
        val tokens = CommonTokenStream(lexer)
        val parser = PlSqlParser(tokens)

        // 파스 트리의 루트 규칙('sql_script')부터 Visitor 순회를 시작합니다.
        visit(parser.sql_script())

        // 추출된 테이블 정보가 담긴 Set을 반환합니다.
        return extractedTables
    }
}
