package com.PApudding.Example13_5;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
/***
 * 在项目中创建继承JFrame窗体组件的AbsolutePosition类，设置布局管理器为null,即使用绝对定位的布局方式，创建两个按钮组件
 * 将按钮分别定位在不同的窗体位置上
 * @author ataoD
 *
 */
public class AbsolutePosition extends JFrame
{
	public AbsolutePosition() {
		
		JFrame jf = new JFrame();
		jf.setVisible(true);
		jf.setTitle("本窗体使用绝对布局");
		jf.setLayout(null);	//使该窗体取消布局管理器设置
		jf.setBounds(0,0,200,150);		//绝对定位窗体的位置与大小
		Container c = jf.getContentPane();		//创建容器对象
		JButton b1 = new JButton("按钮1");
		JButton b2 = new JButton("按钮2");
		b1.setBounds(10, 30, 80, 30);	//设置按钮的位置大小
		b2.setBounds(60, 70, 100, 20);
		c.add(b1);		//将按钮添加到容器中
		c.add(b2);
		//设置窗体关闭方式
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new AbsolutePosition();
	}

}
