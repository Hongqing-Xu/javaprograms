package com.ahead09;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class basic30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("aaa");
		f.setSize(400, 300);
		f.setBackground(Color.RED);
		f.setForeground(Color.CYAN);
		
		
		//Ϊ����������һ���¼�����������������Ĺرհ�ť
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		
		f.setVisible(true);
	}

}
