import com.github.frostycityman.inlinesqlcommentor.sql.provider.ColumnCommentProvider
import com.intellij.database.model.DasColumn
import com.intellij.database.model.DasNamespace
import com.intellij.database.model.DasTable
import com.intellij.database.model.ObjectKind
import com.intellij.database.model.RawConnectionConfig
import com.intellij.database.psi.DbDataSource
import com.intellij.database.psi.DbPsiFacade
import com.intellij.database.util.DasUtil
import com.intellij.openapi.application.ReadAction
import com.intellij.openapi.project.Project
import com.intellij.openapi.diagnostic.Logger

/**
 * IntelliJ Data Source의 내부 캐시를 활용하여 컬럼 코멘트를 제공하는 [ColumnCommentProvider] 구현체입니다.
 *
 * 이 클래스는 실제 데이터베이스에 접속하는 대신, IntelliJ 플랫폼이 동기화를 통해 관리하는
 * 메타데이터 캐시(PSI 모델)에 접근합니다. 이 방식은 매번 코멘트를 조회할 때마다 네트워크 오버헤드 없이
 * 매우 빠른 응답 속도를 보장합니다.
 *
 * @property project 플러그인이 실행 중인 현재 IntelliJ [Project]. 프로젝트 범위의 서비스(예: [DbPsiFacade])에 접근하기 위해 필요합니다.
 * @property dataSourceName 코멘트를 조회할 대상 데이터 소스의 이름. IntelliJ의 [Database] 도구 창에 표시되는 이름과 일치해야 합니다.
 */
