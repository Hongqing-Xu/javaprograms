package com.ahead09;

import java.util.Scanner;

public class demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*********购物清单********");
		int tPrice=245;
		int xiePrice=570;
		int padPrice=320;
		System.out.println("购买物品\t单价\t个数\t金额");
		System.out.println("T恤\t￥"+tPrice+"\t2\t￥"+tPrice*2);
		System.out.println("T恤\t￥"+xiePrice+"\t1\t￥"+xiePrice*1);
		System.out.println("T恤\t￥"+padPrice+"\t1\t￥"+padPrice*1);
		System.out.println("折扣：\t8折");
		double total=(tPrice*2+xiePrice*1+padPrice*1)*0.8;
		System.out.println("消费总金额：\t"+total);
		Scanner iii=new Scanner(System.in);
		System.out.print("实际交费：");
		int money=iii.nextInt();
		System.out.println("找钱：￥"+(money-total));
		int jf=(int)(total/100*3);
		System.out.println("本次购物所获得的积分是:"+jf);
		
	}

}
