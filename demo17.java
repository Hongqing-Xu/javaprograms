package com.ahead09;

import java.util.Scanner;

public class demo17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����
		
		//Ϊ��������ڴ�ռ�
		int a[]=new int[5];
		
		Scanner input = new Scanner(System.in);
		int score;
		int sum=0;
		for(int i=0;i<5;i++){
			System.out.println("������ɼ�");
			a[i] = input.nextInt();
			sum+=a[i];
			
		}
		System.out.println("ƽ����"+(sum/5.0));
		System.out.println("��������Ҫ��ѯ�Ŀγ�");
		int num = input.nextInt();
		System.out.println("��"+num+"�ſεĳɼ�Ϊ��"+a[num-1]);
		//int b[]={1,2,3,4,5}; 
		int  b[]=new int[5];
		b[0] =90;  
	}
}
