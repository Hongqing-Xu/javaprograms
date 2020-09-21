package com.ahead09;

public class basic13 {
	
	void method()throws Exception{
		int a[]={1,2,3};
		a[3]=5;
		
	}
	void show(){
		try {
			method();
		} catch (Exception e) {
			// TODO: handle exception
		}
		//在方法体中抛异常，通常用于自定义异常
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basic13 bb = new basic13();
		bb.show();
		System.out.println("学习throws抛异常");
	}
}
