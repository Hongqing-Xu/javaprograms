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
		
		
		//为窗体增加了一个事件监听器，监听窗体的关闭按钮
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		
		f.setVisible(true);
	}

}
