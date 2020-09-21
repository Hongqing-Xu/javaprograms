package com.ahead09;

import java.util.Scanner;

public class basic9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int sum;
		int num1,num2;
		String score1,score2;
		try {
			System.out.println("请输入第一门课的成绩：");
			score1 = input.next();
			System.out.println("请输入第二门课的成绩：");
			score2 = input.next();
			//数值类的字符串可以转成基本数值类型
			num1 = Integer.parseInt(score1);
			num2 = Integer.parseInt(score2);
			System.out.println("两门成绩的和："+(num1+num2));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("输入的数据不合法！");
		}
		
	}

}
