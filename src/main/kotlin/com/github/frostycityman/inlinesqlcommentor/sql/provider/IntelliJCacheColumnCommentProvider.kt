import com.github.frostycityman.inlinesqlcommentor.sql.provider.ColumnCommentProvider
import com.intellij.database.model.DasColumn
import com.intellij.database.model.DasDataSource
import com.intellij.database.model.DasNamespace
import com.intellij.database.model.DasTable
import com.intellij.database.model.ObjectKind
import com.intellij.database.model.RawConnectionConfig
import com.intellij.database.psi.DbDataSource
import com.intellij.database.psi.DbPsiFacade
import com.intellij.database.util.DbUtil
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
        // 데이터 소스를 찾을 수 없으면 null 반환
        //TODO data소스에서 table찾기
        val dataSource = dbDataSource ?: run {
            // LOG.warn("Data source '$dataSourceName' not found for getComment.")
            return null
        }

        // 데이터 소스 내에서 테이블 검색
        val dasTable: DasTable? = findTableInDataSource(dataSource, tableNameInput)

        // 테이블을 찾을 수 없으면 null 반환
        if (dasTable == null) {
            // LOG.warn("Table not found with input: '$tableNameInput' in dataSource '${dataSource.name}'.")
            return null
        }

        // 찾은 테이블 내에서 컬럼 검색
        // DasTable의 자식 요소 중 ObjectKind.COLUMN 타입만 필터링하고 DasColumn으로 캐스팅
        val columns: List<DasColumn> = dasTable.getDasChildren(ObjectKind.COLUMN)
            .filterIsInstance<DasColumn>()

        // 컬럼 이름으로 대상 컬럼 검색 (대소문자 무시)
        val dasColumn = columns.firstOrNull { it.name.equals(columnName, ignoreCase = true) }

        // 컬럼을 찾을 수 없으면 null 반환, 찾았으면 해당 컬럼의 코멘트 반환
        return dasColumn?.comment.also {
            // if (it == null && dasColumn != null) {
            //    LOG.info("Column '$columnName' in table '${dasTable.name}' found, but has no comment.")
            // } else if (dasColumn == null) {
            //    LOG.warn("Column '$columnName' not found in table '${dasTable.name}'")
            // }
        }
    }

    /**
     * 지정된 데이터 소스 내에서 테이블 이름으로 [DasTable] 객체를 검색합니다.
     * 스키마 포함 여부 등 다양한 테이블 이름 형식을 고려하여 검색을 시도합니다.
     *
     * @param dataSource 검색 대상 [DbDataSource].
     * @param tableNameInput 사용자가 입력한 테이블 이름 (예: "my_table", "public.my_table").
     * @return 찾아낸 [DasTable] 객체. 찾지 못한 경우 null을 반환합니다.
     */
    private fun findTableInDataSource(dataSource: DbDataSource, tableNameInput: String): DasTable? {
        // 데이터 소스 내의 모든 테이블 객체를 가져옴
        //TODO 테이블 리스트 가져오는법
        val tables: List<DasTable> = dataSource.getDasChildren(ObjectKind.TABLE)
            .filterIsInstance<DasTable>()

        // 1단계: 입력된 이름(tableNameInput)과 테이블의 다양한 이름 표현(단순 이름, FQN 추정)을 비교
        var foundTable = tables.firstOrNull { table ->
            val qualifiedNameAttempt = table.toString() // toString()은 종종 FQN(Fully Qualified Name)을 반환
            val simpleName = table.name // name 프로퍼티는 보통 순수 객체 이름을 반환

            // 대소문자를 무시하고 비교
            qualifiedNameAttempt.equals(tableNameInput, ignoreCase = true) ||
                    simpleName.equals(tableNameInput, ignoreCase = true)
        }

        // 1단계에서 찾았으면 바로 반환
        if (foundTable != null) {
            return foundTable
        }

        // 2단계: 1단계에서 못 찾았고, 입력된 이름에 '.' (스키마 구분자)가 포함된 경우
        //        스키마 이름과 순수 테이블 이름으로 분리하여 정확히 일치하는 테이블을 검색
        if (tableNameInput.contains(".")) {
            val parts = tableNameInput.split('.', limit = 2)
            if (parts.size == 2) { // "스키마.테이블" 형식으로 정상 분리된 경우
                val schemaNameInput = parts[0]
                val pureTableNameInput = parts[1]

                foundTable = tables.firstOrNull { table ->
                    // 테이블의 부모 네임스페이스(스키마) 이름 가져오기
                    val tableSchemaName = (table.dasParent as? DasNamespace)?.name
                    // 스키마 이름과 테이블 이름이 모두 일치하는지 확인 (대소문자 무시)
                    tableSchemaName != null && tableSchemaName.equals(schemaNameInput, ignoreCase = true) &&
                            table.name.equals(pureTableNameInput, ignoreCase = true) // table.name이 순수 테이블명이라고 가정
                }
            }
        }
        // 최종적으로 찾은 테이블 (또는 null) 반환
        return foundTable
    }

    /**
     * [ColumnCommentProvider.getDataSourceConfig] 인터페이스 메소드 구현.
     * 현재 [dbDataSource]의 원시 연결 설정([RawConnectionConfig])을 반환합니다.
     */
    override fun getDataSourceConfig(): RawConnectionConfig? {
        // 데이터 소스를 찾을 수 없으면 null 반환
        val dataSource = dbDataSource ?: return null
        // DbDataSource.connectionConfig는 RawConnectionConfig? 타입을 반환
        return dataSource.connectionConfig
    }
}
