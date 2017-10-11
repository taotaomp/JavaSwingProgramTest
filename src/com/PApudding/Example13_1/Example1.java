package com.PApudding.Example13_1;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/***
 * 在项目中创建Example1类，该类继承JFrame类成为窗体类，再改类中创建标签组件，并添加到窗体界面中
 * @author ataoD
 *
 */
public class Example1 extends JFrame{
	public void CreatJFrame(String title) {
		JFrame jf = new JFrame(title);		//实例化JFrame对象，title 为窗口标题
		Container container = jf.getContentPane();	//用JFrame对象的“获取容器方法”实例化一个容器
		JLabel jl = new JLabel("这是一个JFrame窗体");
		//使标签上的文字居中
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		
		container.add(jl);					//添加标签到容器中
		container.setBackground(Color.white);
		
		jf.setVisible(true); 				//使窗体可视
		jf.setSize(200, 150);				//设置窗体大小
		//设置窗体关闭方式
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Example1().CreatJFrame("创建一个JFrame窗体");
	}

}
