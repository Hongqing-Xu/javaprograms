package com.ahead09;
//����
class Animal{
	public void method(){
		System.out.println("�һᶯ��");
	}
	//public abstract showme();
}
//����1
class Bird extends Animal{
	public void method(){
		System.out.println("�һ�ɣ�");
	}	
}
//����2
class Fish extends Animal{
	public void method(){
		System.out.println("�һ��Σ�");
	}
}
public class basic4 {
	public static void main(String[] args) {
		//��ʾ��Ķ�̬��
		Animal  aa = new Animal();
		aa.method();
		//�������ֵ���������
		Animal  bb1 = new Bird();
		bb1.method();
		Animal ff = new Fish();
		ff.method();
		//����һ������ת��������
		String score1 = "99";
		String score2 = "98";
		//������ʱ�쳣
		//int sum = (int)score1+(int)score2;
		Bird  bb2 = new Bird();
		bb2 = (Bird)bb1;
		bb2.method();
		Bird bb3 = new Bird();
		//����ʱ����ת���쳣       ClassCastException
		bb3 = (Bird)ff;
		bb3.method();
	}

}
