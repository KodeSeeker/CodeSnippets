package com.test;

public class MaxWithoutOperator {

	
	public static int flip(int a )
	{
		return 1^a;// return 1 if 0 and vicersa
	}
	public static  int sign (int num)
	{
		return flip( (num>>31 &0x01)); // returns 1 if positive and 0 if negative.
	}
	public static int getMaxNaive(int a,int b)
	{
		//based on intuition that if a >b . Then a-b is positive and viceversa.
		int k= sign (a-b);
		int q=flip(k);
		return a*k+b*q;// this could fail when both ints are of diff sign. possible integer overflow. 
	}
	
	
	public static int getMaxWithoutOverflow(int a, int b)
	{
		//key insight 
		//if a &b are of same sign k= sign (a-b)
		//else k =sign(a);
		
		int sg_a= sign(a);
		int sg_b=sign(b);
		int sg_C= sign(a-b);
		int k;
		if((sg_a ^ sg_b) ==0)
		{
			k=sg_C;//sign of a and b are same
		}
		else
			k=sg_a;//sign of a and b are diff.
		int q= flip(k);
		return a*k +b*q;
				
	}
	public static void main(String... args)
	{
		System.out.println(getMaxNaive(5, 4));
		System.out.println(getMaxWithoutOverflow(Integer.MAX_VALUE-1, -6));
	}
	
}
