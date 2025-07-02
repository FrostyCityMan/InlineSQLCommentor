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
    private val project: Project, private val dataSourceName: String
) : ColumnCommentProvider {
    // 로깅 인스턴스 (필요시 주석 해제하여 사용)
    // private val LOG = Logger.getInstance(IntelliJCacheColumnCommentProvider::class.java)

    /**
     * 지정된 `dataSourceName`에 해당하는 [DbDataSource]를 지연 초기화(lazy-initialized)하여 가져옵니다.
     * 처음 접근 시 [DbPsiFacade]를 통해 데이터 소스를 찾고, 이후에는 캐시된 값을 사용합니다.
     */
    private val dbDataSource: DbDataSource? by lazy {
        DbPsiFacade.getInstance(project).dataSources.firstOrNull { it.name == dataSourceName }
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

        val columns: List<DasColumn> = dasTable.getDasChildren(ObjectKind.COLUMN).filterIsInstance<DasColumn>()

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
        println("--- [Debug] findTableInDtaSource ---")
        println(">> 입력된 tableNameInput: '$tableNameInput'")

        // 데이터 소스에 연결된 모든 스키마의 테이블 객체를 가져옵니다.
        val allTables: List<DasTable> = dataSource.getDasChildren(ObjectKind.TABLE).filterIsInstance<DasTable>()

        // IDE의 데이터베이스 메타데이터 캐시가 비어있거나 오래되었기 때문일 가능성이 99%입니다.
        if (allTables.isEmpty()) {
            println("!! 경고: 데이터 소스 '${dataSource.name}'에서 테이블을 전혀 찾을 수 없습니다.")
            println("!! >> 해결 방법: [Database] 도구 창에서 데이터 소스 '${dataSource.name}'을(를) 우클릭한 후, 'Synchronize'를 실행하여 캐시를 새로고침하세요.")
            return null
        }

        // [로직 추가 1] 디버깅을 위해 찾은 모든 테이블을 스키마와 함께 출력합니다.
        println(">> 데이터 소스 '${dataSource.name}'에 캐시된 테이블 목록 (총 ${allTables.size}개):")
        allTables.forEach { table ->
            // table.dasParent를 통해 상위 객체인 스키마(DasNamespace)의 이름을 가져올 수 있습니다.
            val schemaName = (table.dasParent as? DasNamespace)?.name ?: "[스키마 없음]"
            println("  - 스키마: $schemaName, 테이블 이름: ${table.name}")
        }
        println("------------------------------------")

        // [로직 추가 2] 입력값을 정리하고, 테이블을 검색하는 로직을 완성합니다.
        // 사용자가 '`', '"', ''' 등으로 감싸서 입력할 경우를 대비합니다.
        val cleanTableNameInput = tableNameInput.removeSurrounding("`").removeSurrounding("\"").removeSurrounding("'")

        // 1. '스키마.테이블' 형태의 정규화된 이름으로 먼저 정확하게 찾아봅니다.
        if (cleanTableNameInput.contains('.')) {
            val foundByQualifiedName = allTables.firstOrNull { table ->
                val schemaName = (table.dasParent as? DasNamespace)?.name
                val qualifiedName = if (schemaName != null) "$schemaName.${table.name}" else table.name
                qualifiedName.equals(cleanTableNameInput, ignoreCase = true)
            }
            if (foundByQualifiedName != null) {
                val fqName = "${(foundByQualifiedName.dasParent as? DasNamespace)?.name}.${foundByQualifiedName.name}"
                println(">> [성공] 정규화된 이름 '$fqName'(으)로 테이블을 찾았습니다.")
                return foundByQualifiedName
            }
        }

        // 2. 위에서 못 찾았거나, 입력값이 단순 이름인 경우 테이블 이름만으로 찾습니다.
        val foundBySimpleName = allTables.firstOrNull { table ->
            table.name.equals(cleanTableNameInput, ignoreCase = true)
        }
        if (foundBySimpleName != null) {
            val fqName = "${(foundBySimpleName.dasParent as? DasNamespace)?.name}.${foundBySimpleName.name}"
            println(">> [성공] 단순 이름으로 테이블 '$fqName'(을)를 찾았습니다.")
            return foundBySimpleName
        }

        println("!! [실패] 입력된 이름 '$tableNameInput'과 일치하는 테이블을 데이터 소스에서 찾지 못했습니다.")
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
