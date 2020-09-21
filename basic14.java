package com.ahead09;

public class basic14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println(e.fillInStackTrace());
			e.printStackTrace();
			;
			
			;
		
		}
		
	}

}
