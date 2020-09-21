package com.ahead09;

import java.util.Scanner;

public class demo17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//声明
		
		//为数组分配内存空间
		int a[]=new int[5];
		
		Scanner input = new Scanner(System.in);
		int score;
		int sum=0;
		for(int i=0;i<5;i++){
			System.out.println("请输入成绩");
			a[i] = input.nextInt();
			sum+=a[i];
			
		}
		System.out.println("平均分"+(sum/5.0));
		System.out.println("请输入需要查询的课程");
		int num = input.nextInt();
		System.out.println("第"+num+"门课的成绩为："+a[num-1]);
		//int b[]={1,2,3,4,5}; 
		int  b[]=new int[5];
		b[0] =90;  
	}
}
