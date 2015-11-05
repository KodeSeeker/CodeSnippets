package com.test;

public class BalancePoint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-7, 1, 5, 2, -4, 3, 0};
		System.out.println(balancePoint(arr));
		System.out.println(balancePoint2(arr));

	}

	static int balancePoint(int[] arr) {

        //validate arr.

        int leftSum=0,sum=0;
        for(int i=0; i<arr.length;i++) {
                sum+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
        	sum-=arr[i];
        	
        	//check if there is a match.
        if(leftSum ==sum)
        	return i;
        leftSum+=arr[i];
        }

        return -1;
	}
	
	static int balancePoint2(int[] arr) {

        //validate arr.

        int[] leftSum= new int[arr.length];
        int[] rightSum= new int[arr.length];
        for(int i=0; i<arr.length;i++) {
        	leftSum[i]+=arr[i];
        }
        for(int j=arr.length-1;j>0;j--){
        	
        	rightSum[j]+=arr[j];
        	
        }
        for(int i=0;i<arr.length;i++){
        	if(leftSum[i]== rightSum[i])
        		return i;
        }
        return -1;
	}
}
