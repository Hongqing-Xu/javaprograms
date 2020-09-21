package com.ahead09;

import java.io.FileInputStream;

class bbb{
	//final修饰的方法是终态，只能被继承，不能被覆盖
	final void method() {
		//手动抛异常
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
public class basic10 extends bbb {

	
	
	
	
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//String ss = null;
		//System.out.println(ss.length());
		//basic10 bb = null;
		//System.out.println(bb.toString());
		//String num1 = "一百分";
		//字符串转成简单数据类型
		//int score1 = Integer.parseInt(num1);
		//String num2 = "98";
		//int score2 = Integer.parseInt(num2);
		//System.out.println("两门课的和："+(score1+score2));
	//	FileInputStream fis = new FileInputStream("D:\\test123.txt");
		//basic10 b = new basic10();
		//b.method();
	
		
	}

}
