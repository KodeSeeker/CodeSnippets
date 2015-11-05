package com.test;

public class Recursivetest {


//	static int fibonacci(int n)
//	{
//		if(n == 0)
//			return 0;
//		if(n==1)
//			return 1;
//		//return fibonacci(n-1)+fibonacci(n-2);
//	
//	}
	
	public static void main (String[] args)
	{
	//	System.out.println(Recursive(5));
	//	System.out.println(fibonacci(20000));
		System.out.println("Reverse of a is");
		reverseStringRecursively("jerr verry");
	}
	
	/**
	 * 
	 * @param String
	 */
	
	public static void reverseStringRecursively(String a)
	{
		
		if(a.length()==1)
		{
			System.out.print(a);
			return; 
		}
		
		reverseStringRecursively(a.substring(1));
		System.out.print(a.charAt(0));
	}
}
