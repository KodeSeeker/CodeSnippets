package com.test;

public class GetMaxBinaryGap {

	
	public static void main (String... arfs){
		
		System.out.println("8  "+getMaxBinaryGap(8));
		System.out.println("9  "+getMaxBinaryGap(9));

	}
	static int getMaxBinaryGap(int num){
		int count=0;
		int maxCount =-1;
		
		while(num >0){
			int right =num &1;
			num>>=1;
			
			if(count>=0 && right ==0){
				count++;
				
			}
			if (right ==1|| num ==0){
				if(count >maxCount){
					maxCount=count;
				}
				count =0;
			}
		}
		return maxCount;
	}
}
