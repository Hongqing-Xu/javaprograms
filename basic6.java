package com.ahead09;

interface CPU{
	//�ӿ�ֻ�ܶ�����󷽷������ҳ��󷽷�����Ҫabstract
	void getName();
	void getSpeed();
}

class A{
	
	
	
}
class CPUimpl extends A implements CPU{
	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("����һ��intel��cpu");
	}
	@Override
	public void getSpeed() {
		// TODO Auto-generated method stub
		System.out.println("��Ƶ5GB");
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
