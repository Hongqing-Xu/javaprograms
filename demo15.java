package com.ahead09;

public class demo15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)���ַ���String  �����  StringBuffer
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb);
		//2����StringBufferת���ַ�������
		String ss = sb.toString();
		System.out.println(ss);
		
		
		//sb = sb.append("world");
		//System.out.println(sb);
		
		System.out.println(sb+"world");
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = sb1;
		System.out.println(sb1.equals(sb2));
	}

}
