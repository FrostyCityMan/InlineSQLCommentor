package com.github.frostycityman.inlinesqlcommentor.sql.injector

import com.github.frostycityman.inlinesqlcommentor.sql.provider.ColumnCommentProvider
import org.junit.Test
import kotlin.test.assertEquals

class SqlCommentInjectorTest {

    @Test
    fun `inject comments into sql`() {
        val sql = "SELECT emp_id, emp_name FROM employees;"
        val injector = SqlCommentInjector(ColumnCommentProvider())

        val expectedSql = "SELECT emp_id /* 사원 고유 번호 */, emp_name /* 사원 이름 */ FROM employees;"
        assertEquals(expectedSql, injector.injectComments(sql))
    }
}
