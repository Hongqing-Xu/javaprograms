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
		//������һ�����壬����Ĭ�ϲ��ɼ�
		JFrame f = new JFrame("abc");
		//Frame f2 = new Frame("aaa");
		//f.setBackground(Color.red);
		//f.setForeground(Color.red);
		//���ô����С
		f.setSize(400, 300);
		
		
		//���岼�ֹ�����  setLayout()
		f.setLayout(new FlowLayout());
		JLabel jl = new JLabel("������");
		f.add(jl);
		JTextField jtf = new JTextField(40);
		f.add(jtf);
		//����������ť
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		//��������뵽������
		f.add(b1);
		f.add(b2);
		//�ô���ɼ�
		f.setVisible(true);
	}

}
