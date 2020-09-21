package com.ahead09;

import java.io.File;

public class basic26 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("test.txt");
		//是否存在
		System.out.println(f.exists());
		//是不是目录
		System.out.println(f.isDirectory());
		//是不是文件的方法
		System.out.println(f.isFile());
		System.out.println(f.getName());
		System.out.println(f.getPath());
		
		System.out.println(f.getAbsolutePath());
	}

}
