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
		//����ʱ�쳣   --���������쳣   ArithmeticException
		//System.out.println(1/0);
		//����ʱ�쳣 --���ݸ�ʽ�쳣 NumberFormatException
		/*
		String str = "�й�";
		int num = Integer.parseInt(str);
		System.out.println(num);
		*/
		//����ʱ�쳣 --�����±�Խ���쳣ArrayIndexOutOfBoundsException
		//int a[] ={1,2,3,4,5};
		//a[5]=99;
		//����ʱ�쳣 --����ת���쳣ClassCastException
		
		/*
		 * Animal11 aa = new Bird1();
		
		Bird1 bb = (Bird1)aa;
		Big1 big = (Big1)aa;
		 */
		//����ʱ�쳣 --�ն����쳣NullPointerException
				String str1 =null;
				System.out.println(str1.length());
				
		File  f = new File("d:\\test123.txt");
		//������ʱ�쳣 --����������쳣 IOException
		try {
			FileInputStream fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
