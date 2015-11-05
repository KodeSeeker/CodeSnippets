package com.test;

public class MinmPointsSortArray {

	
	public static void main(String... args)
	{
	int[] arr ={1,2,4,7,10,11,7,12,6,7,16,18,19};
	getMinIndexes(arr);
	}
	
	static void getMinIndexes(int[] arr)
	{
		/**
		 * High level algo.
		 * 
		 * The array is sorted on the left and right. Unsorted in the middle. 
		 * Find the  indexes of m and n (minimize n-m) in the middle so that the whole array
		 * is sorted. 
		 * To do this: Find the highest point from the left side before you reach the middle
		 * Find the lowest point from the right side before you reach the middle. 
		 * 
		 *  Move left on the left side sequence till you find an element that is LESSER than the first 
		 *  element of the middle part(Index M) . Similarly, move right on the right side part till you find the first element 
		 *  on the right side thats greater than the current element. (Index N)
		 *  Sorting between M and N would sort the whole array.
		 *  
		 */
		
		
		int lowEndofMid = findHighestBeforeDecreasingFromLefttSide(arr);
		int highEndofMid = findLowestBeforeIncreasingFromRightSide(arr);
		System.out.println("Low end of mid"+lowEndofMid);
		System.out.println("high end of mid "+highEndofMid);
		//look left from  low.
		int m =lookLeftFromLowTillSmaller(arr,lowEndofMid);
		int n= lookRightFromHighTillLarger(arr,highEndofMid);
		
		
		System.out.println(" The index to be sorted is " + m +  "  and "+ n );

	}

	private static int lookRightFromHighTillLarger(int[] arr, int highEndofMid) {
		// TODO Auto-generated method stub
		for(int i= highEndofMid;i<arr.length;i++)
		{
			if(arr[i]>arr[highEndofMid])
				return i-1;
		}
		
		
		
		return 0;
	}

	private static int lookLeftFromLowTillSmaller(int[] arr, int lowEndofMid) {
		// TODO Auto-generated method stub
		for(int i= lowEndofMid;i>0;i--)
		{
			if(arr[i]<arr[lowEndofMid])
				return i+1;
		}
		
		return 0;
	}

	private static int findLowestBeforeIncreasingFromRightSide(int[] arr) {
		for(int i=arr.length-1;i>0;i--)
		{
			if(arr[i]<arr[i-1])
				return i-1;
		}
		return 0;
	}

	private static int findHighestBeforeDecreasingFromLefttSide(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
				return i+1;
		}
		
		return 0;
	}
}
