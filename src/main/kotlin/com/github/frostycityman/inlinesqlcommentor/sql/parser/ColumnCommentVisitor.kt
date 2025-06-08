package com.github.frostycityman.inlinesqlcommentor.sql.parser

import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.plsqlBaseVisitor
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.plsqlParser


/**
 * SELECT 절의 각 컬럼 식별자를 수집하는 방문자(Visitor).
 * MySqlParser를 기준으로 했지만, PostgreSQL이나 Oracle도 유사하게 구현할 수 있습니다.
 */
class ColumnCommentVisitor : plsqlBaseVisitor<Unit>() {
    // 방문 중 발견되는 컬럼명(식별자) 목록
    private val columns = mutableListOf<String>()

    /**
     * SELECT_listContext는 MySQL 문법에서 SELECT 절의 컬럼 목록을 나타냅니다.
     * 각 컬럼 식별자(ID)를 확인하여 리스트에 추가합니다.
     */
    override fun visitSelect_list(ctx: plsqlParser.Select_statementContext) {
        // MySQL SELECT_listContext 아래의 columnContext들을 순회
        ctx.column().forEach { columnCtx ->
            // columnContext 내 IDENTIFIER() 토큰을 가져와 .text로 컬럼명 획득
            val idToken = columnCtx.uid()?.text ?: columnCtx.IDENTIFIER()?.text
            if (idToken != null) {
                columns += idToken
            }
        }
        // 하위 노드도 계속 방문
        super.visitSelect_list(ctx)
    }

    /**
     * 방문을 마친 후, 수집된 컬럼명 리스트를 반환합니다.
     */
    fun getColumns(): List<String> = columns.toList()
}
