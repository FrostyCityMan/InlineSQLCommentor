package com.github.frostycityman.inlinesqlcommentor.action

import IntelliJCacheColumnCommentProvider
import com.github.frostycityman.inlinesqlcommentor.sql.injector.SqlCommentInjector
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import com.intellij.psi.PsiFile
import com.intellij.database.psi.DbDataSource // DbDataSource 사용
import com.intellij.sql.database.SqlDataSourceManager // SqlDataSourceManager 임포트
import com.intellij.sql.database.SqlDataSourceImpl // SqlDataSourceImpl 임포트
import com.intellij.openapi.vfs.VirtualFile

// import com.intellij.openapi.diagnostic.Logger

class SqlCommentAction : AnAction("Insert Column Comments") {

    // private val LOG = Logger.getInstance(SqlCommentAction::class.java)

    override fun actionPerformed(e: AnActionEvent) {
        val editor: Editor? = e.getData(CommonDataKeys.EDITOR)
        val project: Project? = e.project
        val psiFile: PsiFile? = e.getData(CommonDataKeys.PSI_FILE)

        if (editor == null || project == null || psiFile == null) {
            Messages.showMessageDialog(project, "액션을 실행할 수 있는 컨텍스트가 아닙니다.", "오류", Messages.getErrorIcon())
            return
        }

        val selectedText: String? = editor.selectionModel.selectedText
        if (selectedText.isNullOrBlank()) {
            Messages.showMessageDialog(project, "SQL을 먼저 선택해 주세요.", "정보", Messages.getInformationIcon())
            return
        }

        val dataSource: DbDataSource? = findDataSourceFromContext(project, psiFile)

        if (dataSource == null) {
            val choice = Messages.showOkCancelDialog(
                project,
                "현재 파일/컨텍스트에 연결된 데이터 소스를 자동으로 찾을 수 없습니다.\n데이터 소스 목록에서 직접 선택하시겠습니까?",
                "데이터 소스 확인 필요",
                "선택하기", "취소",
                Messages.getQuestionIcon()
            )
            if (choice == Messages.OK) {
                val manualDataSourceName = Messages.showInputDialog(
                    project,
                    "데이터 소스 이름을 입력하세요:",
                    "수동 데이터 소스 지정",
                    Messages.getQuestionIcon()
                )
                if (manualDataSourceName.isNullOrBlank()) {
                    Messages.showMessageDialog(project, "데이터 소스 지정이 취소되었습니다.", "취소", Messages.getInformationIcon())
                    return
                }
                val manualDataSource = com.intellij.database.psi.DbPsiFacade.getInstance(project)
                    .dataSources.firstOrNull { it.name == manualDataSourceName }

                if (manualDataSource == null) {
                    Messages.showMessageDialog(project, "입력한 이름의 데이터 소스를 찾을 수 없습니다: $manualDataSourceName", "오류", Messages.getErrorIcon())
                    return
                }
                processSqlWithDataSource(project, editor, selectedText, manualDataSource)
            } else {
                Messages.showMessageDialog(project, "데이터 소스 지정이 취소되었습니다.", "취소", Messages.getInformationIcon())
            }
            return
        }
        processSqlWithDataSource(project, editor, selectedText, dataSource)
    }

    private fun processSqlWithDataSource(project: Project, editor: Editor, selectedText: String, dataSource: DbDataSource) {
        val dataSourceName = dataSource.name
        val commentProvider = IntelliJCacheColumnCommentProvider(project, dataSourceName)
        val injector = SqlCommentInjector(commentProvider)

        try {
            val commentedSql = injector.injectComments(selectedText)
            WriteCommandAction.runWriteCommandAction(project) {
                replaceSelectedText(editor, commentedSql)
            }
        } catch (ex: Exception) {
            Messages.showMessageDialog(
                project,
                "코멘트 삽입 중 오류가 발생했습니다: ${ex.message}",
                "오류",
                Messages.getErrorIcon()
            )
        }
    }

    private fun findDataSourceFromContext(project: Project, psiFile: PsiFile): DbDataSource? {
        val virtualFile: VirtualFile = psiFile.virtualFile ?: return null

        try {
            val manager = SqlDataSourceManager.getInstance(project)
            val allDataSources: List<SqlDataSourceImpl> = manager.getDataSources()

            val associatedDataSourceImpl = allDataSources.firstOrNull { dsImpl ->
                // TODO: `dsImpl` (SqlDataSourceImpl)이 `virtualFile`과 연결되어 있는지 확인하는 실제 로직 구현
                // 이 부분은 이전 답변의 TODO와 동일하게 실제 API를 찾아 구현해야 합니다.
                // 예를 들어, dsImpl을 DbDataSource로 캐스팅하여 관련 API를 사용하거나,
                // SqlUtil 등의 유틸리티를 사용합니다.
                // isFileAssociated(dsImpl as DbDataSource, virtualFile) // 가상의 헬퍼 함수
                false // 실제 확인 로직 필요
            }

            if (associatedDataSourceImpl != null) {
                // LOG.info("Found associated data source '${associatedDataSourceImpl.name}' for file: ${virtualFile.name}")
                // SqlDataSourceImpl은 DbDataSource의 구현체이므로, DbDataSource로 안전하게 반환 가능
                // 명시적으로 타입을 DbDataSource?로 지정하여 반환합니다.
                // 코틀린은 보통 업캐스팅을 자동으로 처리하지만, 여기서는 명시적으로 반환 타입을 맞춰줍니다.
                return associatedDataSourceImpl as DbDataSource // 명시적 캐스팅 (또는 타입 추론에 맡겨도 됨)
            } else {
                // LOG.info("No data source from SqlDataSourceManager.getDataSources() is associated with file: ${virtualFile.name}")
            }

        } catch (e: Throwable) {
            // LOG.warn("Exception while trying to get DbDataSource using SqlDataSourceManager for file: ${virtualFile.name}", e)
        }
        return null
    }

    override fun update(e: AnActionEvent) {
        val project: Project? = e.project
        val editor: Editor? = e.getData(CommonDataKeys.EDITOR)
        val psiFile: PsiFile? = e.getData(CommonDataKeys.PSI_FILE)

        val isEnabled = project != null &&
                editor != null &&
                psiFile != null &&
                psiFile.virtualFile != null &&
                editor.selectionModel.hasSelection() &&
                !editor.selectionModel.selectedText.isNullOrBlank()

        e.presentation.isEnabledAndVisible = isEnabled
    }

    private fun replaceSelectedText(editor: Editor, text: String) {
        val document = editor.document
        val selectionModel = editor.selectionModel
        val start = selectionModel.selectionStart
        val end = selectionModel.selectionEnd
        document.replaceString(start, end, text)
    }
}
