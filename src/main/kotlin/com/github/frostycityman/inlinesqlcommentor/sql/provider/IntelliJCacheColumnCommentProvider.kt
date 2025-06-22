package com.github.frostycityman.inlinesqlcommentor.sql.provider

import com.intellij.database.psi.DbDataSource
import com.intellij.database.psi.DbPsiFacade
import com.intellij.database.model.DasColumn
import com.intellij.openapi.project.Project

/**
 * IntelliJ Data Source의 캐시에 저장된 DB 메타 정보를 활용하여 컬럼 코멘트를 제공하는 클래스
 */
class IntelliJCacheColumnCommentProvider(
    private val project: Project,
    private val dataSourceName: String
) : ColumnCommentProvider {

    // 프로젝트에서 DataSource 이름으로 DataSource 찾기
    private val dbDataSource: DbDataSource? by lazy {
        DbPsiFacade.getInstance(project).dataSources
            .firstOrNull { it.name == dataSourceName }
    }

    override fun getComment(tableName: String, columnName: String): String? {
        val dataSource = dbDataSource ?: return null

        val dasTable = DbPsiFacade.getInstance(project).findElement(
            DasColumn::class.java,
            dataSource,
            "$tableName.$columnName"
        ) as? DasColumn ?: return null

        return dasTable.comment
    }

    // 데이터소스의 연결 설정 정보 조회
    fun getJdbcUrl(): String? = dbDataSource?.connectionConfig?.url
    fun getUser(): String? = dbDataSource?.connectionConfig?.name
    fun getSchema(): String? = dbDataSource?.connectionConfig?.schema
    fun getPassword(): String? = dbDataSource?.connectionConfig?.password
}
