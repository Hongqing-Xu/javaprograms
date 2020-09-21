package com.ahead09;


//自定义Person类
class Person{
	//定义属性
	int  age;
	double  weight;

	//定义方法
	void showMe(){
		System.out.println("我爱阅读");
		
	}
	
}
class School{
	//定义属性
	String name=null;
	int  classNum=0;
	int  labNum=0;
	boolean boo;
	//定义方法
	void method(){
		System.out.println(name+"有"+classNum+"个教室，有"+labNum+"实验室"+boo);
		
	}
}

//公共类
public class demo10 {
	//定义属性
	
	//定义方法
	
	
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.showMe();
		//创建对象
		School s1=new School();
		s1.method();
		s1.name="江西软件职业技术大学";
		s1.classNum=100;
		s1.labNum=100;
		s1.method();
		
		
	}	
}
