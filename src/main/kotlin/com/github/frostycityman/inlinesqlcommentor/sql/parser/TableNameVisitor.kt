package com.github.frostycityman.inlinesqlcommentor.sql.parser

import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlLexer
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlParser
import com.github.frostycityman.inlinesqlcommentor.sql.parser.generated.oracle.PlSqlParserBaseVisitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

// 추출된 테이블명과 별칭, 그리고 해당 테이블이 어떤 문맥(FROM, INSERT 등)에서 왔는지 저장
data class TableInfo(
    val tableName: String,
    val alias: String? = null,
    val context: String // 예: "FROM_CLAUSE", "INSERT_INTO", "UPDATE_TABLE", "DELETE_FROM"
)

class TableNameVisitor : PlSqlParserBaseVisitor<Unit>() {

    val extractedTables = mutableSetOf<TableInfo>() // 중복 제거를 위해 Set 사용

    // SQL 스크립트의 최상위부터 시작 (또는 더 구체적인 시작 규칙 사용 가능)
    override fun visitSql_script(ctx: PlSqlParser.Sql_scriptContext): Unit {
        // 모든 DML 문장을 순회하도록 함
        // 실제로는 더 많은 종류의 statement를 고려해야 할 수 있음
//        ctx.data_manipulation_language_statements()?.let { visit(it) }

        // 필요하다면 다른 문맥(예: DDL)도 방문
        return // 명시적 Unit 반환
    }


    // INSERT 문의 테이블명 추출
    override fun visitInsert_statement(ctx: PlSqlParser.Insert_statementContext): Unit {
//        ctx.general_table_ref()?.dml_table_expression_clause()?.tableview_name()?.let { tableNameCtx ->
//            extractedTables.add(TableInfo(tableNameCtx.text, context = "INSERT_INTO"))
//        }
        return super.visitInsert_statement(ctx) // 나머지 자식 노드 방문
    }

    // UPDATE 문의 테이블명 추출
    override fun visitUpdate_statement(ctx: PlSqlParser.Update_statementContext): Unit {
        ctx.general_table_ref()?.dml_table_expression_clause()?.tableview_name()?.let { tableNameCtx ->
            extractedTables.add(TableInfo(tableNameCtx.text, context = "UPDATE_TABLE"))
        }
        return super.visitUpdate_statement(ctx)
    }

    // DELETE 문의 테이블명 추출
    override fun visitDelete_statement(ctx: PlSqlParser.Delete_statementContext): Unit {
        ctx.general_table_ref()?.dml_table_expression_clause()?.tableview_name()?.let { tableNameCtx ->
            extractedTables.add(TableInfo(tableNameCtx.text, context = "DELETE_FROM"))
        }
        return super.visitDelete_statement(ctx)
    }

    // SELECT 문의 FROM 절에서 테이블명 및 별칭 추출
    // JOIN 등 복잡한 경우는 추가적인 처리가 필요할 수 있음
    override fun visitTable_ref_aux(ctx: PlSqlParser.Table_ref_auxContext): Unit {
        // table_ref_aux는 tableview_name (테이블명)과 table_alias (별칭)를 가질 수 있음

//        val tableNameCtx = ctx.dml_table_expression_clause()?.tableview_name()

        val aliasCtx = ctx.table_alias()

//        if (tableNameCtx != null) {
//            val tableName = tableNameCtx.text
//            val alias = aliasCtx?.identifier()?.text // 별칭은 identifier를 통해 얻음
//            extractedTables.add(TableInfo(tableName, alias, context = "FROM_CLAUSE"))
//        }


        // 만약 table_ref_aux가 서브쿼리 등을 포함한다면, 해당 서브쿼리 내부도 방문해야 함
        // 예: ctx.select_subquery()?.let { visit(it) }
        return super.visitTable_ref_aux(ctx)
    }

    // 파싱 실행 및 결과 반환
    fun parseTableNames(sql: String): Set<TableInfo> {
        extractedTables.clear() // 이전 결과 초기화
        val lexer = PlSqlLexer(CharStreams.fromString(sql))
        val tokens = CommonTokenStream(lexer)
        val parser = PlSqlParser(tokens)
        visit(parser.sql_script()) // SQL 전체를 파싱
        return extractedTables
    }
}
