package com.test;

public class ChineseNumber {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		System.out.print(" "+convertChineseNumbertoDecimal("25")+" ");
		System.out.print(" "+convertChineseNumbertoDecimal("22")+" ");
		
		System.out.print(" "+convertChineseNumbertoDecimal("3")+" ");
		System.out.print(" "+convertChineseNumbertoDecimal("5")+" ");
		System.out.print(" "+convertChineseNumbertoDecimal("9")+" ");

		System.out.print(" "+convertChineseNumbertoDecimal("15")+" ");
		System.out.print(" "+convertChineseNumbertoDecimal("325")+" ");
		System.out.print(" "+convertChineseNumbertoDecimal("5100")+" ");
		System.out.print(" "+convertChineseNumbertoDecimal("25")+" ");



	}
	

	
	/**
	 * Basic algo to validate input and 
	 * 1) If it contains 4 throw an ex. Chinese numbers dont have a 4.
	 * 2) Otherwise for each character check if there is a 4. If there is one then throw ex.
	 * 3) Essentially the chinese number system is nonary 0,1,2,3,5,6,7,8,9 and we need to map it to a normal nonary form
	 * 0,1,2,3,4,5,6,7,8.9.
	 * After this is done we essentially convert the nonary to base 10 and return the number. 
	 * @param chineseNumber
	 * @return
	 */
	public static int convertChineseNumbertoDecimal(String chineseNumber)
	{
		if(chineseNumber==null || chineseNumber.contains("4"))
			throw new IllegalArgumentException();
		
		char[]  charArray= chineseNumber.toCharArray();
		for (int i=0;i<charArray.length;i++) {
			
			if(charArray[i]>'4' && charArray[i]<='9')
			{
				charArray[i]--;//reduce it by 1.
			}
		}
		String base9Number= new String (charArray);
		
		Integer decimalVersion= Integer.valueOf(base9Number,9);
		return decimalVersion;
		}
}
