package com.ahead09;
class MyThread2 implements Runnable{

	private int count =0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		test();
	}
	//������������һ���̶߳�������������ʱ�������̲߳��ܽ�������������ֳ�Ϊͬ������
	private synchronized void test(){
		for(int i=0;i<5;i++){
			count++;
			Thread.yield();
			count--;
			System.out.print(count+" ");
			
		}
		
	}
	
	
}

public class ThreadExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 t = new MyThread2();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		t2.start();
	}

}
