package com.ahead09;

import java.util.Arrays;

public class demo18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] ={70,60,80,40,30};
		//Arrays.sort(num);
		System.out.println("����ǰ��");
		//��������
		for(int m:num){
			System.out.print(m+" ");
		}
		System.out.println();
		System.out.println("�����");
		//��ϰð������   if(num[i]>num[i+1])      temp=num[i];num[i]=num[i+1];num[i+1]=temp;
		//���ѭ����ʾҪ�Ƚ�n-1��
		int temp;
		for(int i=0;i<num.length-1;i++){
			for(int j=0;j<num.length-i-1;j++){
				 if(num[j]>num[j+1]) { 
					 temp=num[j];num[j]=num[j+1];num[j+1]=temp; 
				 }    
			}	
		}  
		for(int m:num){
			System.out.print(m+" ");
		}
	}

}
