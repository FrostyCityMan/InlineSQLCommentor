package com.github.frostycityman.inlinesqlcommentor.sql.injector

import com.github.frostycityman.inlinesqlcommentor.sql.parser.ColumnCommentVisitor
import com.github.frostycityman.inlinesqlcommentor.sql.provider.ColumnCommentProvider
import com.github.frostycityman.inlinesqlcommentor.sql.parser.SqlColumnCommentVisitor
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.plsqlLexer
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.plsqlParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import java.lang.StringBuilder

/**
 * Oracle PL/SQL 전용 Injector.
 * gen/oracle 아래에 생성된 plsqlLexer·plsqlParser를 사용합니다.
 */
class SqlCommentInjector(
    private val commentProvider: ColumnCommentProvider
) {
    /**
     * @param originalSql 원본 PL/SQL 스크립트
     * @return 컬럼 주석이 삽입된 새 SQL 문자열
     */
    fun injectComments(originalSql: String): String {
        // 1) ANTLR 렉서/파서 초기화
        val lexer  = plsqlLexer(CharStreams.fromString(originalSql))
        val tokens = CommonTokenStream(lexer)
        val parser = plsqlParser(tokens)

        // 2) 최상위 규칙(sql_script) 호출
        val tree = parser.sql_script()

        // 3) 커스텀 Visitor로 SELECT 절의 컬럼 추출
        val visitor = ColumnCommentVisitor()
        visitor.visit(tree)
        val columns = visitor.getColumns() // List<Pair<tableName, columnName>>

        // 4) 원본 SQL에 `-- comment` 삽입
        val sb = StringBuilder(originalSql)
        columns.forEach { (table, column) ->
            commentProvider.getComment(table, column)?.let { comment ->
                // 컬럼명 바로 뒤에 삽입 (첫 등장만 처리하는 단순 로직)
                val idx = sb.indexOf(column)
                if (idx >= 0) {
                    sb.insert(idx + column.length, " -- $comment")
                }
            }
        }

        return sb.toString()
    }
}
