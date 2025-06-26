package com.github.frostycityman.inlinesqlcommentor.action

// 사용자 정의 클래스 임포트
import IntelliJCacheColumnCommentProvider // 컬럼 코멘트를 제공하는 로직 (캐시 사용 가능성)
import com.github.frostycityman.inlinesqlcommentor.sql.injector.SqlCommentInjector // SQL에 코멘트를 주입하는 로직

// IntelliJ 플랫폼 API 임포트 (데이터베이스 관련)
import com.intellij.database.model.DasDataSource // 데이터 소스의 추상 모델
import com.intellij.database.psi.DbDataSource // PSI(Program Structure Interface) 내의 데이터 소스 표현
import com.intellij.database.psi.DbPsiFacade // 데이터베이스 관련 PSI 요소에 접근하기 위한 Facade
import com.intellij.database.util.DbUtil // 데이터베이스 관련 유틸리티 함수

// IntelliJ 플랫폼 API 임포트 (액션 시스템, 에디터, 프로젝트 등)
import com.intellij.openapi.actionSystem.* // AnAction, AnActionEvent, CommonDataKeys 등 액션 시스템 핵심 클래스
import com.intellij.openapi.command.WriteCommandAction // 문서 변경을 위한 쓰기 액션
import com.intellij.openapi.editor.Editor // 텍스트 에디터 인터페이스
import com.intellij.openapi.project.Project // 현재 열려있는 프로젝트
import com.intellij.openapi.ui.Messages // 사용자에게 메시지(알림, 오류, 확인 등)를 표시하는 유틸리티
import com.intellij.openapi.vfs.VirtualFile // 가상 파일 시스템의 파일 표현
import com.intellij.psi.PsiFile // PSI 트리 내의 파일 표현

/**
 * SQL 쿼리에 컬럼 코멘트를 삽입하는 IntelliJ 액션 클래스입니다.
 * 사용자가 에디터에서 SQL 텍스트를 선택하고 이 액션을 실행하면,
 * 연결된 데이터 소스에서 컬럼 코멘트를 가져와 SQL에 주석 형태로 추가합니다.
 */
class SqlCommentAction : AnAction("Insert Column Comments") { // AnAction을 상속받아 액션 정의, 메뉴에 표시될 이름 지정

    /**
     * 사용자가 액션을 실행했을 때 호출되는 메서드입니다.
     * 선택된 SQL 텍스트에 컬럼 코멘트를 주입하는 주 로직을 수행합니다.
     * @param e AnActionEvent 액션 실행 시점의 컨텍스트 정보 (프로젝트, 에디터, 선택된 파일 등)
     */
    override fun actionPerformed(e: AnActionEvent) {
        // 액션 실행에 필요한 컨텍스트 정보 가져오기
        val editor: Editor? = e.getData(CommonDataKeys.EDITOR) // 현재 활성화된 에디터
        val project: Project? = e.project // 현재 프로젝트
        val psiFile: PsiFile? = e.getData(CommonDataKeys.PSI_FILE) // 현재 에디터에서 열린 파일의 PSI 표현

        // 필수 컨텍스트 정보가 없으면 오류 메시지를 표시하고 액션 종료
        if (editor == null || project == null || psiFile == null) {
            Messages.showMessageDialog(project, "액션을 실행할 수 있는 컨텍스트가 아닙니다.", "오류", Messages.getErrorIcon())
            return
        }

        // 에디터에서 사용자가 선택한 텍스트 가져오기
        val selectedText: String? = editor.selectionModel.selectedText
        // 선택된 텍스트가 없거나 비어있으면 정보 메시지를 표시하고 액션 종료
        if (selectedText.isNullOrBlank()) {
            Messages.showMessageDialog(project, "SQL을 먼저 선택해 주세요.", "정보", Messages.getInformationIcon())
            return
        }

        // 현재 파일 컨텍스트로부터 연결된 데이터 소스 찾기
        val dataSource: DbDataSource? = findDataSourceFromContext(project, psiFile)

        // 데이터 소스를 자동으로 찾지 못한 경우
        if (dataSource == null) {
            // 사용자에게 데이터 소스를 수동으로 선택할지 묻는 대화상자 표시
            val choice = Messages.showOkCancelDialog(
                project,
                "현재 파일/컨텍스트에 연결된 데이터 소스를 자동으로 찾을 수 없습니다.\n데이터 소스 목록에서 직접 선택하시겠습니까?",
                "데이터 소스 확인 필요",
                "선택하기", "취소",
                Messages.getQuestionIcon()
            )
            // 사용자가 "선택하기"를 누른 경우
            if (choice == Messages.OK) {
                // 사용자로부터 데이터 소스 이름을 입력받는 대화상자 표시
                val manualDataSourceName = Messages.showInputDialog(
                    project,
                    "데이터 소스 이름을 입력하세요:",
                    "수동 데이터 소스 지정",
                    Messages.getQuestionIcon()
                )
                // 사용자가 데이터 소스 이름을 입력하지 않거나 취소한 경우
                if (manualDataSourceName.isNullOrBlank()) {
                    Messages.showMessageDialog(project, "데이터 소스 지정이 취소되었습니다.", "취소", Messages.getInformationIcon())
                    return
                }
                // 입력받은 이름으로 프로젝트 내 데이터 소스 검색
                val manualDataSource = DbPsiFacade.getInstance(project)
                    .dataSources.firstOrNull { it.name == manualDataSourceName }

                // 해당 이름의 데이터 소스를 찾지 못한 경우
                if (manualDataSource == null) {
                    Messages.showMessageDialog(project, "입력한 이름의 데이터 소스를 찾을 수 없습니다: $manualDataSourceName", "오류", Messages.getErrorIcon())
                    return
                }
                // 수동으로 찾은 데이터 소스를 사용하여 SQL 처리
                processSqlWithDataSource(project, editor, selectedText, manualDataSource)
            } else { // 사용자가 "취소"를 누른 경우
                Messages.showMessageDialog(project, "데이터 소스 지정이 취소되었습니다.", "취소", Messages.getInformationIcon())
            }
            return // 데이터 소스 처리 후 actionPerformed 메서드 종료
        }
        // 자동으로 찾은 데이터 소스를 사용하여 SQL 처리
        processSqlWithDataSource(project, editor, selectedText, dataSource)
    }

