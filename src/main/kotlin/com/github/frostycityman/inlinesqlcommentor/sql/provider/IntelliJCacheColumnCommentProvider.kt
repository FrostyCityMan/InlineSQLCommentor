package com.github.frostycityman.inlinesqlcommentor.sql.provider

import com.intellij.database.dataSource.DatabaseConnectionConfig
import com.intellij.database.psi.DataSourceManager
import com.intellij.database.psi.DbTable
import com.intellij.database.psi.DbTableColumn
import com.intellij.openapi.project.Project

/**
 * IntelliJ에 등록된 Data Source의 캐시에 있는 연결 정보를 사용해
 * 컬럼 주석을 조회하는 Provider.
 */
class IntelliJCacheColumnCommentProvider(
    private val project: Project,
    private val dataSourceName: String
) : ColumnCommentProvider {
    private val config: DatabaseConnectionConfig? by lazy {
        DataSourceManager.getManagers(project).
            .dataSources
            .firstOrNull { it.name == dataSourceName }
            ?.connectionConfig
    }

    override fun getComment(tableName: String, columnName: String): String? {
        // ConnectionConfig가 없는 경우 바로 null
        config ?: return null

        // IntelliJ Database API를 통해 테이블과 컬럼 메타 조회
        val ds = DataSourceManager.getInstance(project)
            .dataSources
            .first { it.name == dataSourceName }

        val tables = DbTable.find(project, ds, tableName)
        if (tables.isEmpty()) return null

        val column: DbTableColumn? = tables
            .first()
            .columns
            .firstOrNull { it.name.equals(columnName, ignoreCase = true) }

        return column?.comment
    }

    fun getJdbcUrl(): String? = config?.url
    fun getUser(): String? = config?.user
    fun getSchema(): String? = config?.schema
    fun getPassword(): String? = config?.password
}
