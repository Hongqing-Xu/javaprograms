package com.ahead09;

import java.util.Scanner;

public class demo8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("����༶��������");
		int num = input.nextInt();
		int n=0;
		for(int i=0;i<num;i++){
			System.out.println("�������"+(i+1)+"λѧ���ĳɼ���");
			int score=input.nextInt();
			if(score>=80)
				n++;
		}
		System.out.println("80�����ϵ�ѧ��������"+n);
		double bi=(n/(num*1.0))*100;
		System.out.println("80�����ϵ�ѧ����ռ�ı���Ϊ��"+bi+"%");
	}

}
