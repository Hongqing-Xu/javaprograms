package com.ahead09;

import java.util.Date;

public class basic20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date objdate = new Date();
		System.out.println("今天的日期："+objdate);
		long ll = objdate.getTime();
		System.out.println(ll);
		System.out.println(objdate.toString());
		String strTime = objdate.toString();
		System.out.println((strTime.substring(11,(strTime.length()-4) )).substring(0, 8));
	}

}
