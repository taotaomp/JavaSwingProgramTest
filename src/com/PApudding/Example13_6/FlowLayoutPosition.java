package com.PApudding.Example13_6;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

/***
 * 在项目中创建FlowLayoutPosition类，该类继承JFrame类成为窗体组件。设置该窗体的布局管理器为
 * FlowLayout布局管理器的实例对象
 * @author ataoD
 *
 */
public class FlowLayoutPosition extends JFrame{
	public FlowLayoutPosition() {
		setTitle("本窗体使用流布局管理器");
		
		Container c = getContentPane();
		//设置窗体使用流布局管理器，是组件右对齐，并且设置组件之间的水平间隔与垂直间隔均为10
		setLayout(new FlowLayout(2,10,10));
		for (int i = 0; i < 10; i++) {		//在容器中循环添加10个按钮
			c.add(new JButton("Button"+i));
		}
		setSize(300,200);
		setVisible(true);
		//设置窗体关闭方式
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			new FlowLayoutPosition();
	}

}
