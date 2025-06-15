package com.github.frostycityman.inlinesqlcommentor.sql.provider

/**
 * 테이블과 컬럼명을 입력받아, 해당 컬럼의 주석(설명)을 조회하는 인터페이스.
 * 구현체는 JDBC나 IntelliJ DataSourceManager를 사용해서 실제 DB 메타를 조회합니다.
 */

class ColumnCommentProvider {
    private val columnComments = mapOf(
        "employee_id" to "직원 ID",
        "employee_name" to "직원 이름",
        "salary" to "급여"
    )
    fun getComment(column: String): String? = columnComments[column]
}
