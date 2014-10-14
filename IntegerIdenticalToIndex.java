/**
Integers in an array are unique and increasingly sorted. 
Please write a function/method to find an integer 
from the array who equals to its index. For example, in the array {-3, -1, 1, 3, 5}, the number 3 equals its index 3.
**/

/**
Binary search approach:
**/

public boolean  integerEqualsIndex(int[] arr,int start,int end)
{
	if(arr==null || arr.length==0)
		return false;
	if(start >end)
		return false;//such an integer does not exist.
	int mid = start+end >>>1;
	if(mid==arr[mid])
		return true
	if(arr[mid]<mid)// the number is not in first half, check second half
		return integerEqualsIndex(arr,mid+1,end);
	if(arr[mid]>mid)
		return integerEqualsIndex(arr,start,mid-1);
}



