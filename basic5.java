package com.ahead09;

abstract class Shape{
	
	String name;
	public void method(){
		System.out.println("���ǳ������е���ͨ������");
	}
	//�������ж�����󷽷�
	public abstract void showMe();
}
class Rec extends Shape{

	@Override
	public void showMe() {
		// TODO Auto-generated method stub
		System.out.println("����һ������");
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
