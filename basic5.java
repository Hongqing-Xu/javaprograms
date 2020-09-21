package com.ahead09;

abstract class Shape{
	
	String name;
	public void method(){
		System.out.println("我是抽象类中的普通方法！");
	}
	//抽象类中定义抽象方法
	public abstract void showMe();
}
class Rec extends Shape{

	@Override
	public void showMe() {
		// TODO Auto-generated method stub
		System.out.println("我是一个矩形");
	}	
}
public class basic5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
