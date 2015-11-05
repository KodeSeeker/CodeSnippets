package com.test;

public class PrettyPrintNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prettyPrint(19524);
	}

	// only thousands for test input. ->19,524
	

	static void prettyPrint(int number)
	{
		/**
		 * If number is greater than thousand , then we need to parse it for hundreds separately. 
		 * ie. two hundred and forty million three twentytwo thousand two hundred fifty five
		 */
		int thousands=0;
		int hundreds=0;
		if(number>1000)
		{
			 thousands= number/1000;
			number%=1000;
		}
		if(number>100)
		{
			 hundreds= number/100;
			number%=100;
		}
		System.out.println(thousands+ "Thousand"+  hundreds+ " hundred and " +number);
	}
}
