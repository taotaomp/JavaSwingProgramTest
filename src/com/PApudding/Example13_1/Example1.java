package com.PApudding.Example13_1;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/***
 * ����Ŀ�д���Example1�࣬����̳�JFrame���Ϊ�����࣬�ٸ����д�����ǩ���������ӵ����������
 * @author ataoD
 *
 */
public class Example1 extends JFrame{
	public void CreatJFrame(String title) {
		JFrame jf = new JFrame(title);		//ʵ����JFrame����title Ϊ���ڱ���
		Container container = jf.getContentPane();	//��JFrame����ġ���ȡ����������ʵ����һ������
		JLabel jl = new JLabel("����һ��JFrame����");
		//ʹ��ǩ�ϵ����־���
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		
		container.add(jl);					//��ӱ�ǩ��������
		container.setBackground(Color.white);
		
		jf.setVisible(true); 				//ʹ�������
		jf.setSize(200, 150);				//���ô����С
		//���ô���رշ�ʽ
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new Example1().CreatJFrame("����һ��JFrame����");
	}

}
