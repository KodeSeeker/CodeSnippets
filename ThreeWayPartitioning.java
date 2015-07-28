/**
Sort an array that has only 3 distinct elements .  Also known as the Dutch National Flag algorithm .

Basically swap value of the middle element with low and high  as needed when you walk  through the array.

Consider an input sequence of 0,1,2 that is unsorted.
O/p: O,1,2 sorted and grouped together.

	
**/


int[] dutchNationalFlagSort(int[] arr){
		
		if( arr == null) 
			throw new IllegalArgumentException();

		int low =0;
		int high = arr.length-1;
	
		int mid = (low +high)>>>1;
	
		while(mid < =hi) { // exit when mid > hi .
		
			if (arr[mid] == 0){ // swap low and mid 
				int tmp = arr[low];
				arr[low]= arr[mid];
				arr[mid] =tmp;
				low++;
				mid++;
			}
			else if (arr[mid] ==1){
				mid++;
				continue; // mid is supposed to be 1
			}
			else if( arr[mid] ==2) {// swap mid and low !
				int tmp = arr[high];
				arr[high] = arr[mid];
				arr[mid]= tmp;
				mid++;
				high--;
			}
		}

		return arr;
}

		
