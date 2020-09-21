package com.ahead09;
class Mother{
	String name;
	
}
public class basic1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3};
		//System.out.println(""+a[3]);
		//学生类型数组
		Mother[] ss = new Mother[4];
		System.out.println(ss[1]);
		ss[0]=new Mother();
		ss[0].name="zhangsan";
	}

}
