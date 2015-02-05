/**
Given a sorted array and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order. You may assume no duplicates in the array.
**/


public int findClosestIndex(int[] arr, int target) {

// Basic input validation.

int start=0;
int end = arr.length-1;
return findClosestIdx(arr, start,end, target);
}

int findClosestIdx(int[] arr, int start, int end , int target) {

	int mid = start+end>>>1;

	if(arr[mid]== target)
		return mid; // the actual index.
	if(target<arr[mid])// target could be on the left side?
		start<mid?findClosestIdx(arr,start,mid-1,target):start;// if start is still < mid there is more of the array for us to inspect so we split the array:else use start 
								// as the closest index to the target.
	else//target>arr[mid]
		mid <end?findClosest(arr,mid+1,end,target):end+1;// simlarly use end. if unable to find num 

}

