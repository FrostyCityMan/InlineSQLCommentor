package com.github.frostycityman.inlinesqlcommentor.sql.provider

import com.intellij.database.psi.DataSourceManager
import com.intellij.openapi.project.Project
import javax.activation.DataSource

import com.intellij.database.dataSource.DataSourceInfo
import com.intellij.database.dataSource.DatabaseConnectionConfig
import com.intellij.database.dataSource.DataSourceInfo
/**
 * 테이블과 컬럼명을 입력받아, 해당 컬럼의 주석(설명)을 조회하는 인터페이스.
 * 구현체는 JDBC나 IntelliJ DataSourceManager를 사용해서 실제 DB 메타를 조회합니다.
 */

class ColumnCommentProvider {
    private val columnComments = mapOf(
        "employee_id" to "직원 ID",
        "employee_name" to "직원 이름",
        "salary" to "급여"
    )

    fun getComment(column: String): String? = columnComments[column]


    fun getDataSourceConfig(project: Project, dataSourceName: String): DatabaseConnectionConfig? {
        // 1) 프로젝트에 등록된 DataSource 중 이름이 일치하는 항목 찾기
        val ds: DataSource = DataSourceInfo.getCasing()  getInstance(project)
            .dataSources
            .firstOrNull { it.name == dataSourceName }
            ?: return null

        // 2) DataSource의 기본 연결 설정 가져오기
        //    실제 클래스는 LocalDataSource 또는 JdbcDataSource 등 구현체입니다.
        return ds.connectionConfig
    }
}
