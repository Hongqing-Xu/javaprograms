package com.ahead09;

public class Exam_2 {
	//定义一个方法求一个数组的最大值-最小值-平均数
	//注意方法的参数为数组
	static int[] max_min_ave(int m[]){
		int res[]=new int[3];
		int max=m[0],min=m[0],sum=0;
		for(int i=0;i<m.length;i++){
			if(max<m[i]){
				max=m[i];
			}
			if(min>m[i]){
				min=m[i];
			}
			sum+=m[i];
			//改变m数组中的值
			m[i]=m[i]+5;
		}
		res[0]=max;
		res[1]=min;
		res[2]=sum/m.length;
		return res;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={22,77,55,99,88,33};
		int b[]=max_min_ave(a);
		System.out.print("a数组的最大值,最小值，平均数：");
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+" ");
		}
		System.out.println();
		for(int mm:a){
			System.out.print(mm+" ");
		}
	}

}
