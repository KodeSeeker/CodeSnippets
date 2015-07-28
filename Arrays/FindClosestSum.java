/**
 Given an array of integer, find 2 numbers that their sum is closest to a specific number.  
Approach :Similar to  2 Sum problem . 
Keep track of smallest abs_diff and indices after sorting array.

**/


void findClosestTwoElementsSumUptoTarget(int[] arr, int target) {

	if (arr == null || target ==null)
		throw new IllegalArgumentException();
	
	Arrays.sort(arr); // sort the array. 

	int min=0;
	int min_diff=INTEGER.MAX_VALUE;
	int ele1idx=-1;// index of elements  that have closest sum to target.
	int ele2idx =-1;


	int low =0;
	int hight =arr.length -1;
	
	while (low <high) {

		int mindiffSoFar = (arr[low] + arr[high]) - target;
		if( mindiffSoFar ==0) { // exactly equal to target.
		
			System.out.print( arr[low] + "and " + arr[high] +  " exactly add up to target");
			return;
		}
		
		if(mindiffSoFar<min_diff) {// check if min_diff is a local minima.
			min_diff =mindiffSoFar;
			ele1idx=low;
			ele2idx=high;//store the indices.
		}
		
		//adjust low and high based on min_diff.
		if (mindiffSoFar <target) {
				low++;
		}
		else if (mindiffSoFar >target) {
			high--;
		}
	}

	int closestValue = target+min_diff;
	System.out.print("Closest element to given target" + closestValue +" formed by sum of " +arr[ele1idx} + " and " +arr[ele2idx]);
}

	
		 
