package com.frostycityman.inlineSQLCommentor.annotator;

import com.intellij.lang.annotation.AnnotationHolder;
import com.intellij.lang.annotation.Annotator;
import com.intellij.lang.annotation.HighlightSeverity;
import com.intellij.psi.PsiElement;
import com.intellij.psi.util.PsiTreeUtil;
import org.jetbrains.annotations.NotNull;

public class SqlInlineCommentAnnotator implements Annotator {

	@Override
	public void annotate(@NotNull PsiElement element, @NotNull AnnotationHolder holder) {
		// SQL 컬럼으로 판단되는 PSI 노드인지 확인
		if (!isColumnName(element)) return;

		String columnName = element.getText();

		// 컬럼 설명을 가져오는 로직 (임시 하드코딩)
		String comment = getCommentForColumn(columnName);
		if (comment == null) return;

		// 인라인 주석 생성
		holder.newSilentAnnotation(HighlightSeverity.INFORMATION)
				.range(element.getTextRange())
				.tooltip("컬럼 설명: " + comment)
				.create();
	}

	private boolean isColumnName(PsiElement element) {
		// 간단한 예시: SQL_IDENTIFIER나 COLUMN_NAME에 해당하는지 검사
		String elementType = element.getNode().getElementType().toString().toLowerCase();
		return elementType.contains("identifier") || elementType.contains("column");
	}

	private String getCommentForColumn(String columnName) {
		// TODO: 실제 DB 메타정보 조회로 변경
		return switch (columnName.toLowerCase()) {
			case "user_id" -> "사용자 고유번호";
			case "created_at" -> "생성 시각";
			case "status" -> "상태 코드";
			default -> null;
		};
	}
}
