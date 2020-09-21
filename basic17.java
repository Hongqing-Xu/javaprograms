package com.ahead09;

public class basic17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//基本数值类型与字符串的转换
		String ss = "99";
		int num = Integer.parseInt(ss);
		System.out.println(num);
		String ss1 = "中国";
		int num2 =Integer.parseInt(ss);
		System.out.println(num2);
		double num3 = Double.parseDouble(ss);
		System.out.println(num3);
		//包装类对象与字符串的转换
		boolean boo = true;
		String str = String.valueOf(boo);
		System.out.println(str.charAt(0));
		System.out.println(str);
		String ss2 = "888";
		Integer num4 = Integer.valueOf(ss2);
		int sum=10;
		//包装类的对象在参与运算中会自动调用intValue()
		sum=sum+num4.intValue();
		System.out.println(sum);
		
	}

}
