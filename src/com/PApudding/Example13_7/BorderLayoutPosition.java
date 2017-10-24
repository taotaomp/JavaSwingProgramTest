package com.PApudding.Example13_7;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
/***
 * 在项目中创建BorderLayoutPosition类，该类继承JFrame类成为窗体组件，
 * 设置该窗体的布局管理器使用BorderLayout类的实例对象
 * @author ataoD
 *
 */
public class BorderLayoutPosition extends JFrame{
	
	//定义组件摆放的位置的数组
	String[] border = {BorderLayout.CENTER,BorderLayout.NORTH,
			BorderLayout.SOUTH,BorderLayout.WEST,BorderLayout.EAST};
	String[] buttonName = {"center button","north button","south button",
			"west button","east button"};
	
	public BorderLayoutPosition() {
		setTitle("这个窗体使用边界布局管理器");
		Container c = getContentPane();
		setLayout(new BorderLayout());		//***设置容器为边界布局管理器
		for (int i = 0; i < border.length; i++) {
			//在容器中添加按钮，并设置按钮布局
			c.add(border[i], new JButton(buttonName[i]));
		}
		setSize(350,200);
		setVisible(true);
		//设置窗体关闭方式
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new BorderLayoutPosition();
	}

}
