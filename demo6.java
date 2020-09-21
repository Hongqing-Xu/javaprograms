package com.ahead09;

import java.util.Scanner;

public class demo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		for(int i=2;i>=0;i--){
			System.out.print("请输入用户名：");
			String user=in.next();
			System.out.print("请输入密码：");
			String password=in.next();
			if("123456".equals(password)){
				
				System.out.println("登陆成功！");
				break;
			}else{
				System.out.println("输入错误！您还有"+i+"次机会");
				if(i==0){
					System.out.println("对不起，您3次输入错误");
				}
			}
		}
	}

}
