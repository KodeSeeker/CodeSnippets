/**
Perform insertion sort on a given array. 

Returns  array sorted in ascending order. 
Online - low overhead . Time complexity O(n^2)(bad)

**/







void insertionSort(int[] arr) {

	if(arr.length ==0 || arr ==null)
		throw new IllegalArgumentException();

	//put each element in its correct location. 
	for (int i=0;i<arr.length; i++) {
	
		int next = arr[i];// store the value at current index in a temp variable. 
		int j=i;
		
		while(j>0 && arr[j-1] >next) {
		// put values in the right place.
			arr[j] =arr[j-1];
			j--;
		}
	
	
	arr[j] =next;
	}

	return arr; 

}



