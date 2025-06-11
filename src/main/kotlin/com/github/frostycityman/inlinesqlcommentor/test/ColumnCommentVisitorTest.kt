package com.github.frostycityman.inlinesqlcommentor.test

import com.github.frostycityman.inlinesqlcommentor.parser.ColumnCommentVisitor
import junit.framework.TestCase.assertEquals
import org.junit.Test

class ColumnCommentVisitorTest {

    private val visitor = ColumnCommentVisitor()

    @Test
    fun `단순 SELECT에서 컬럼 두 개를 정확히 추출한다`() {
        val sql = "SELECT emp_id, emp_name FROM employees;"
        val cols = visitor.parseColumns(sql)
        assertEquals(listOf("emp_id", "emp_name"), cols)
    }

    @Test
    fun `별칭이 붙은 컬럼도 이름만 추출한다`() {
        val sql = "SELECT e.emp_id AS id, e.emp_name AS name FROM employees e;"
        val cols = visitor.parseColumns(sql)
        assertEquals(listOf("emp_id", "emp_name"), cols)
    }

    @Test
    fun `함수가 포함된 경우에도 컬럼명만 추출한다`() {
        val sql = "SELECT COUNT(emp_id), emp_name FROM employees;"
        val cols = visitor.parseColumns(sql)
        // COUNT(emp_id) 는 general_element 로 추출될 수 있으므로 함수 전체는 제외하고 emp_name 만 담기게 한다면
        assertEquals(listOf("emp_name"), cols)
    }
}
