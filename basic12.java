package com.ahead09;

public class basic12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����catch���Ӧ��
		try {
			int i = args.length;
			System.out.println("i="+i);
			int j = 5/i;
			int k[]={1,2,3};
			k[3]=5;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("��������Ϊ0��"+e.toString());
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("�����±�Խ�磺"+e.toString());
		}
		System.out.println("catch��������");
		
	}

}
