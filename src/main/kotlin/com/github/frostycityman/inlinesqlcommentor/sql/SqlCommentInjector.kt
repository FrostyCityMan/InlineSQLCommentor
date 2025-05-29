package com.github.frostycityman.inlinesqlcommentor.sql

import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.editor.Document
import com.intellij.openapi.util.TextRange
import com.intellij.openapi.util.TextRangeScalarUtil.endOffset
import com.intellij.psi.PsiFile
import com.intellij.psi.util.PsiTreeUtil
import com.intellij.sql.psi.SqlFile
import com.intellij.sql.psi.SqlSelectStatement
import com.intellij.sql.psi.SqlInsertStatement
import com.intellij.sql.psi.SqlUpdateStatement
import com.intellij.sql.psi.SqlDeleteStatement
import com.intellij.sql.psi.SqlInsertDmlInstruction
import com.intellij.sql.psi.SqlReferenceExpression
import com.intellij.sql.psi.SqlValuesExpression
import com.intellij.sql.psi.SqlSetClause
import com.jetbrains.rd.util.string.println

/**
 * PSI 기반 SQL 주석 인젝터 (regex 사용 없이 PSI 토큰 리스트로 세그먼트 분리)
 */
class SqlCommentInjector(
    private val commentProvider: ColumnCommentProvider
) {
    fun injectComments(psi: PsiFile, document: Document) {
        val sqlFile = psi as? SqlFile ?: return
        val project = sqlFile.project

        WriteCommandAction.runWriteCommandAction(project) {
            // SELECT 문 처리
            PsiTreeUtil.findChildrenOfType(sqlFile, SqlSelectStatement::class.java).forEach { select ->
                val cols = select.queryExpression?.selectClause?.expressions.orEmpty()
                println("cols = ${cols}")
                if (cols.isEmpty()) return@forEach
                val start = select.textRange.startOffset
                val end = select.textRange.endOffset

                val sb = StringBuilder("SELECT\n")

                cols.forEachIndexed { idx, expr ->
                    val col = expr.text
                    val comment = commentProvider.getComment(col).orEmpty()
                    val prefix = if (idx == 0) "  " else "  , "
                    sb.append(prefix).append(col)
                    if (comment.isNotEmpty()) sb.append(" -- ").append(comment)
                    sb.append("\n")
                }
//                 FROM 이하 텍스트 유지
                val suffix = document.getText(TextRange(cols.last().textRange.endOffset, end))
                sb.append(suffix)

                document.replaceString(start, end, sb.toString())
            }

            // INSERT 문 처리 (SqlInsertDmlInstruction 사용)
            PsiTreeUtil.findChildrenOfType(sqlFile, SqlInsertDmlInstruction::class.java).forEach { ins ->
                // 컬럼 식별자 참조만 수집
                val refs = PsiTreeUtil.findChildrenOfType(ins, SqlReferenceExpression::class.java)
                    .filter { commentProvider.getComment(it.text) != null }
                if (refs.isEmpty()) return@forEach

                val start = ins.textRange.startOffset
                val end = ins.textRange.endOffset
                val fullText = document.getText(TextRange(start, end))

                // 괄호 시작 위치 계산
                val parenIndex = fullText.indexOf('(')
                val header = fullText.substring(0, parenIndex + 1) // '(' 포함
                val suffix = fullText.substring(fullText.lastIndexOf(')')) // ')' 포함부터 끝

                // 컬럼 리스트 세그먼트
                val cols = refs.map { it.text }
                val sb = StringBuilder(header).append("\n")
                cols.forEachIndexed { idx, col ->
                    val comment = commentProvider.getComment(col).orEmpty()
                    val prefix = if (idx == 0) "  " else "  , "
                    sb.append(prefix).append(col)
                    if (comment.isNotEmpty()) sb.append(" -- ").append(comment)
                    sb.append("\n")
                }
                sb.append(suffix)

                document.replaceString(start, end, sb.toString())
            }

//            // UPDATE 문 처리
//            PsiTreeUtil.findChildrenOfType(sqlFile, SqlUpdateStatement::class.java).forEach { upd ->
//                val setClause: SqlSetClause? = upd.setClause
//                val assigns = setClause?.assignments.orEmpty()
//                if (assigns.isEmpty()) return@forEach
//                val whereText = upd.whereClause?.text.orEmpty()
//
//                val start = upd.textRange.startOffset
//                val end = upd.textRange.endOffset
//
//                val sb = StringBuilder("UPDATE ")
//                    .append(upd.targetTable?.text)
//                    .append(" SET\n")
//
//                assigns.forEachIndexed { idx, asn ->
//                    val col = asn.columnName.text
//                    val comment = commentProvider.getComment(col).orEmpty()
//                    val valExpr = asn.expression?.text.orEmpty()
//                    val prefix = if (idx == 0) "  " else "  , "
//                    sb.append(prefix).append(col)
//                    if (comment.isNotEmpty()) sb.append(" -- ").append(comment)
//                    sb.append(" = ").append(valExpr).append("\n")
//                }
//                sb.append(whereText)
//
//                document.replaceString(start, end, sb.toString())
//            }
//
//            // DELETE 문 처리
//            PsiTreeUtil.findChildrenOfType(sqlFile, SqlDeleteStatement::class.java).forEach { del ->
//                val where = del.whereClause
//                val condRefs = PsiTreeUtil.findChildrenOfType(where, SqlReferenceExpression::class.java)
//                val start = del.textRange.startOffset
//                val end = del.textRange.endOffset
//
//                val sb = StringBuilder("DELETE FROM ")
//                    .append(del.targetTable?.text)
//                if (condRefs.isNotEmpty()) {
//                    sb.append(" WHERE ")
//                    condRefs.forEachIndexed { idx, ref ->
//                        val col = ref.text
//                        val comment = commentProvider.getComment(col).orEmpty()
//                        if (idx > 0) sb.append(" AND ")
//                        sb.append(col)
//                        if (comment.isNotEmpty()) sb.append(" -- ").append(comment)
//                    }
//                }
//
//                document.replaceString(start, end, sb.toString())
//            }
        }
    }
}
