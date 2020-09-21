package com.ahead09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class basic8 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//运行时异常
		//System.out.println(10/0);
		//int num[] = new int[3];
		//System.out.println(num[3]);
		
		
		//非运行时异常
	
		
		Exception exc;
		//try-catch语句处理    捕获异常
		try{
			//可能出现异常的语句
			System.out.println("你真是太帅了！");
			System.out.println(10/1);
			System.out.println("你真是太帅了！");
		}catch(ArithmeticException e){
			
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println("除数不能为零");
			
		}
		System.out.println("处理异常后面的语句！");
		
		//自动生成try-catch块       try  alt+/
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
