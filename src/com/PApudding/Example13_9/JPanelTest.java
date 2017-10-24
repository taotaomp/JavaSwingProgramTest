package com.PApudding.Example13_9;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class JPanelTest extends JFrame{

	public JPanelTest() {
		Container c = getContentPane();
		//将整个容器设置为2行1列的网格布局
		c.setLayout(new GridLayout(2,2,10,10));
		//初始化一个面板，设置1行3列的网购布局
		JPanel p1 = new JPanel(new GridLayout(1,3,10,10));
		JPanel p2 = new JPanel(new GridLayout(1,2,10,10));
		JPanel p3 = new JPanel(new GridLayout(1,2,10,10));
		JPanel p4 = new JPanel(new GridLayout(2,1,10,10));
		p1.add(new JButton("1.1"));	//在面板中添加按钮
		p1.add(new JButton("1.2"));	
		p1.add(new JButton("1.3"));	
		p2.add(new JButton("2.1"));
		p2.add(new JButton("2.2"));
		p3.add(new JButton("3"));
		p4.add(new JButton("4.1"));
		p4.add(new JButton("4.2"));
		
		c.add(p1);
		c.add(p2);
		c.add(p3);
		c.add(p4);
		
		setVisible(true);
		setSize(500, 600);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new JPanelTest();
	}

}
