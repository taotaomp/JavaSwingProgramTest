package com.PApudding.Example13_2;

import java.awt.Container;

import javax.swing.*;

public class MyJDialog extends JDialog {
/***
 * 在项目中创建MyJDialog类，该类继承JDialog窗体，并再窗口中添加按钮，当用户单击该按钮后，将弹出一个对话框窗体。
 * @param args
 */
	public MyJDialog(MyFrame frame) {
		//实例化一个JDialog类对象，指定对话框的父容器、窗体标题和类型
		super(frame,"第一个JDialog窗体",true);
		Container container = getContentPane();
		container.add(new JLabel("这是一个对话框"));
		setBounds(120, 120, 100, 100);
	}

}

