package com.ahead09;

import java.util.Scanner;

public class demo8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("输入班级总人数：");
		int num = input.nextInt();
		int n=0;
		for(int i=0;i<num;i++){
			System.out.println("请输入第"+(i+1)+"位学生的成绩：");
			int score=input.nextInt();
			if(score>=80)
				n++;
		}
		System.out.println("80分以上的学生人数："+n);
		double bi=(n/(num*1.0))*100;
		System.out.println("80分以上的学生所占的比例为："+bi+"%");
	}

}
