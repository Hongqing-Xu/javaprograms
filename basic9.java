package com.ahead09;

import java.util.Scanner;

public class basic9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum;
		int num1,num2;
		String score1,score2;
		try {
			System.out.println("�������һ�ſεĳɼ���");
			score1 = input.next();
			System.out.println("������ڶ��ſεĳɼ���");
			score2 = input.next();
			//��ֵ����ַ�������ת�ɻ�����ֵ����
			num1 = Integer.parseInt(score1);
			num2 = Integer.parseInt(score2);
			System.out.println("���ųɼ��ĺͣ�"+(num1+num2));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("��������ݲ��Ϸ���");
		}
		
	}

}
