package com.ahead09;
//�Զ����쳣��
class MyException extends Exception{
	public MyException(String s){
		super(s);
	}	
}
public class basic16 {

	static void method(int level)throws MyException{
		if(level>10){
			throw new MyException("ˮλ���ߣ�");
		}else{
			System.out.println("ˮλû���쳣");
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method(1);
			method(11);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println("�����쳣��"+e.toString());
		}
	}

}
