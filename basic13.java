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
		//�ڷ����������쳣��ͨ�������Զ����쳣
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
		System.out.println("ѧϰthrows���쳣");
	}
}
