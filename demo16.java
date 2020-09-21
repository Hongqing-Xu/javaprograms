package com.ahead09;

public class demo16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=8,j=9;
		//与远算中，第一个表达式为假的话，后面的表达式不做计算
		//或远算中，第一个表达式为真的话，后面的表达式不做计算
		if(j>i||i++>=8){
			
		}
		System.out.println("i="+i);
		System.out.println("j="+j);
	}

}
