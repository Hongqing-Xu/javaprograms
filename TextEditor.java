package com.ahead09;

import java.awt.*;

import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;

public class TextEditor extends Frame{
	//��Ա����
	MenuBar mainmenubar;
	Menu file ;
	MenuItem nw;
	MenuItem op;
	MenuItem cl;
	MenuItem sf;
	MenuItem ex;
	//��Ա����2  �༭�ı���������
	TextArea tx;
	//���췽��
	public TextEditor(String title){
		super(title);
		setSize(400, 400);
		//ʹ��������Ļ�Ͼ���λ��
		setLocationRelativeTo(null);
		menuinit();
		setVisible(true);
	}
	//�˵������봦��
	void menuinit(){
		mainmenubar = new MenuBar();
		file = new Menu("�ļ�");
		nw = new MenuItem("�½��ļ�");
		op = new MenuItem("���ļ�");
		cl = new MenuItem("�ر��ļ�");
		sf = new MenuItem("�����ļ�");
		ex = new MenuItem("��    ��");
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
		new TextEditor("�����ı��༭��");
	}

}
