package com.ahead09;

public class basic28 extends Thread {

	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(getName()+" "+i+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basic28 b1=new basic28();
		basic28 b2=new basic28();
		b1.start();
		b2.start();
	}

}
