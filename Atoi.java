package com.test;

public class Atoi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String num="523";
			int intval=0;
			for (char c: num.toCharArray())
			{
				int i=c-'0';
				//System.out.println(i);
				intval=intval*10+i;
			}
			
			
		//System.out.println(intval);
		
		int number=123;
		while(number>0)
		{
			int d=number%10;
			char ch=(char) (d+'0');
			System.out.println(ch);
			number/=10;
		}
		
	}

}
