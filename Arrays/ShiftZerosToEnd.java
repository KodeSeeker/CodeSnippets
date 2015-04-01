/**
Given an array with 0s and other integers.
 Find the fastest (that use least organizing) way to transfer all the 0s to the right end of that array.
**/

int[] shiftzeroToEnd(int[] arr) {
	
	if (arr== null || arr.length <=1)
		return arr;

	int countZeros =0;
	
	//iteration 1 : Count zeros.
	
	for (int i=0;i<arr.length;i++) {
		
			if(arr[i] ==0)
				countZeros++;
	}
	
	//iteration 2:Copy over all nonzero elements into a diff array.
	int[] shiftedArr = new int [arr.length];
	int k=0;
	for(int j=0;j<arr.length;j++){

		if(arr[j]!=0)
			shiftedArr[k++]=arr[j];
	}

	//fill in zeros on the right.
	while(k<shiftedArr.length) {

		shiftedArr[k++] =0 
	}

	return shiftedArr;
}
