package com.ahead09;


//�Զ���Person��
class Person{
	//��������
	int  age;
	double  weight;

	//���巽��
	void showMe(){
		System.out.println("�Ұ��Ķ�");
		
	}
	
}
class School{
	//��������
	String name=null;
	int  classNum=0;
	int  labNum=0;
	boolean boo;
	//���巽��
	void method(){
		System.out.println(name+"��"+classNum+"�����ң���"+labNum+"ʵ����"+boo);
		
	}
}

//������
public class demo10 {
	//��������
	
	//���巽��
	
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.showMe();
		//��������
		School s1=new School();
		s1.method();
		s1.name="�������ְҵ������ѧ";
		s1.classNum=100;
		s1.labNum=100;
		s1.method();
		
		
	}	
}
