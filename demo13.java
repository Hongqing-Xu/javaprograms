package com.ahead09;

import java.util.Scanner;

public class demo13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("�������ļ�����");
		String filename =input.next();
		System.out.println("��������������");
		String email = input.next();
		boolean fc =false,ec=false;
		String str=filename.substring(filename.indexOf('.')+1, filename.length());
		if(filename.indexOf('.')!=-1&&filename.indexOf('.')!=0&&str.equals("java")){
			fc=true;
		}else{
			System.out.println("�ļ�������");
		}
		if(email.indexOf('@')!=-1&&email.indexOf('@')<email.indexOf('.')){
			ec=true;
		}else{
			System.out.println("����������");
		}
		
		if(fc&&ec){
			System.out.println("�ϴ��ɹ�");
		}
		
	}

}
