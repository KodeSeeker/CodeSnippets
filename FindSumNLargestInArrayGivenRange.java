/**
Given  a array which consists positive number between 0 to 9,(digit can repeat). I want to find sum of N largest elements
One could trivially sort the array and look up the N largest elements of array in O(n log n).

However this can be more easily performed by using a count sort variant. To keep track of count of each of the elements in the array.


Readd array backwards and subtract from N accordingly.

**/

int sumNLargestinArrayRange(int[] arr,int N) {

	if(arr == null || N<0) 
		throw new IllegalArgumentException();
		
	int[] countArray = new int [9];// for range 0-9

	for(int i=0;i<arr.length;i++) {
		countArray[a[i]]++;
	}
	
	//read backwards from range
	int sum =0;
	for( int i=9; i>0;i--) {
		//case [0,1,2,3,3,9,9,9,9] and N=5
		//countArray[1,1,1,2,0,0,0,0,0,0,0,4]
		if(countArray[i] < N) {
			sum + = countArray[i] *i;
			N -= b[i];// initially gets rid of 4 '9's and calculates their sum .
		}// n is now 1.
		else {
			sum + =N *i;// sum +(1*4)
			N =0;
			break;
		}
		
	}
	
		
	if(N!=0)// if N is still not 0 
		throw new Exception(" Array is not large enough") ;
}


