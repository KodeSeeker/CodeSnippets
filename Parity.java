package com.test;

public class Parity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Parity 1 "+parity(1));
		System.out.println("Parity 2 "+parity(2));
		System.out.println("Parity 3 "+parity(3));
		System.out.println("Parity 7 "+parity(7	));

		System.out.println("Reverse 1 "+reverseNum((1)));
		System.out.println("Reverse 1 "+reverseNum((2)));

		System.out.println(1<<2);
	}
	//Returns true for odd parity and false for even parity. 
	static boolean parity (int num ){
		boolean result = false;
		
		while(num>0){
			result =!result; //toggle result.
			num&=(num-1);
		}
		
		return result;
	}
	
	static int reverseNum(int num) {

		 //validate num

		        for (int i=0;i<16;i++){
		                int j=32-i;
		             if((((num>>i)&1) ^ ((num>>j)&1)) ==1){
		                        num ^=(1<<i)|(1<<j);
		                }

		        }

		        return num;
		}
}
