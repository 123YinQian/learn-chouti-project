package ch7_4;

import java.util.*;
public class E7_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		double sum=0;
		int m=0;
		while(reader.hasNextDouble()){
			double x=reader.nextDouble();
			assert x<=100:"大于100分的成绩数据是非法的";
			assert x>=0:"小于0分的成绩数据是非法的";
			m=m+1;
			sum=sum+x;
		}
		System.out.printf("%d个数的和为%f\n",m,sum);
		System.out.printf("%d个数的平均值是%f\n",m,sum/m); 
	}
}
