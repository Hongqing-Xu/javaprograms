package com.ahead09;

import java.util.Calendar;
import java.util.Date;

public class basic21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calendar�����ǳ����࣬������Date��һ��ʵ��������Ҫͨ��getInstance()ʵ����
		Calendar cc = Calendar.getInstance();
		System.out.println(cc.get(Calendar.YEAR));
		System.out.println(cc.get(Calendar.MONTH)+1);
		System.out.println(cc.get(Calendar.DATE));
		System.out.println(cc.get(Calendar.DAY_OF_MONTH));
		//System.out.println(cc.get(Calendar.DAY_OF_WEEK));
		cc.add(Calendar.MINUTE, 30);
		Date dd = cc.getTime();
		System.out.println(dd.toString());
		
		
	}

}
