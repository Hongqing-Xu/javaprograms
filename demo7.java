package com.ahead09;

import java.util.Scanner;

public class demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MyShopping����ϵͳ>�ͻ���Ϣ����>��ӿͻ���Ϣ");
		Scanner input = new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.print("�������Ա��(<4λ��>):");
			int castNo=input.nextInt();
			System.out.println("�������Ա���գ�");
			String birth = input.next();
			System.out.print("�������Ա����:");
			int num=input.nextInt();
			//�������
			if(castNo>=1000&&castNo<=9999){
				System.out.println("��¼��Ļ�Ա��Ϣ�ǣ�");
				System.out.println(castNo+"\t"+birth+"\t"+num);
				
			}else{
				
				System.out.println("�ͻ���"+castNo+"����Ч��Ա�ţ�\n¼����Ϣʧ�ܣ�");
				continue;
			}
			
			
		}
	
	}

}
