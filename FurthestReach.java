package com.test;

public class FurthestReach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = {2,4,1,1,0,2,3}; 
		System.out.println(canReachEnd(num));
		
	}

	static boolean canReachEnd(int [] num) { // num can have negative numbers too. 

        if(num ==null)
                throw new IllegalArgumentException();
        if(num.length ==0)
                return true;

        //walk through the array . Keep track of A[i] +i and maximize it as you walk .The furthest reach of a number.

        int furthestReach =0;

        for (int i=0;i<=furthestReach  && furthestReach < num.length-1; i++){

                furthestReach = Math.max(furthestReach,num[i]+i);
        }


        return (furthestReach>=num.length-1);
}

}
