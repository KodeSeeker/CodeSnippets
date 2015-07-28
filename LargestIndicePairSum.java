/*

Given a non sorted array of numbers find the largest indice pair sum in a given array,

ie. Maximize array[i] + array[j] + abs(i-j) where 0<=i,j<=n-1.

Link to original question and answer : https://www.reddit.com/r/cscareerquestions/comments/3bmlq4/interview_help_find_the_largest_indice_pair_sum/csnkkmc
*/

/**
Approach
 
Maximize arr[i] +i and minimize arr[j] -j and add both. This will result in maximizing our objective. 
**/

int largestIndicePairSum(int[] arr) {

	if( arr == null || arr.length ==0)
		throw new IllegalArgumentException();

	int maxOne= arr[0];
	
	for (int i =1; i<n; i++) {
	
		maxOne = Math.max(maxOne, arr[i]+i);//maximize arr[i]+i.
	}
	
	int maxTwo = maxOne+arr[0];

	for (int j=1;j<n; j++){
		
		maxTwo = Math.max(maxTwo, maxOne+arr[j] -j);
	}
	
	return maxTwo;
}

