package com.ahead09;

import java.util.Scanner;

public class demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		for(int i=2;i>=0;i--){
			System.out.print("�������û�����");
			String user=in.next();
			System.out.print("���������룺");
			String password=in.next();
			if("123456".equals(password)){
				
				System.out.println("��½�ɹ���");
				break;
			}else{
				System.out.println("�������������"+i+"�λ���");
				if(i==0){
					System.out.println("�Բ�����3���������");
				}
			}
		}
	}

}
