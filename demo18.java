package com.ahead09;

import java.util.Arrays;

public class demo18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] ={70,60,80,40,30};
		//Arrays.sort(num);
		System.out.println("排序前：");
		//遍历数组
		for(int m:num){
			System.out.print(m+" ");
		}
		System.out.println();
		System.out.println("排序后：");
		//复习冒泡排序   if(num[i]>num[i+1])      temp=num[i];num[i]=num[i+1];num[i+1]=temp;
		//外层循环表示要比较n-1轮
		int temp;
		for(int i=0;i<num.length-1;i++){
			for(int j=0;j<num.length-i-1;j++){
				 if(num[j]>num[j+1]) { 
					 temp=num[j];num[j]=num[j+1];num[j+1]=temp; 
				 }    
			}	
		}  
		for(int m:num){
			System.out.print(m+" ");
		}
	}

}
