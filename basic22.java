package com.ahead09;

import java.util.ArrayList;
import java.util.Random;

public class basic22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new ArrayList<String>();
		String str = "123";
		arr.add(str);
		String str1 = "456";
		arr.add(str1);
		String str2 = "789";
		arr.add(str2);
		for(int i=0;i<arr.size();i++){
			System.out.println(arr.get(i));
		}
		
	}

}
