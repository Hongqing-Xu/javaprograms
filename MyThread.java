package com.ahead09;

public class MyThread  extends Thread{

	//�߳��������Ĺ�����Ҫ���Ƕ���run����
	public void run(){
		for(int i=0;i<=9;i++){
			System.out.println(getName()+":  "+i+" ");
			
				//�߳�����
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
		//���߳���������
		//1.�����̶߳���
		MyThread mt = new MyThread();
		System.out.println(mt.getName());
		//2.�߳̾���
		mt.start();
		MyThread mt2 = new MyThread();
		System.out.println(mt2.getName());
		mt2.start();
	}

}
