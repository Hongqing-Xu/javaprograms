package com.ahead09;

import java.util.Scanner;

public class demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*********�����嵥********");
		int tPrice=245;
		int xiePrice=570;
		int padPrice=320;
		System.out.println("������Ʒ\t����\t����\t���");
		System.out.println("T��\t��"+tPrice+"\t2\t��"+tPrice*2);
		System.out.println("T��\t��"+xiePrice+"\t1\t��"+xiePrice*1);
		System.out.println("T��\t��"+padPrice+"\t1\t��"+padPrice*1);
		System.out.println("�ۿۣ�\t8��");
		double total=(tPrice*2+xiePrice*1+padPrice*1)*0.8;
		System.out.println("�����ܽ�\t"+total);
		Scanner iii=new Scanner(System.in);
		System.out.print("ʵ�ʽ��ѣ�");
		int money=iii.nextInt();
		System.out.println("��Ǯ����"+(money-total));
		int jf=(int)(total/100*3);
		System.out.println("���ι�������õĻ�����:"+jf);
		
	}

}
