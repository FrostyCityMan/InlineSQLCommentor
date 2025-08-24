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

    private val DEBUG: Boolean = (System.getProperty("inlinesql.debug") == "true")

    private fun normalizeKey(id: String): String = id.trim().trim('"', '`').lowercase()

    // 각 파트별로 감싸진 따옴표/백틱을 제거하고 다시 합칩니다. 예: "SCHEMA"."USERS" -> SCHEMA.USERS
    private fun normalizeIdentifierChain(name: String): String =
        name.split('.')
            .map { it.trim().trim('"', '`', '\'', ' ') }
            .filter { it.isNotEmpty() }
            .joinToString(".")

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

        if (columnInfos.isEmpty() && tableInfos.isEmpty()) {
            return sql // 처리할 대상이 없으면 즉시 반환
        }

        // --- 2. 정보 가공 단계 ---
        // TableInfo 리스트를 사용하여 '별칭/테이블명 -> 실제 테이블 이름' 조회 맵을 생성합니다.
        val aliasToRealNameMap = mutableMapOf<String, String>()
        tableInfos.forEach { info ->
            val real = normalizeIdentifierChain(info.tableName)
            // 항상 테이블명 자체로도 키를 등록 (스키마 포함 가능)
            aliasToRealNameMap[normalizeKey(info.tableName)] = real

            // 스키마가 포함된 경우에도 기본 테이블명(마지막 세그먼트)으로 조회가 가능하도록 키를 추가합니다.
            // 예: SCHEMA.USERS -> key: "users"
            val baseKey = real.split('.')
                .lastOrNull()
                ?.trim('"', '`', '\'', ' ')
                ?.lowercase()
            if (!baseKey.isNullOrBlank()) {
                // 이미 동일 키가 있으면 덮어쓰지 않습니다(예상치 못한 충돌 방지)
                aliasToRealNameMap.putIfAbsent(baseKey, real)
            }

            // 별칭이 있으면 별칭으로도 등록
            info.alias?.let { aliasToRealNameMap[normalizeKey(it)] = real }
        }
        if (DEBUG) {
            println("[InlineSQLCommentor][DEBUG] 별명-> 실제 맵 : $aliasToRealNameMap")
        }

        // --- 3. 코멘트 삽입 단계 ---
        val commentedSqlBuilder = StringBuilder(sql)
        val insertions = mutableListOf<Pair<Int, String>>()

        // 3-1. 컬럼 코멘트 삽입 엔트리 수집
        columnInfos.forEach { colInfo ->
            if (DEBUG) {
                println("[InlineSQLCommentor][DEBUG] 열 후보 : 별칭='${colInfo.tableAlias}' name='${colInfo.columnName}' at ${colInfo.insertionIndex}")
            }
            // colInfo의 테이블 별칭을 사용해 실제 테이블 이름을 맵에서 찾습니다.
            val realTableName = if (colInfo.tableAlias != null) {
                // 1차: 그대로 정규화하여 조회
                aliasToRealNameMap[normalizeKey(colInfo.tableAlias)]
                    // 2차: 점(.)이 포함된 경우 마지막 세그먼트로 재조회 (예: SCHEMA.USERS -> USERS)
                    ?: run {
                        val lastSeg = colInfo.tableAlias.split('.')
                            .lastOrNull()
                            ?.trim('"', '`', '\'', ' ')
                            ?.lowercase()
                        if (lastSeg.isNullOrBlank()) null else aliasToRealNameMap[lastSeg]
                    }
            } else if (aliasToRealNameMap.size == 1) {
                // SELECT ID FROM USERS 같은 단일 테이블, 별칭 없는 쿼리 지원
                aliasToRealNameMap.values.first()
            } else {
                null // 테이블을 특정할 수 없는 경우
            }

            if (realTableName != null) {
                val normalizedTable = normalizeIdentifierChain(realTableName)
                val normalizedColumn = normalizeIdentifierChain(colInfo.columnName)
                val comment = commentProvider.getColumnComment(normalizedTable, normalizedColumn)
                if (!comment.isNullOrBlank()) {
                    insertions.add(colInfo.insertionIndex + 1 to " /* $comment */")
                } else if (DEBUG) {
                    println("[InlineSQLCommentor][DEBUG] 의견이 없습니다 $normalizedTable.$normalizedColumn")
                }
            } else if (DEBUG) {
                println("[InlineSQLCommentor][DEBUG] 별명에 대한 실제 테이블을 해결할 수 없습니다='${colInfo.tableAlias}'")
            }
        }

        // 3-2. 테이블 코멘트 삽입 엔트리 수집
        tableInfos.forEach { tbl ->
            val normalizedTable = normalizeIdentifierChain(tbl.tableName)
            val tableComment = commentProvider.getTableComment(normalizedTable)
            if (!tableComment.isNullOrBlank()) {
                insertions.add(tbl.insertionIndex + 1 to " /* $tableComment */")
            } else if (DEBUG) {
                println("[InlineSQLCommentor][DEBUG] 테이블 코멘트가 없습니다 $normalizedTable")
            }
        }

        // 3-3. 인덱스가 꼬이지 않도록 뒤에서부터 한 번에 삽입
        insertions.sortByDescending { it.first }
        insertions.forEach { (index, textToInsert) ->
            commentedSqlBuilder.insert(index, textToInsert)
        }

        return commentedSqlBuilder.toString()
    }
}
