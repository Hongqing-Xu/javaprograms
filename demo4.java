package com.ahead09;

import java.util.Scanner;

public class demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while���    һ�������ȷ��ѭ����������ʹ��while���
		Scanner input=new Scanner(System.in);
		while(true){
			System.out.println("�������Ա�ţ�");
			String cNo=input.next();
			System.out.println("�Ƿ��������(y/n)��");
			String text=input.next();
			//�Ƚ��ַ����Ƿ���Ȳ�������==�жϣ���Ҫ�����ַ�����equals(String str)
			if("n".equals(text)){
				break;
			}
			
			
		}
		System.out.println("���������");
	}

}
