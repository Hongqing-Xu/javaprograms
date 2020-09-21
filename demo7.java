package com.ahead09;

import java.util.Scanner;

public class demo7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MyShopping管理系统>客户信息管理>添加客户信息");
		Scanner input = new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.print("请输入会员号(<4位数>):");
			int castNo=input.nextInt();
			System.out.println("请输入会员生日：");
			String birth = input.next();
			System.out.print("请输入会员积分:");
			int num=input.nextInt();
			//两种情况
			if(castNo>=1000&&castNo<=9999){
				System.out.println("您录入的会员信息是：");
				System.out.println(castNo+"\t"+birth+"\t"+num);
				
			}else{
				
				System.out.println("客户号"+castNo+"是无效会员号！\n录入信息失败！");
				continue;
			}
			
			
		}
	
	}

}
