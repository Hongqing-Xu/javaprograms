package com.ahead09;

interface CPU{
	//接口只能定义抽象方法，而且抽象方法不需要abstract
	void getName();
	void getSpeed();
}

class A{
	
	
	
}
class CPUimpl extends A implements CPU{
	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("这是一个intel的cpu");
	}
	@Override
	public void getSpeed() {
		// TODO Auto-generated method stub
		System.out.println("主频5GB");
	}	
}
public class basic6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU cc = new CPUimpl();
		cc.getName();
	}

}
