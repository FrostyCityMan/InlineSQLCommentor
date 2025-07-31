package com.github.frostycityman.inlinesqlcommentor.sql.injector

import com.github.frostycityman.inlinesqlcommentor.sql.parser.ColumnCommentVisitor
import com.github.frostycityman.inlinesqlcommentor.sql.parser.CommentInsertionInfo
import com.github.frostycityman.inlinesqlcommentor.sql.parser.TableInfo
import com.github.frostycityman.inlinesqlcommentor.sql.parser.TableNameVisitor
import com.github.frostycityman.inlinesqlcommentor.sql.provider.ColumnCommentProvider
import kotlin.collections.associate

import kotlin.collections.sortByDescending

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
        // --- 1. 정보 수집 단계 ---
        // 각 Visitor는 이제 구조화된 정보 객체 리스트를 반환합니다.
        val columnVisitor = ColumnCommentVisitor()       // parseColumns가 List<CommentInsertionInfo>를 반환한다고 가정
        val tableNameVisitor = TableNameVisitor()

        val tableInfos: Set<TableInfo> = tableNameVisitor.parseTableNames(sql)
        val columnInfos: MutableList<CommentInsertionInfo> = columnVisitor.parseColumns(sql).toMutableList()

        if (columnInfos.isEmpty()) {
            return sql // 처리할 컬럼이 없으면 즉시 반환
        }

        // --- 2. 정보 가공 단계 ---
        // TableInfo 리스트를 사용하여 '별칭 -> 실제 테이블 이름' 조회 맵을 생성합니다.
        // 이것이 이 로직의 가장 핵심적인 개선점입니다.
        val aliasToRealNameMap = tableInfos.associate { info ->
            // 별칭이 있으면 (별칭 -> 테이블명), 없으면 (테이블명 -> 테이블명)으로 매핑
            (info.alias ?: info.tableName) to info.tableName
        }

        // --- 3. 코멘트 삽입 단계 ---
        val commentedSqlBuilder = StringBuilder(sql)

        // 인덱스가 꼬이지 않도록 뒤에서부터 수정
        columnInfos.sortByDescending { it.insertionIndex }

        columnInfos.forEach { colInfo ->
            // colInfo의 테이블 별칭을 사용해 실제 테이블 이름을 맵에서 찾습니다.
            val realTableName = if (colInfo.tableAlias != null) {
                aliasToRealNameMap[colInfo.tableAlias]
            } else if (aliasToRealNameMap.size == 1) {
                // SELECT ID FROM USERS 같은 단일 테이블, 별칭 없는 쿼리 지원
                aliasToRealNameMap.values.first()
            } else {
                null // 테이블을 특정할 수 없는 경우
            }

            if (realTableName != null) {
                // 정확하게 찾아낸 실제 테이블 이름으로 코멘트를 조회합니다.
                val comment = commentProvider.getColumnComment(realTableName, colInfo.columnName)
                comment?.let {
                    commentedSqlBuilder.insert(colInfo.insertionIndex + 1, " /* $it */")
                }
            }
        }

        return commentedSqlBuilder.toString()
    }
}
