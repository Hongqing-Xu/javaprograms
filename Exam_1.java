package com.ahead09;
class Per{
	String name;
	int age;
	public Per(String name,int age){
		this.name=name;
		this.age=age;
	}
}
public class Exam_1 {
	static Per obj(Per p){
		p.name="lisi";
		
		
		return p;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Per mm=new Per("zhangsan",22);
		System.out.println(mm.name);
		Per nn = obj(mm);
		System.out.println(nn.name);
		System.out.println(mm.name);
	}

}
