package com.PApudding.Example13_2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class MyFrame extends JFrame{
		public MyFrame() {
			 JFrame jf = new JFrame();
			 Container container = jf.getContentPane();		//����һ������
			 container.setLayout(null);
			 jf.setVisible(true);
			 jf.setSize(200, 150);
			 jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			 
			 JLabel jl = new JLabel("����һ��JFrame����");
			 //����ǩ���������ڱ�ǩ�м�λ��
			 jl.setHorizontalAlignment(SwingConstants.CENTER);
			 container.add(jl);
			 
			 JButton bl = new JButton("�����Ի���");
			 bl.setBounds(10, 10, 100, 21);
			 bl.addActionListener(new ActionListener() {	//Ϊ��ť�����굥����ť�¼�
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//ʹMyJDialog����ɼ�
					new MyJDialog(MyFrame.this).setVisible(true);
				}
			});
			 container.add(bl);
			 
			 
		}
		
		public static void main(String[] args) {
			new MyFrame();
		}
}
