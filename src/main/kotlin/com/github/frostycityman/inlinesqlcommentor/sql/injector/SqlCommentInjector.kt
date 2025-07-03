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
        // SQL 내의 모든 컬럼명을 파싱하여 리스트로 추출
        val columns = commentVisitor.parseColumns(sql)

        val tableNames = mutableListOf<String>() // 결과를 담을 빈 리스트 생성

        val tables = tableNameVisitor.parseTableNames(sql)
        for (tableInfo in tables) {
            tableNames.add(tableInfo.tableName) // 각 객체의 tableName을 리스트에 추가
        }

        var commentedSql = sql

        // 각 컬럼에 대해 주석을 조회한 뒤 해당 위치에 주석 삽입
        columns.forEach { col ->
            // 주석 제공자에서 해당 컬럼의 주석을 조회
            commentProvider.getColumnComment(tableNames.get(0), col)?.let { comment ->
                // SQL 문자열 내의 컬럼명을 주석 포함 문자열로 대체
                commentedSql = commentedSql.replace(col, "$col /* $comment */")
            }
        }

        return commentedSql
    }
}
