package com.PApudding.Example13_2;

import java.awt.Container;

import javax.swing.*;

public class MyJDialog extends JDialog {
/***
 * ����Ŀ�д���MyJDialog�࣬����̳�JDialog���壬���ٴ�������Ӱ�ť�����û������ð�ť�󣬽�����һ���Ի����塣
 * @param args
 */
	public MyJDialog(MyFrame frame) {
		//ʵ����һ��JDialog�����ָ���Ի���ĸ�������������������
		super(frame,"��һ��JDialog����",true);
		Container container = getContentPane();
		container.add(new JLabel("����һ���Ի���"));
		setBounds(120, 120, 100, 100);
	}

}

