package com.ahead09;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class basic23 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			
			FileInputStream fis = new FileInputStream("D:\\test123.txt");
			//Ϊ�����������һ��������
			BufferedInputStream buffer_in = new BufferedInputStream(fis);
			byte[] bb = new byte[1024];
			int num=buffer_in.read(bb);
			String str = new String(bb,0,num);
			System.out.println(str);
			//�ͷ���Դ
			fis.close();
			buffer_in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
