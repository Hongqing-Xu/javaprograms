package com.ahead09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class basic25 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			//先写后读
			FileWriter fw = new FileWriter("D:\\test123.txt");
			BufferedWriter buf_w = new BufferedWriter(fw);
			String str1 = "你好！";
			String str2 = "早上好！";
			buf_w.write(str1);
			buf_w.write(str2);
			buf_w.flush();
			FileReader fr = new FileReader("D:\\test123.txt");
			BufferedReader buf = new BufferedReader(fr);
			String str = buf.readLine();
			while(str!=null){
				//如果不为就打印出来
				System.out.println(str);
				//接着下一行
				str = buf.readLine();
			}
			buf_w.close();
			buf.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
