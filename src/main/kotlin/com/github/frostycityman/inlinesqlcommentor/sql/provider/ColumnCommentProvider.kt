package com.github.frostycityman.inlinesqlcommentor.sql.provider

import com.intellij.database.psi.DbPsiFacade
import com.intellij.database.dataSource.DatabaseConnectionConfig
import com.intellij.openapi.project.Project

/**
 * IntelliJ에 등록된 Data Source의 정보를 활용하여 컬럼의 코멘트를 제공하는 클래스
 */
class ColumnCommentProvider(private val project: Project, private val dataSourceName: String) {

    private val columnComments = mapOf(
        "employee_id" to "직원 ID",
        "employee_name" to "직원 이름",
        "salary" to "급여"
    )

    fun getComment(column: String): String? = columnComments[column]

    fun getDataSourceConfig(): DatabaseConnectionConfig? {
        val dataSource = DbPsiFacade.getInstance(project)
            .dataSources
            .firstOrNull { it.name == dataSourceName }
            ?: return null

        return dataSource.connectionConfig
    }
}
