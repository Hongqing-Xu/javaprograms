package com.ahead09;

public class demo11 {
	
	String name;
	int age;
	public static void m(){
		
		System.out.println("我是一个静态方法！");
	}
	public void method(){
		
		System.out.println("hello");
	}
	
	public void showMe(){
		m();
		method();
		System.out.println("world");
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo11 dd = new demo11();
		dd.showMe();
		m();
		
	}

}
