package com.PApudding.Example13_4;

import java.awt.Container;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/***
 * 在项目中创建继承JFarme类的MyImageIcon类，在类中创建ImageIcon类的实例对象，该对象使用现有图片创建图标对象
 * @author ataoD
 *
 */
public class MyImageIcon {

	public MyImageIcon() {
		JFrame jf = new JFrame();
		Container container = jf.getContentPane();
		
		//创建一个标签
		JLabel jl = new JLabel("这是一个JFrame窗体",JLabel.CENTER);
		//获取图片所在的URL
		URL url = MyImageIcon.class.getResource("imageButton.jpg");
		Icon icon = new ImageIcon(url);		//实例化Icon对象
		jl.setIcon(icon);					//为标签设置图片
		//设置文字放置在标签中间
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		jl.setOpaque(true);
		container.add(jl);
		jf.setSize(250,100);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new MyImageIcon();
	}

}
