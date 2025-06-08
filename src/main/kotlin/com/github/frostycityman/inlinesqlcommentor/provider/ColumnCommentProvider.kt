package com.github.frostycityman.inlinesqlcommentor.provider

interface ColumnCommentProvider {
    fun getComment(tableName: String, columnName: String): String?
}

class DummyColumnCommentProvider : ColumnCommentProvider {
    private val dummyComments = mapOf(
        "EMP_ID" to "사원 번호",
        "EMP_NAME" to "사원 이름",
        "SALARY" to "급여"
    )

    override fun getComment(tableName: String, columnName: String): String? {
        return dummyComments[columnName]
    }
}
