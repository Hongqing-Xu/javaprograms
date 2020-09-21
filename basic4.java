package com.ahead09;
//父类
class Animal{
	public void method(){
		System.out.println("我会动！");
	}
	//public abstract showme();
}
//子类1
class Bird extends Animal{
	public void method(){
		System.out.println("我会飞！");
	}	
}
//子类2
class Fish extends Animal{
	public void method(){
		System.out.println("我会游！");
	}
}
public class basic4 {
	public static void main(String[] args) {
		//演示类的多态性
		Animal  aa = new Animal();
		aa.method();
		//子类对象赋值给父类对象
		Animal  bb1 = new Bird();
		bb1.method();
		Animal ff = new Fish();
		ff.method();
		//延申一个类型转换的问题
		String score1 = "99";
		String score2 = "98";
		//非运行时异常
		//int sum = (int)score1+(int)score2;
		Bird  bb2 = new Bird();
		bb2 = (Bird)bb1;
		bb2.method();
		Bird bb3 = new Bird();
		//运行时类型转换异常       ClassCastException
		bb3 = (Bird)ff;
		bb3.method();
	}

}
