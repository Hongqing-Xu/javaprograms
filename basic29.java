package com.ahead09;

class MyThread11 extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(getName()+":"+i);
			//yield();
		}
	}
	
	
}

public class basic29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread11 mt0 = new MyThread11();
		MyThread11 mt1= new MyThread11();
		//启动线程之前设置线程对象的优先级
		mt0.setPriority(1);
		mt1.setPriority(10);
		mt0.start();
		
		mt1.start();
		try {
			mt1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
