package com.ahead09;

import java.util.Scanner;

public class demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=(int)(Math.random()*3);
		Scanner in=new Scanner(System.in);
		System.out.println("������һ����λ���Ļ�Ա��");
		int castNo=in.nextInt();
		//���˻�Ա���м������������ͬ���������˻�Ա
		int num=castNo/10%10;
		if(i==num){
			System.out.println(castNo+"��Ա�����н��ˣ�");
			
		}else{
			
			System.out.println("лл�ݹˣ�");
		}
	}

}