    /**
     * 주어진 데이터 소스를 사용하여 선택된 SQL 텍스트에 코멘트를 주입하고 에디터의 내용을 교체합니다.
     * @param project 현재 프로젝트
     * @param editor 현재 에디터
     * @param selectedText 사용자가 선택한 SQL 텍스트
     * @param dataSource 코멘트를 가져올 데이터 소스
     */
    private fun processSqlWithDataSource(project: Project, editor: Editor, selectedText: String, dataSource: DbDataSource) {
        val dataSourceName = dataSource.name // 데이터 소스 이름 가져오기
        // 코멘트 제공자 및 주입기 초기화
        val commentProvider = IntelliJCacheColumnCommentProvider(project, dataSourceName)
        val injector = SqlCommentInjector(commentProvider)

        try {
            // 선택된 SQL에 코멘트 주입
            val commentedSql = injector.injectComments(selectedText)
            // 문서 변경을 위해 WriteCommandAction 내에서 실행
            WriteCommandAction.runWriteCommandAction(project) {
                replaceSelectedText(editor, commentedSql) // 에디터에서 선택된 텍스트를 코멘트가 추가된 SQL로 교체
            }
        } catch (ex: Exception) { // 코멘트 주입 중 예외 발생 시
            Messages.showMessageDialog(
                project,
                "코멘트 삽입 중 오류가 발생했습니다: ${ex.message}",
                "오류",
                Messages.getErrorIcon()
            )
        }
    }

    /**
     * 현재 PSI 파일 컨텍스트로부터 연결된 데이터 소스를 찾습니다.
     * @param project 현재 프로젝트
     * @param psiFile 현재 PSI 파일
     * @return 연결된 DbDataSource 객체, 없으면 null
     */
    private fun findDataSourceFromContext(project: Project, psiFile: PsiFile): DbDataSource? {
        // PSI 파일로부터 VirtualFile 가져오기, 없으면 null 반환
        val virtualFile: VirtualFile = psiFile.virtualFile ?: return null
        // 데이터베이스 PSI Facade 인스턴스 가져오기
        val dbFacade = DbPsiFacade.getInstance(project)

        // 프로젝트 내 모든 데이터 소스 중에서 현재 파일과 연관된 첫 번째 데이터 소스 찾기
        return dbFacade.dataSources.firstOrNull { psiDbDataSource ->
            isFileAssociated(psiDbDataSource, virtualFile, project)
        }
    }

