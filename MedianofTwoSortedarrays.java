



/**
There are 2 sorted arrays A and B of size n each. 
Write an algorithm to find the median of the array obtained after merging the above 2 arrays(i.e. array of length 2n). The complexity should be O(log(n))


For O (log n) solution - instincitvely we must Divide and Conquer approach( as arrays are already sorted.

Algo:
1) If len =1. Then median is arr1[0]+ arr2[0]/2;.
2) If len =2 . Then medain is max(arr1[0],arr2[0])+ min (arr1[1],  arr2[0]) /2
3) If m1== m2.
		return m1// or m2.
4)Calculate median of  each array . If m1<m2
	median is in arr1(0,n/2) or arr2(n/2,n)
5) If m2<m1.
	median is in arr1( n/2,n) or arr2 (0,n/2)
Recurse till both arrays are only 2 elements wide.
**/

// assume arr1 and arr2 of the same size. 

public int getMedian (int[]arr1,int start1,int end1,  int [] arr2, int start2, int end2)
{
	if(arr1.length==1)
		return (arr1[0] + arr2[0])/2;
	if (arr1.length==2)
		return (Math.max(arr1[0],arr2[0])+ Math.min(arr1[1],arr2[1]))/2;
	else
	{
		int m1= median(arr1);// function that computes median of arr1 independently.
		int m2= median(arr2);
		
		if(m1==m2)
			return m1;
		else
		{
			mid1= start1+end1>>>1;
			mid2= start2+end2>>>1;
		if(m1<m2)
			{	
				return getMedian(arr1,start,mid1,arr2,mid2,end );
			}
		if(m2<m1)
			{
				return getMedian (arr1,mid1,end1, arr2, start2,mid2);
			}
		}
	}
}


/**
Median of Arrays of different length.
**/


public int getMedian (int[] a, int[] b,int aLength,int bLength) {

	int left = (aLength+bLength+1) >>>1; //3,2, left = 3
	int right =(aLength+bLength+2) >>>1;//3,2  right =3.(3.5  =>3)
	//average of kth smallest, from left and right. 
	return (findKthSmallest(a,b,aLength,bLength,left) + findKthSmallest(a,b,aLength,bLength,right))/2;
}



int findKthSmallest(int[] a, int[] b, int aLength, int bLength, int k) {

	//bLength is always > aLength per logic.
	if(aLength > bLength)
		return findKthSmallest(b,a,bLength,aLength,k);
	//Base cases.
	if(aLength ==0 && bLength >0)
		return b[k-1];
	if (k ==1)
		return Math.min(a[0],b[0]);
	
	int i = Math.min(k/2,aLength); // k is always less than length of array.
	int j= Math.min(k/2,bLength);
	
	if(a[i-1] >b[j-1])// slice b, find the k-jth element.
		return findKthSmmllest(a, Arrays.copyOfRange(b,j,b.length),aLength,bLength-j,k-j);
	else 
		return findKthSmallest(Arrays.copyOfRange(a,i,a.length),b,aLength-i,b,k-i);
}

