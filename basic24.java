package com.ahead09;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class basic24 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("d:\\test123.txt");
			BufferedOutputStream buf_out = new BufferedOutputStream(fos);
			String str ="好好学习，天天向上!";
			buf_out.write(str.getBytes());
			buf_out.flush();
			FileInputStream fis = new FileInputStream("D:\\test123.txt");
			//为输入流对象加一个缓冲器
			BufferedInputStream buffer_in = new BufferedInputStream(fis);
			byte[] bb = new byte[1024];
			int num=buffer_in.read(bb);
			String str1 = new String(bb,0,num);
			System.out.println(str1);
			buf_out.close();
			buffer_in.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
