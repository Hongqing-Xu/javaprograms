package com.ahead09;

import java.io.File;

public class basic26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("test.txt");
		//�Ƿ����
		System.out.println(f.exists());
		//�ǲ���Ŀ¼
		System.out.println(f.isDirectory());
		//�ǲ����ļ��ķ���
		System.out.println(f.isFile());
		System.out.println(f.getName());
		System.out.println(f.getPath());
		
		System.out.println(f.getAbsolutePath());
	}

}
