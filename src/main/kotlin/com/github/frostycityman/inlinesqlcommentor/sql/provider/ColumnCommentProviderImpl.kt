package com.github.frostycityman.inlinesqlcommentor.sql.provider

/**
 * 테스트용으로, 컬럼명에 매핑된 더미 주석을 반환하는 Provider.
 * 실제 구현 시에는 데이터베이스 커넥션을 통해 메타 정보를 조회해야 합니다.
 */
class DummyColumnCommentProvider : ColumnCommentProvider {
    private val dummyComments = mapOf(
        "id"    to "PK 컬럼",
        "name"  to "사용자 이름",
        "age"   to "사용자 나이",
        "email" to "이메일 주소"
    )

    override fun getComment(tableName: String, columnName: String): String? {
        return dummyComments[columnName]
    }
}
