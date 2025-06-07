package com.github.frostycityman.inlinesqlcommentor.sql.provider

/**
 * 테이블과 컬럼명을 입력받아, 해당 컬럼의 주석(설명)을 조회하는 인터페이스.
 * 구현체는 JDBC나 IntelliJ DataSourceManager를 사용해서 실제 DB 메타를 조회합니다.
 */
interface ColumnCommentProvider {
    /**
     * @param tableName 실제 SQL에서 사용된 테이블(또는 별칭이 아닌 순수 테이블) 이름
     * @param columnName 해당 테이블 내 컬럼명
     * @return 컬럼의 주석(생략 가능). 데이터베이스에 주석이 없다면 null 또는 빈 문자열을 반환.
     */
    fun getComment(tableName: String, columnName: String): String?
}
