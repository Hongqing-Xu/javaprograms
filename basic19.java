package com.ahead09;

public class basic19 {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		int num=38;
		double num1 = 56.5;
		//Math类的ceil floor round等方法
		System.out.println(Math.ceil(num));
		System.out.println(Math.ceil(num1));
		System.out.println(Math.floor(num));
		System.out.println(Math.floor(num1));
		System.out.println(Math.round(num));
		System.out.println(Math.round(num1));
		Class.forName("abc");
		basic19  bb = new basic19();
		try {
			//对象回收
			bb.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
