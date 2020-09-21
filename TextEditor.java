package com.ahead09;

import java.awt.*;

import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;

public class TextEditor extends Frame{
	//成员属性
	MenuBar mainmenubar;
	Menu file ;
	MenuItem nw;
	MenuItem op;
	MenuItem cl;
	MenuItem sf;
	MenuItem ex;
	//成员属性2  编辑文本区域属性
	TextArea tx;
	//构造方法
	public TextEditor(String title){
		super(title);
		setSize(400, 400);
		//使窗体在屏幕上居中位置
		setLocationRelativeTo(null);
		menuinit();
		setVisible(true);
	}
	//菜单构建与处理
	void menuinit(){
		mainmenubar = new MenuBar();
		file = new Menu("文件");
		nw = new MenuItem("新建文件");
		op = new MenuItem("打开文件");
		cl = new MenuItem("关闭文件");
		sf = new MenuItem("保存文件");
		ex = new MenuItem("退    出");
		file.add(nw);
		file.add(op);
		file.add(cl);
		file.add(sf);
		file.add(ex);
		mainmenubar.add(file);
		setMenuBar(mainmenubar);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextEditor("简易文本编辑器");
	}

}
