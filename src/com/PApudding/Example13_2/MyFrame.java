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
			 Container container = jf.getContentPane();		//创建一个容器
			 container.setLayout(null);
			 jf.setVisible(true);
			 jf.setSize(200, 150);
			 jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			 
			 JLabel jl = new JLabel("这是一个JFrame窗体");
			 //将标签的文字置于标签中间位置
			 jl.setHorizontalAlignment(SwingConstants.CENTER);
			 container.add(jl);
			 
			 JButton bl = new JButton("弹出对话框");
			 bl.setBounds(10, 10, 100, 21);
			 bl.addActionListener(new ActionListener() {	//为按钮添加鼠标单机按钮事件
				
				@Override
				public void actionPerformed(ActionEvent e) {
					//使MyJDialog窗体可见
					new MyJDialog(MyFrame.this).setVisible(true);
				}
			});
			 container.add(bl);
			 
			 
		}
		
		public static void main(String[] args) {
			new MyFrame();
		}
}
