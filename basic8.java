package com.ahead09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class basic8 {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//����ʱ�쳣
		//System.out.println(10/0);
		//int num[] = new int[3];
		//System.out.println(num[3]);
		
		
		//������ʱ�쳣
	
		
		Exception exc;
		//try-catch��䴦��    �����쳣
		try{
			//���ܳ����쳣�����
			System.out.println("������̫˧�ˣ�");
			System.out.println(10/1);
			System.out.println("������̫˧�ˣ�");
		}catch(ArithmeticException e){
			
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println("��������Ϊ��");
			
		}
		System.out.println("�����쳣�������䣡");
		
		//�Զ�����try-catch��       try  alt+/
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
