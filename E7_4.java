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
			assert x<=100:"����100�ֵĳɼ������ǷǷ���";
			assert x>=0:"С��0�ֵĳɼ������ǷǷ���";
			m=m+1;
			sum=sum+x;
		}
		System.out.printf("%d�����ĺ�Ϊ%f\n",m,sum);
		System.out.printf("%d������ƽ��ֵ��%f\n",m,sum/m); 
	}
}
