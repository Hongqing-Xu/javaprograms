package com.ahead09;

public class basic12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//多重catch语句应用
		try {
			int i = args.length;
			System.out.println("i="+i);
			int j = 5/i;
			int k[]={1,2,3};
			k[3]=5;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("除数不能为0："+e.toString());
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组下标越界："+e.toString());
		}
		System.out.println("catch后面的语句");
		
	}

}
