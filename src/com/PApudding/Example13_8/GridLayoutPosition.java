﻿package com.PApudding.Example13_8;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
/***
 * 在项目中创建GridLayoutPosition类，该类继承JFrame类成为窗体组件，设置该窗体使用GridLayout布局管理器。
 * @author ataoD
 *
 */
public class GridLayoutPosition extends JFrame{
	public GridLayoutPosition() {
		Container c = getContentPane();
		//设置容器使用网格布局管理器，设置7行3列的网格
		setLayout(new GridLayout(7, 3, 5, 5));
		for (int i = 0; i < 20; i++) {
			c.add(new JButton("button"+i));		//循环添加按钮
		}
		setSize(300,300);
		setTitle("这是一个使用网格布局管理器的窗体");
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new GridLayoutPosition();
	}

}