class IntelliJCacheColumnCommentProvider(
    private val project: Project,
    private val dataSourceName: String
) : ColumnCommentProvider {

    // 로깅이 필요할 경우 주석을 해제하여 사용하세요.
    // private val LOG = Logger.getInstance(IntelliJCacheColumnCommentProvider::class.java)

    /**
     * 지정된 `dataSourceName`에 해당하는 [DbDataSource] 인스턴스를 지연 초기화(lazy-initialized)하여 가져옵니다.
     *
     * 이 프로퍼티에 처음 접근할 때만 [DbPsiFacade]를 통해 프로젝트 내 모든 데이터 소스를 검색하여
     * 일치하는 것을 찾습니다. 이후의 접근에서는 캐시된 값을 즉시 반환하여 불필요한 검색을 방지합니다.
     *
     * @return 이름이 일치하는 [DbDataSource] 객체. 찾지 못한 경우 `null`을 반환합니다.
     */
    private val dbDataSource: DbDataSource? by lazy {
        DbPsiFacade.getInstance(project).dataSources.firstOrNull { it.name == dataSourceName }
    }

    /**
     * 지정된 테이블과 컬럼에 대한 코멘트를 조회합니다.
     *
     * 이 메소드는 [ColumnCommentProvider.getComment] 인터페이스의 구현부로, 전체 조회 과정을 조율합니다.
     * 1. 데이터 소스를 찾습니다.
     * 2. `findTableInDataSource` 헬퍼 메소드를 호출하여 테이블 객체를 찾습니다.
     * 3. 테이블 객체에서 컬럼 목록을 가져와 일치하는 컬럼을 찾습니다.
     * 4. 최종적으로 찾은 컬럼의 코멘트를 반환합니다.
     *
     * @param tableNameInput 코멘트를 찾을 테이블의 이름. 단순 이름("MY_TABLE") 또는 스키마를 포함한 이름("SCOTT.MY_TABLE") 모두 가능합니다.
     * @param columnName 코멘트를 찾을 컬럼의 이름.
     * @return 조회된 컬럼 코멘트 문자열. 테이블, 컬럼, 또는 코멘트 자체를 찾지 못한 경우 `null`을 반환합니다.
     */
    override fun getComment(tableNameInput: String, columnName: String): String? {
        val dataSource = dbDataSource ?: run {
            // LOG.warn("Data source '$dataSourceName' not found for getComment.")
            return null
        }

        val dasTable: DasTable? = findTableInDataSource(dataSource, tableNameInput)

        if (dasTable == null) {
            // LOG.warn("Table not found with input: '$tableNameInput' in dataSource '${dataSource.name}'.")
            return null
        }

        // DasTable에서 자식 객체(컬럼)를 찾는 작업. ReadAction으로 감싸면 더 안전하지만,
        // 이미 상위 객체를 안전하게 가져왔으므로 일반적으로는 필수적이지 않습니다.
        val columns: List<DasColumn> = dasTable.getDasChildren(ObjectKind.COLUMN).filterIsInstance<DasColumn>()
        val dasColumn = columns.firstOrNull { it.name.equals(columnName, ignoreCase = true) }

        return dasColumn?.comment.also { comment ->
            if (dasColumn == null) {
                println("!! Column '$columnName' not found in table '${dasTable.name}'")
            } else if (comment == null) {
                println(">> Column '$columnName' in table '${dasTable.name}' found, but has no comment.")
            }
        }
    }

    /**
     * 지정된 데이터 소스 내에서 테이블 이름으로 [DasTable] 객체를 검색합니다.
     *
     * 이 함수는 IntelliJ의 데이터 모델에 안전하게 접근하기 위해 두 가지 핵심 기술을 사용합니다:
     * 1. **`ReadAction`**: IntelliJ의 데이터 모델을 읽는 모든 작업은 Read Action 내에서 수행되어야 합니다.
     *    이는 UI 스레드의 변경 작업과 충돌하지 않도록 보장하여 플러그인의 안정성을 크게 향상시킵니다.
     * 2. **`DasUtil.getTables()`**: 저수준 API 대신 IntelliJ가 제공하는 공식 유틸리티를 사용합니다.
     *    이 방법은 내부적으로 더 많은 예외 처리와 안정성 검사를 포함하고 있어, UI에 표시되는 데이터와
     *    API를 통해 얻는 데이터 간의 불일치 문제를 최소화합니다.
     *
     * 검색 로직은 사용자의 편의를 위해 '스키마.테이블' 형식과 '테이블' 단독 형식 모두를 지원하며,
     * 대소문자를 구분하지 않습니다.
     *
     * @param dataSource 검색을 수행할 대상 [DbDataSource].
     * @param tableNameInput 사용자가 입력한 테이블 이름.
     * @return 찾아낸 [DasTable] 객체. 찾지 못한 경우 `null`을 반환합니다.
     */
    private fun findTableInDataSource(dataSource: DbDataSource, tableNameInput: String): DasTable? {
        return ReadAction.compute<DasTable?, Throwable> {
            println("--- [Debug] findTableInDataSource (using DasUtil in ReadAction) ---")
            println(">> 입력된 tableNameInput: '$tableNameInput'")

            val allTables: List<DasTable> = DasUtil.getTables(dataSource).toList()

            if (allTables.isEmpty()) {
                println("!! 경고: DasUtil.getTables()를 통해서도 데이터 소스 '${dataSource.name}'에서 테이블을 찾을 수 없습니다.")
                println("!! >> 해결 방법: [Database] 도구 창에서 '${dataSource.name}'을(를) 'Forget Cached Schemas' 후 'Synchronize' 해보세요.")
                return@compute null
            }

            println(">> 데이터 소스 '${dataSource.name}'에 캐시된 테이블 목록 (총 ${allTables.size}개):")
            allTables.forEach { table ->
                val schemaName = (table.dasParent as? DasNamespace)?.name ?: "[스키마 없음]"
                println("  - 스키마: $schemaName, 테이블 이름: ${table.name}")
            }
            println("------------------------------------")

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
                    return@compute foundByQualifiedName
                }
            }

            // 2. 위에서 못 찾았거나, 입력값이 단순 이름인 경우 테이블 이름만으로 찾습니다.
            val foundBySimpleName = allTables.firstOrNull { table ->
                table.name.equals(cleanTableNameInput, ignoreCase = true)
            }
            if (foundBySimpleName != null) {
                val fqName = "${(foundBySimpleName.dasParent as? DasNamespace)?.name}.${foundBySimpleName.name}"
                println(">> [성공] 단순 이름으로 테이블 '$fqName'(을)를 찾았습니다.")
                return@compute foundBySimpleName
            }

            println("!! [실패] 입력된 이름 '$tableNameInput'과 일치하는 테이블을 데이터 소스에서 찾지 못했습니다.")
            return@compute null
        }
    }

    /**
     * 현재 데이터 소스의 원시 연결 설정을 반환합니다.
     * 이 메소드는 [ColumnCommentProvider.getDataSourceConfig] 인터페이스의 구현입니다.
     *
     * @return 현재 [dbDataSource]의 [RawConnectionConfig] 객체, 또는 데이터 소스를 찾지 못한 경우 `null`.
     */
    override fun getDataSourceConfig(): RawConnectionConfig? {
        return dbDataSource?.connectionConfig
    }
}
