package com.ahead09;

public class My2 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=9;i++){
			System.out.println(i+" ");
			//Ïß³ÌÐÝÃß
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable tt1 = new My2();
		Runnable tt2 = new My2();
		Thread t1 = new Thread(tt1);
		Thread t2 = new Thread(tt2);
		t1.start();
		t2.start();
	}

	

}
