package com.ahead09;

import java.util.Scanner;



public class demo12 {

	/**
	 * @param args
	 */
	public void register(){
		Scanner input=new Scanner(System.in);
		System.out.println("�������û�����");
		String user = input.next();
		System.out.println("���������룺");
		String psw = input.next();
		if(psw.length()>=6){
			System.out.println("ע��ɹ���");
		}else{
			System.out.println("���벻������6λ");
		}
	}
	public void login(){
		Scanner input=new Scanner(System.in);
		System.out.println("�������û�����");
		//�������Сд
		String user = input.next();
		user=user.toLowerCase();
		System.out.println("���������룺");
		String psw = input.next();
		if(user.equals("tom")&&psw.equals("1234567")){
			System.out.println("��¼�ɹ���");
		}else{
			System.out.println("�û������������");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ַ�����
		/*String str = "helloworld";
		System.out.println(str);
		String ss = new String();
		ss=str;
		System.out.println("ss="+ss);
		String str1=new String("helloworld");
		System.out.println(str1);
		Math.random();
		Exception e;
		int num = str1.length();
		System.out.println(num);
		*/
		
		demo12 dd = new demo12();
		//dd.register();
		dd.login();
		demo12 dd1=dd;
		//System.out.println(dd1.equals(dd));
		
	}

}
