package com.test;

public class BigIntegerAddition {

	
	public String primitiveAdd(String num1, String num2)
	{
		
			if(num1.isEmpty()|| num2.isEmpty())//+other edge cases later.
					return null;
			StringBuilder n1= new StringBuilder(num1);
			StringBuilder n2= new StringBuilder(num2);
		
			int len1=n1.length();
			int len2=n2.length();
			
			int i=len1-1,j=len2-1;
			//if len1!=len2 make it equal.
			
			if(len1>len2)
			{
				//append zeros before n2. 
				int zeros= len1-len2;
				int k=0;
				while(k<zeros)
				{
					n2.insert(0, "0");
					k++;
				}
			}
			
			if(len2>len1)
			{
				//append zeros before n2. 
				int zeros= len2-len1;
				int k=0;
				while(k<zeros)
				{
					n1.insert(0, "0");
					k++;
				}
			}
				
			
			StringBuilder result= new StringBuilder();
			int sum=0,carry=0;
			while(i>0 && j>0)
			{
				int d1=n1.charAt(i)-'0'; // get the digit representation.
				int d2= n2.charAt(j)-'0';
				sum=carry+d1+d2;
				if(sum>=10)
				{
					carry=1;
					sum%=10;
				}
				result.append(sum);
				i--;
				j--;
			}
			
			
			return result.reverse().toString();
	}
}
