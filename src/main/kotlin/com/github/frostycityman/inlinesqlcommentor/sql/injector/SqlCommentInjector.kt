package com.github.frostycityman.inlinesqlcommentor.sql.injector

import com.github.frostycityman.inlinesqlcommentor.sql.parser.ColumnCommentVisitor
import com.github.frostycityman.inlinesqlcommentor.sql.parser.TableNameVisitor
import com.github.frostycityman.inlinesqlcommentor.sql.provider.ColumnCommentProvider

/**
 * SQL 문자열 내 컬럼에 주석을 자동 삽입해주는 인젝터 클래스입니다.
 * 주석 정보는 [ColumnCommentProvider]로부터 조회되며,
 * [ColumnCommentVisitor]를 통해 SQL로부터 컬럼명을 파싱합니다.
 *
 * 예를 들어,
 * ```sql
 * SELECT col1, col2 FROM TEST_TABLE
 * ```
 * 이라는 쿼리를 입력하면 다음과 같이 주석이 삽입됩니다:
 * ```sql
 * SELECT col1 /* 컬럼설명 */, col2 /* 컬럼설명 */ FROM TEST_TABLE
 * ```
 *
 * 현재는 `TEST_TABLE`이라는 하드코딩된 테이블명을 기준으로 작동합니다.
 *
 * @property commentProvider 컬럼 주석을 제공하는 주석 제공자 구현체
 */
class SqlCommentInjector(
    private val commentProvider: ColumnCommentProvider,
) {

    /**
     * 입력된 SQL 문자열에서 컬럼명을 추출한 뒤,
     * 각 컬럼명 뒤에 해당 컬럼의 주석을 `/* ... */` 형식으로 삽입합니다.
     *
     * @param sql 주석을 삽입할 대상 SQL 문자열
     * @return 컬럼 주석이 삽입된 SQL 문자열
     */
   fun injectComments(sql: String): String {
    val commentVisitor = ColumnCommentVisitor()
    val tableNameVisitor = TableNameVisitor()

    val columns = commentVisitor.parseColumns(sql)
    val tables = tableNameVisitor.parseTableNames(sql)

    val commentedSqlBuilder = StringBuilder(sql)

    // 테이블별 별칭(alias)을 실제 테이블명과 매핑
    val tableAliasMapping = tables.associate { (it.alias ?: it.tableName) to it.tableName }

    // 컬럼 주석 삽입
    columns.forEach { col ->
        val colTableAlias = col.tableAlias ?: return@forEach
        val actualTableName = tableAliasMapping[colTableAlias] ?: return@forEach

        commentProvider.getColumnComment(actualTableName, col.name)?.let { comment ->
            // 여기에 정확한 위치를 찾는 AST 기반 삽입 로직을 사용해야 합니다.
            // 예시 (실제 구현은 AST로부터 얻은 위치 사용):
            val regex = "\\b${Regex.escape(col.name)}\\b".toRegex()
            commentedSqlBuilder.replace(regex) { matchResult ->
                "${matchResult.value} /* $comment */"
            }
        }
    }

    return commentedSqlBuilder.toString()
}

}
