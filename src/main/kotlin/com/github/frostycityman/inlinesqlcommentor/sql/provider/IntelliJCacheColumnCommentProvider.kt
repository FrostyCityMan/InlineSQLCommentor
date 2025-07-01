import com.github.frostycityman.inlinesqlcommentor.sql.provider.ColumnCommentProvider
import com.intellij.database.model.DasColumn
import com.intellij.database.model.DasDataSource
import com.intellij.database.model.DasNamespace
import com.intellij.database.model.DasTable
import com.intellij.database.model.ObjectKind
import com.intellij.database.model.RawConnectionConfig
import com.intellij.database.psi.DbDataSource
import com.intellij.database.psi.DbPsiFacade
import com.intellij.openapi.project.Project

/**
 * IntelliJ Data Source의 캐시에 저장된 DB 메타 정보를 활용하여 컬럼 코멘트를 제공하는 [ColumnCommentProvider] 구현체입니다.
 * IntelliJ가 내부적으로 관리하는 PSI 모델을 사용하여 실제 DB 접속 없이 메타데이터에 접근합니다.
 *
 * @property project 현재 IntelliJ [Project].
 * @property dataSourceName 대상 데이터 소스의 이름. IntelliJ 데이터베이스 도구 창에 표시되는 이름입니다.
 */
class IntelliJCacheColumnCommentProvider(
    private val project: Project,
    private val dataSourceName: String
) : ColumnCommentProvider {
    // 로깅 인스턴스 (필요시 주석 해제하여 사용)
    // private val LOG = Logger.getInstance(IntelliJCacheColumnCommentProvider::class.java)

    /**
     * 지정된 `dataSourceName`에 해당하는 [DbDataSource]를 지연 초기화(lazy-initialized)하여 가져옵니다.
     * 처음 접근 시 [DbPsiFacade]를 통해 데이터 소스를 찾고, 이후에는 캐시된 값을 사용합니다.
     */
    private val dbDataSource: DbDataSource? by lazy {
        DbPsiFacade.getInstance(project).dataSources
            .firstOrNull { it.name == dataSourceName }
    }

    /**
     * [ColumnCommentProvider.getComment] 인터페이스 메소드 구현.
     * 지정된 테이블과 컬럼 이름에 해당하는 코멘트를 IntelliJ 데이터베이스 캐시에서 조회하여 반환합니다.
     */
    override fun getComment(tableNameInput: String, columnName: String): String? {
        val dataSource = dbDataSource ?: run {
            // LOG.warn("Data source '$dataSourceName' not found for getComment.")
            return null
        }

        // 데이터 소스 내에서 테이블 검색 (개선된 메소드 호출)
        val dasTable: DasTable? = findTableInDataSource(dataSource, tableNameInput)

        if (dasTable == null) {
            // LOG.warn("Table not found with input: '$tableNameInput' in dataSource '${dataSource.name}'.")
            return null
        }

        val columns: List<DasColumn> = dasTable.getDasChildren(ObjectKind.COLUMN)
            .filterIsInstance<DasColumn>()

        val dasColumn = columns.firstOrNull { it.name.equals(columnName, ignoreCase = true) }

        return dasColumn?.comment.also {
             if (it == null && dasColumn != null) {
                 println("Column '$columnName' in table '${dasTable.name}' found, but has no comment.")
             } else if (dasColumn == null) {
                 println("Column '$columnName' not found in table '${dasTable.name}'")
             }
        }
    }

    /**
     * 지정된 데이터 소스 내에서 테이블 이름으로 [DasTable] 객체를 검색합니다. (로직 개선됨)
     * 사용자가 입력한 테이블 이름(단순 이름, '스키마.테이블' 형식 모두)을 고려하여 일치하는 테이블을 찾습니다.
     *
     * @param dataSource 검색 대상 [DbDataSource].
     * @param tableNameInput 사용자가 입력한 테이블 이름 (예: "my_table", "public.my_table").
     * @return 찾아낸 [DasTable] 객체. 찾지 못한 경우 null을 반환합니다.
     */
      /**
     * [디버깅 강화 버전]
     * 지정된 데이터 소스 내에서 테이블 이름으로 [DasTable] 객체를 검색합니다.
     * 함수 진입 시 입력값과 캐시에 있는 모든 테이블 정보를 출력하여 원인 파악을 돕습니다.
     */
    private fun findTableInDataSource(dataSource: DbDataSource, tableNameInput: String): DasTable? {
        println("--- [Debug] findTableInDataSource ---")
        println(">> 입력된 tableNameInput: '$tableNameInput'")

        // 데이터 소스 내의 모든 테이블 객체를 가져옴
        val allTables: List<DasTable> = dataSource.getDasChildren(ObjectKind.TABLE)
            .filterIsInstance<DasTable>()

        if (allTables.isEmpty()) {
            println("!! 경고: 데이터 소스 '${dataSource.name}'에서 테이블을 전혀 찾을 수 없습니다. 캐시를 확인하세요.")
            return null
        }

        println(">> 데이터 소스 '${dataSource.name}'에 캐시된 테이블 목록:")
        allTables.forEach { table ->
            val schemaName = (table.dasParent as? DasNamespace)?.name ?: "[스키마 없음]"
            println("  - 스키마: $schemaName, 테이블 이름: ${table.name}")
        }
        println("------------------------------------")


        val cleanTableNameInput = tableNameInput.removeSurrounding("`").removeSurrounding("\"").removeSurrounding("'")

        // 1. 정규화된 이름(스키마.테이블)으로 먼저 정확하게 찾아봅니다.
        if (cleanTableNameInput.contains('.')) {
            val foundByQualifiedName = allTables.firstOrNull { table ->
                val schemaName = (table.dasParent as? DasNamespace)?.name
                val qualifiedName = if (schemaName != null) "$schemaName.${table.name}" else table.name
                qualifiedName.equals(cleanTableNameInput, ignoreCase = true)
            }
            if (foundByQualifiedName != null) {
                println(">> [성공] 정규화된 이름으로 테이블 '${foundByQualifiedName.name}' 찾음.")
                return foundByQualifiedName
            }
        }

        // 2. 단순 이름으로 찾습니다.
        val foundBySimpleName = allTables.firstOrNull { table ->
            table.name.equals(cleanTableNameInput, ignoreCase = true)
        }
        if (foundBySimpleName != null) {
            println(">> [성공] 단순 이름으로 테이블 '${foundBySimpleName.name}' 찾음.")
            return foundBySimpleName
        }

        println("!! [실패] 입력된 이름 '$tableNameInput'과 일치하는 테이블을 찾지 못했습니다.")
        return null
    }

    /**
     * [ColumnCommentProvider.getDataSourceConfig] 인터페이스 메소드 구현.
     * 현재 [dbDataSource]의 원시 연결 설정([RawConnectionConfig])을 반환합니다.
     */
    override fun getDataSourceConfig(): RawConnectionConfig? {
        return dbDataSource?.connectionConfig
    }
}
