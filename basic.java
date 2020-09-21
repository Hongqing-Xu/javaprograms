package com.ahead09;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class basic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建了一个窗体，窗体默认不可见
		JFrame f = new JFrame("abc");
		//Frame f2 = new Frame("aaa");
		//f.setBackground(Color.red);
		//f.setForeground(Color.red);
		//设置窗体大小
		f.setSize(400, 300);
		
		
		//窗体布局管理器  setLayout()
		f.setLayout(new FlowLayout());
		JLabel jl = new JLabel("计算器");
		f.add(jl);
		JTextField jtf = new JTextField(40);
		f.add(jtf);
		//创建两个按钮
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		//把组件加入到容器中
		f.add(b1);
		f.add(b2);
		//让窗体可见
		f.setVisible(true);
	}

}
