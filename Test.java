package com.ahead09;
//����������
class Father{
	String name="����";
	public Father(String name){
		this.name=name;
		System.out.println("�����в����Ĺ��췽��");
	}
	public void method(){
		System.out.println(name+"�Ұ�ѧϰ");
	}
	public void study(){
		System.out.println(name+"����ѧϰjava");
	}
	public Father(){
		System.out.println("���Ǹ���Ĺ��췽��");
	}
	static void show(){
		System.out.println("��Ҫ׼�������ˣ�");
	}
	final void show1(){
		System.out.println("������̬������");
	}
}
//��ļ̳���
class Son extends Father{
	String name="С��";
	public Son(){
		
		System.out.println("��������Ĺ��췽��");
	}
	public Son(String name){
		super(name);
		this.name=name;
	}
	public void method(){
		
		System.out.println("�Ұ�����Ϸ��");
	}
	public void showMe(){
		System.out.println(super.name+"�һ���������");
	}
	
}
public class Test{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son xm = new Son();
		System.out.println(xm.name);
		xm.method();
		xm.study();
		xm.showMe();
		System.out.println(xm.toString());
		xm.show();
		
	}

}