    /**
     * 액션의 활성화/비활성화 상태 및 가시성을 업데이트합니다.
     * 이 메서드는 액션이 메뉴에 표시되거나 단축키로 호출될 때마다 실행될 수 있습니다.
     * @param e AnActionEvent 액션 업데이트 시점의 컨텍스트 정보
     */
    override fun update(e: AnActionEvent) {
        // 액션 실행에 필요한 컨텍스트 정보 가져오기
        val project: Project? = e.project
        val editor: Editor? = e.getData(CommonDataKeys.EDITOR)
        val psiFile: PsiFile? = e.getData(CommonDataKeys.PSI_FILE) // 이 접근은 getActionUpdateThread() 설정에 따라 스레드 안전성 고려

        // 액션 활성화 조건:
        // - 프로젝트, 에디터, PSI 파일이 모두 존재하고,
        // - PSI 파일에 연결된 가상 파일이 존재하며,
        // - 에디터에서 텍스트가 선택되어 있고,
        // - 선택된 텍스트가 비어있지 않아야 함.
        val isEnabled = project != null &&
                editor != null &&
                psiFile != null &&
                psiFile.virtualFile != null &&
                editor.selectionModel.hasSelection() &&
                !editor.selectionModel.selectedText.isNullOrBlank()

        // 계산된 활성화 상태를 액션의 프레젠테이션에 반영
        e.presentation.isEnabledAndVisible = isEnabled
    }

    /**
     * `update()` 메서드가 실행될 스레드를 지정합니다.
     * `CommonDataKeys.PSI_FILE` 접근 등 잠재적으로 느린 작업(파일 I/O, 코드 분석)이
     * `update()` 메서드 내에 포함될 수 있으므로, UI 스레드(EDT)를 블로킹하지 않도록
     * 백그라운드 스레드(BGT)에서 실행되도록 설정합니다.
     * @return ActionUpdateThread.BGT 백그라운드 스레드에서 `update()` 실행을 의미
     */
    override fun getActionUpdateThread(): ActionUpdateThread {
        return ActionUpdateThread.BGT
    }

    /**
     * 에디터에서 현재 선택된 텍스트를 주어진 텍스트로 교체합니다.
     * @param editor 텍스트를 교체할 에디터
     * @param text 새로 삽입될 텍스트
     */
    private fun replaceSelectedText(editor: Editor, text: String) {
        val document = editor.document // 에디터의 문서 객체
        val selectionModel = editor.selectionModel // 에디터의 선택 모델
        val start = selectionModel.selectionStart // 선택 영역의 시작 오프셋
        val end = selectionModel.selectionEnd // 선택 영역의 끝 오프셋
        document.replaceString(start, end, text) // 문서의 지정된 영역을 새 텍스트로 교체
    }

    /**
     * 주어진 파일(VirtualFile)이 특정 데이터 소스(DbDataSource)와 연관되어 있는지 확인합니다.
     * 이는 파일이 어떤 데이터베이스 연결 컨텍스트 내에서 사용되고 있는지를 판단하는 데 사용될 수 있습니다.
     * @param dbDataSource 확인할 대상 PSI 데이터 소스
     * @param file 확인할 대상 가상 파일
     * @param project 현재 프로젝트
     * @return 파일이 데이터 소스와 연관되어 있으면 true, 그렇지 않으면 false
     */
    private fun isFileAssociated(
        dbDataSource: DbDataSource,
        file: VirtualFile, // 실제로는 이 파라미터가 현재 구현에서 직접 사용되지 않고 있음.
                           // DbUtil.getDataSources(project)가 현재 컨텍스트의 데이터 소스를 가져오는 방식에 따라
                           // file 파라미터가 암시적으로 사용될 수 있으나, 명시적인 비교는 보이지 않음.
                           // 좀 더 정확한 연관 관계 확인 로직이 필요할 수 있음.
        project: Project
    ): Boolean {
        // 프로젝트와 연관된 모든 데이터 소스(LocalDataSource 형태) 목록을 가져옴
        val associatedDataSources = DbUtil.getDataSources(project)
        // 이 목록 중 하나라도 주어진 dbDataSource와 동일한 DasDataSource uniqueId를 가지는지 확인
        return associatedDataSources.any { localDs ->
            // LocalDataSource에서 DasDataSource (추상 데이터 소스 모델)를 가져옴
            val dasDataSource = localDs?.delegate as? DasDataSource
            // 비교 대상인 dbDataSource (PSI 표현)에서도 DasDataSource를 가져옴
            val targetDasDataSource = dbDataSource.delegate as? DasDataSource
            // 두 DasDataSource가 모두 존재하고, 그들의 uniqueId가 동일한지 비교
            dasDataSource != null && targetDasDataSource != null &&
                    dasDataSource.uniqueId == targetDasDataSource.uniqueId
        }
    }
}
