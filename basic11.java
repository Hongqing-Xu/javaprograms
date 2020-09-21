package com.ahead09;

public class basic11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(1/1);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("产生异常："+e.toString());
			e.printStackTrace();
		}finally{
			System.out.println("用于释放资源");
		}
	}

}
