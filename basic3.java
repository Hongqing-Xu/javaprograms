package com.ahead09;

public class basic3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//记录了5位学生10个选择题的答案，请求出每位同学的正确率
		char[][] answers={
				{'A','B','A','D','C','B','C','B','C','B'},
				{'C','B','A','D','C','A','C','A','C','B'},
				{'D','B','A','B','B','B','C','B','C','B'},
				{'A','B','A','D','C','B','C','D','C','B'},
				{'A','B','A','D','C','B','D','B','C','B'}		
		};
		char key[]={'A','B','C','D','D','C','B','A','A','B'};
		for(int i=0;i<answers.length;i++){
			int cc=0;
			for(int j=0;j<answers[i].length;j++){
				if(answers[i][j]==key[j])cc++;
			}
			System.out.println("第"+(i+1)+"个同学答对"+cc+"题");	
		}
	}

}
