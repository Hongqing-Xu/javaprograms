package com.ahead09;

import java.util.Scanner;
//在程序中定义一个Stu类
class Stu{
	
	
	
}
public class demo9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("输入学生姓名：");
		String name=input.next();
		for(int i=0;i<5;i++){
			System.out.print(name+"第"+(i+1)+"门的成绩：");
			int score=input.nextInt();
			if(score<0){
				System.out.println("录入成绩有误，请输入录入！");
				break;
				
			}
			
			
		}
	}

}
