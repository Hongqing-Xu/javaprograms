package com.ahead09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Animal11{
	
	
}
class Bird1 extends Animal11{
	
	
}
class Big1 extends Animal11{
	
	
}

public class basic27 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//运行时异常   --算数运算异常   ArithmeticException
		//System.out.println(1/0);
		//运行时异常 --数据格式异常 NumberFormatException
		/*
		String str = "中国";
		int num = Integer.parseInt(str);
		System.out.println(num);
		*/
		//运行时异常 --数组下标越界异常ArrayIndexOutOfBoundsException
		//int a[] ={1,2,3,4,5};
		//a[5]=99;
		//运行时异常 --类型转换异常ClassCastException
		
		/*
		 * Animal11 aa = new Bird1();
		
		Bird1 bb = (Bird1)aa;
		Big1 big = (Big1)aa;
		 */
		//运行时异常 --空对象异常NullPointerException
				String str1 =null;
				System.out.println(str1.length());
				
		File  f = new File("d:\\test123.txt");
		//非运行时异常 --输入输出流异常 IOException
		try {
			FileInputStream fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
