package com.github.frostycityman.inlinesqlcommentor.sql.provider

import com.intellij.database.model.RawConnectionConfig

// import com.intellij.openapi.diagnostic.Logger // 로깅이 필요한 경우 주석 해제

/**
 * 컬럼 코멘트 및 관련 데이터 소스 정보를 제공하는 인터페이스
 */
interface ColumnCommentProvider {
    /**
     * 지정된 테이블의 특정 컬럼에 대한 코멘트(설명)를 반환합니다.
     *
     * @param tableName 테이블 이름. 스키마를 포함할 수 있습니다 (예: "public.my_table" 또는 "my_table").
     * @param columnName 컬럼 이름.
     * @return 컬럼 코멘트 문자열. 코멘트가 없거나, 테이블 또는 컬럼을 찾을 수 없는 경우 null을 반환합니다.
     */
    fun getComment(tableName: String, columnName: String): String?

    /**
     * 현재 프로바이더가 사용하는 데이터 소스의 원시 연결 설정 정보를 반환합니다.
     *
     * @return [RawConnectionConfig] 객체. 데이터 소스 정보를 사용할 수 없는 경우 null을 반환합니다.
     */
    fun getDataSourceConfig(): RawConnectionConfig?
}
