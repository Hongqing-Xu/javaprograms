package com.ahead09;

public class MyThread  extends Thread{

	//线程类的子类的功能主要就是定义run方法
	public void run(){
		for(int i=0;i<=9;i++){
			System.out.println(getName()+":  "+i+" ");
			
				//线程休眠
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//多线程生命周期
		//1.创建线程对象
		MyThread mt = new MyThread();
		System.out.println(mt.getName());
		//2.线程就绪
		mt.start();
		MyThread mt2 = new MyThread();
		System.out.println(mt2.getName());
		mt2.start();
	}

}
