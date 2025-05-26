package com.frostycityman.inlineSQLCommentor;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

import javax.swing.*;

public class MyPluginAction extends AnAction {
	@Override
	public void actionPerformed(AnActionEvent e) {
		JOptionPane.showMessageDialog(null, "SQL Annotator 실행됨!");
	}
}
