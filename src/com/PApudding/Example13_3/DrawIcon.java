package com.PApudding.Example13_3;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/***
 * p230
 * 在项目中创建实现Icon接口的DrawIcon类，该类实现自定义的图标类
 * @author ataoD
 *
 */
public class DrawIcon implements Icon{
	private int width;		//声明图标的宽
	private int height;		//声明图标的长
	
	public int getIconHeight() {	//实现接口内getIconHeight()方法
		return this.height;
	}
	public int getIconWidth() {		//实现接口内getIconWidth()方法
		return this.width;		
	}
	
	public DrawIcon(int width, int height) {	//定义构造方法
		this.height = height;
		this.width = width;
	}
	
	public void paintIcon(Component c, Graphics g, int x, int y) {		//实现接口内printIcon()方法
		g.fillOval(x, y, width, height);		//绘制一个圆形
	}
	
	public static void main(String[] args) {
		DrawIcon icon = new DrawIcon(15, 15);
		
		JFrame jf = new JFrame();
		Container container = jf.getContentPane();
		jf.setSize(200, 150);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//创建一个标签，并设置标签上的文字在标签正中间
		JLabel jl = new JLabel("测试",icon,SwingConstants.CENTER);
		jl.setBounds(50, 50, 50, 50);
		container.add(jl);
	}
	
	
	

}
