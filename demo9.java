package com.ahead09;

import java.util.Scanner;
//�ڳ����ж���һ��Stu��
class Stu{
	
	
	
}
public class demo9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("����ѧ��������");
		String name=input.next();
		for(int i=0;i<5;i++){
			System.out.print(name+"��"+(i+1)+"�ŵĳɼ���");
			int score=input.nextInt();
			if(score<0){
				System.out.println("¼��ɼ�����������¼�룡");
				break;
				
			}
			
			
		}
	}

}
