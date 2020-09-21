package com.ahead09;
//类的深入解析
class Father{
	String name="大王";
	public Father(String name){
		this.name=name;
		System.out.println("我是有参数的构造方法");
	}
	public void method(){
		System.out.println(name+"我爱学习");
	}
	public void study(){
		System.out.println(name+"正在学习java");
	}
	public Father(){
		System.out.println("我是父类的构造方法");
	}
	static void show(){
		System.out.println("我要准备做饭了！");
	}
	final void show1(){
		System.out.println("我是终态方法！");
	}
}
//类的继承性
class Son extends Father{
	String name="小王";
	public Son(){
		
		System.out.println("我是子类的构造方法");
	}
	public Son(String name){
		super(name);
		this.name=name;
	}
	public void method(){
		
		System.out.println("我爱玩游戏！");
	}
	public void showMe(){
		System.out.println(super.name+"我还爱发明！");
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
