package com.ahead09;

import java.util.Scanner;

public class demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=(int)(Math.random()*3);
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个三位数的会员：");
		int castNo=in.nextInt();
		//幸运会员的中间数和随机数相同，则是幸运会员
		int num=castNo/10%10;
		if(i==num){
			System.out.println(castNo+"会员，您中奖了！");
			
		}else{
			
			System.out.println("谢谢惠顾！");
		}
	}

}
