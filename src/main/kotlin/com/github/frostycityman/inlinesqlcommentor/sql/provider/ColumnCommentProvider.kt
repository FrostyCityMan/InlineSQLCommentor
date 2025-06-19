package com.github.frostycityman.inlinesqlcommentor.sql.provider

/**
 * 테이블과 컬럼명을 입력받아, 해당 컬럼의 주석(설명)을 조회하는 인터페이스.
 * 구현체는 JDBC나 IntelliJ DataSourceManager를 사용해서 실제 DB 메타를 조회합니다.
 */
interface ColumnCommentProvider {
    /**
     * 지정된 테이블의 특정 컬럼에 대한 주석을 반환합니다.
     *
     * @param tableName 조회할 테이블의 이름
     * @param columnName 조회할 컬럼의 이름
     * @return 컬럼 주석 문자열. 주석이 없거나 컬럼을 찾을 수 없으면 null.
     */
    fun getComment(tableName: String, columnName: String): String?
}
