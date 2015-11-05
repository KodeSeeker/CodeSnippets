package com.test;

public class SmallestPositiveInteger {

	
	public static void main(String...string){
		
		int[] arr = {1,3,4,5};
		int[] arr2={2334,9554,1000};
		System.out.println(smallestPositive(arr));
	}
	static int smallestPositive (int[] arr){

        if(arr == null)
                throw new IllegalArgumentException();
        int smallest =arr[0];
        for (int i=0;i<arr.length; i++) {

                if(arr[i] >0 && arr[i]<smallest){
                        smallest=arr[i];
                }
        }

        return smallest +1;
}
}
