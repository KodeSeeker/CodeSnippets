package com.test;

public class FindCup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(findLastStandingCup(100));
	}
	/**
	 * Returns the last standing cup for a given set of N cups. 
	 * @param num
	 * @return last standing cup 
	 */
	static int findLastStandingCup(int num){
		// The last standing cup is the largest power of 2 less than equal to N.
		// Rational: If we remove the numbers of the form 1+2n, we are left with multiples of 2.
		//Removing numbers of the form  2+4n, we are left with multiples of 4, so on for 4+8n and 8+16n.
		
		if(num <0)
			throw new IllegalArgumentException("Cups cannot be negative!");
		if (num ==0)
			return 0;// 0 cups remaining.
		if ((num &num-1)==0)
			return num;
		else{
			while ((num&num-1) !=0){
				num--;
			}
		}
	
		return num;

	}
}
