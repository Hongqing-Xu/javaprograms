package com.ahead09;

public class basic15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(1/0);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
	}

}
