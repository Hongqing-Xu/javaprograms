package com.ahead09;
//自定义异常类
class MyException extends Exception{
	public MyException(String s){
		super(s);
	}	
}
public class basic16 {

	static void method(int level)throws MyException{
		if(level>10){
			throw new MyException("水位过高！");
		}else{
			System.out.println("水位没有异常");
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method(1);
			method(11);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println("捕获异常："+e.toString());
		}
	}

}
