package com.test;

public class ShiftLeftAndZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {9,3,4,1,12,3,3,62};
		int[] cpy = shiftLeftAndFillZeros(num, 3);
		for (int i :cpy){
			System.out.print(i+ ",");
		}
	}

	static int[] shiftLeftAndFillZeros(int[] num, int K){
        int[] cpy= new int[num.length];
        int idx=0,i=0;
        while(idx <num.length && i<num.length){

                if(num[i] !=K) {
                        cpy[idx++] =num[i];
                }
                i++;
        }
        //fill remaining with 0.        
        while(idx<num.length){
                cpy[idx++]=0;
        }
        return cpy;
}
	
}
