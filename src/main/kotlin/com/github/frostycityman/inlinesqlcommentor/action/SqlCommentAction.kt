package com.github.frostycityman.inlinesqlcommentor.action

import IntelliJCacheColumnCommentProvider
import com.github.frostycityman.inlinesqlcommentor.sql.injector.SqlCommentInjector
import com.intellij.database.dataSource.LocalDataSource
import com.intellij.database.model.DasDataSource
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.command.WriteCommandAction
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import com.intellij.psi.PsiFile
import com.intellij.database.psi.DbDataSource // DbDataSource 사용
import com.intellij.database.psi.DbPsiFacade
import com.intellij.sql.database.SqlDataSourceManager // SqlDataSourceManager 임포트
import com.intellij.sql.database.SqlDataSourceImpl // SqlDataSourceImpl 임포트
import com.intellij.database.util.DbSqlUtil
import com.intellij.database.util.DbUtil
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.util.containers.JBIterable

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
                val manualDataSource = DbPsiFacade.getInstance(project)
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

    private fun findDataSourceFromContext(project: Project, psiFile: PsiFile): com.intellij.database.psi.DbDataSource? {
        val virtualFile: VirtualFile = psiFile.virtualFile ?: return null
        val dbFacade = DbPsiFacade.getInstance(project)

        // isFileAssociatedWithPsiDataSource 함수를 호출하도록 변경
        return dbFacade.dataSources.firstOrNull { psiDbDataSource ->
            isFileAssociated(psiDbDataSource, virtualFile, project)
        }
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


    /**
     * 주어진 파일이 특정 데이터 소스에 연결된 파일인지 확인합니다.
     */


    private fun isFileAssociated(
        dbDataSource: DbDataSource,
        file: VirtualFile,
        project: Project
    ): Boolean {
        val associatedDataSources = DbSqlUtil.getDataSources(project)
        return associatedDataSources.any { localDs ->
            val dasDataSource = localDs?.delegate as? DasDataSource
            val targetDasDataSource = dbDataSource.delegate as? DasDataSource
            dasDataSource != null && targetDasDataSource != null &&
                    dasDataSource.uniqueId == targetDasDataSource.uniqueId
        }
    }

}
