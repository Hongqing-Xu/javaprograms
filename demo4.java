package com.ahead09;

import java.util.Scanner;

public class demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while语句    一般情况不确定循环次数可以使用while语句
		Scanner input=new Scanner(System.in);
		while(true){
			System.out.println("请输入会员号：");
			String cNo=input.next();
			System.out.println("是否继续输入(y/n)：");
			String text=input.next();
			//比较字符串是否相等不可以用==判断，而要采用字符串的equals(String str)
			if("n".equals(text)){
				break;
			}
			
			
		}
		System.out.println("程序结束！");
	}

}
