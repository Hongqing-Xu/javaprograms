package com.ahead09;

import java.util.Scanner;

public class demo13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("请输入文件名：");
		String filename =input.next();
		System.out.println("请输入邮箱名：");
		String email = input.next();
		boolean fc =false,ec=false;
		String str=filename.substring(filename.indexOf('.')+1, filename.length());
		if(filename.indexOf('.')!=-1&&filename.indexOf('.')!=0&&str.equals("java")){
			fc=true;
		}else{
			System.out.println("文件名不符");
		}
		if(email.indexOf('@')!=-1&&email.indexOf('@')<email.indexOf('.')){
			ec=true;
		}else{
			System.out.println("邮箱名不符");
		}
		
		if(fc&&ec){
			System.out.println("上传成功");
		}
		
	}

}
