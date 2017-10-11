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
 * ����Ŀ�д���ʵ��Icon�ӿڵ�DrawIcon�࣬����ʵ���Զ����ͼ����
 * @author ataoD
 *
 */
public class DrawIcon implements Icon{
	private int width;		//����ͼ��Ŀ�
	private int height;		//����ͼ��ĳ�
	
	public int getIconHeight() {	//ʵ�ֽӿ���getIconHeight()����
		return this.height;
	}
	public int getIconWidth() {		//ʵ�ֽӿ���getIconWidth()����
		return this.width;		
	}
	
	public DrawIcon(int width, int height) {	//���幹�췽��
		this.height = height;
		this.width = width;
	}
	
	public void paintIcon(Component c, Graphics g, int x, int y) {		//ʵ�ֽӿ���printIcon()����
		g.fillOval(x, y, width, height);		//����һ��Բ��
	}
	
	public static void main(String[] args) {
		DrawIcon icon = new DrawIcon(15, 15);
		
		JFrame jf = new JFrame();
		Container container = jf.getContentPane();
		jf.setSize(200, 150);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//����һ����ǩ�������ñ�ǩ�ϵ������ڱ�ǩ���м�
		JLabel jl = new JLabel("����",icon,SwingConstants.CENTER);
		jl.setBounds(50, 50, 50, 50);
		container.add(jl);
	}
	
	
	

}
