package com.github.frostycityman.inlinesqlcommentor.sql

/**
 * 컬럼명에 대한 주석(설명)을 제공하는 클래스
 */
class ColumnCommentProvider {
    private val commentMap: Map<String, String> = mapOf(
        "user_id" to "사용자 고유번호", "created_at" to "생성 시각", "status" to "상태 코드"
    )

    /**
     * 특정 컬럼의 주석을 반환합니다.
     * @param column 컬럼명
     * @return 주석 문자열 또는 null
     */
    fun getComment(column: String): String? {
        return commentMap[column.lowercase()]
    }

    /**
     * 모든 컬럼 주석을 반환합니다.
     */
    fun getAll(): Map<String, String> = commentMap
}
