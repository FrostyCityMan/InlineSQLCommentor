package com.github.frostycityman.inlinesqlcommentor.sql.provider

import com.intellij.database.dataSource.DatabaseConnectionConfig
import com.intellij.database.dataSource.LocalDataSource
import com.intellij.database.dataSource.LocalDataSourceManager
import com.intellij.database.model.DasDataSource
import com.intellij.database.psi.DbTable
import com.intellij.database.psi.DbColumn // <<-- DbTableColumn이 아니라 DbColumn 입니다!
import com.intellij.openapi.project.Project

class IntelliJCacheColumnCommentProvider(
    private val project: Project,
    private val dataSourceName: String
) : ColumnCommentProvider {

    private val dataSource: DasDataSource? by lazy {
        LocalDataSourceManager.getInstance(project)
            .dataSources
            .firstOrNull { it.name == dataSourceName }
    }

    private val config: DatabaseConnectionConfig? by lazy {
        (dataSource as? LocalDataSource)?.connectionConfig
    }

    override fun getComment(tableName: String, columnName: String): String? {
        val currentDataSource = dataSource ?: return null
        val tables: List<DbTable> = DbTable.find(project, currentDataSource, tableName)
        val table = tables.firstOrNull() ?: return null

        // DbColumn으로 수정합니다.
        val column: DbColumn? = table.columns // table.columns는 List<DbColumn>을 반환합니다.
            .firstOrNull { it.name.equals(columnName, ignoreCase = true) }

        // DbColumn 인터페이스에는 comment 프로퍼티가 있습니다.
        return column?.comment
    }

    fun getJdbcUrl(): String? = config?.url
    fun getUser(): String? = config?.user
    fun getSchema(): String? = config?.schema
    fun getPassword(): String? = config?.password
}
