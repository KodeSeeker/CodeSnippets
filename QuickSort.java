public void quickSort(int array[]) 
// pre: array is full, all elements are non-null integers
// post: the array is sorted in ascending order
{
	quickSort(array, 0, array.length - 1);              // quicksort all the elements in the array
}


public void quickSort(int array[], int start, int end)
{

	//key is to find pivot using partition

	int pivot = partition(arr,start,end);

	if(start<pivot-1)
	{
		quickSort(arr,start,pivot-1);
	}

	if (pivot+1<end)
	{
		quickSort(arr,pivot,end);
	}
	
}

/**
Partition algo:
Initially choose pivot to be middle element and then move two pointers, one from start 
and the other from the end skipping elements that are less than pivot and greater than the pivot 
respectively. Swap  elements that are out of order.
**/

public int partition(int[] arr, int start, int end)
{
 	int pivot =arr[start+end >>>1];
	int i=start;
	int j= end;
	
	while(i<j)// rearrange the whole array around the pivot
	{

		while(arr[i]<pivot)
			i++;
		while(arr[j]>pivot)
			j--;
		if (i<=j) //swap
		{
			int tmp=arr[i];
			arr[i]=arr[j];
			arr[j]=tmp;
		}
			
	}
	
return i;
}


/**
QuickSelect: Used to select the kth largest item in the list. ie. kth order statistic
Average run time complexity :O(n). If pivot is selected at random
**/

public int quickSelect(int[] arr, int start, int end, int k)//kth order stat.
{
  	int pivot = partition(arr, start, end);

	//3 cases.
	if(pivot == k)
	{
		return arr[pivot];// found kth order statistic!
	}
	else if (k < pivot-start)
	{
		quickSelect(arr, start,pivot,k)	;// k is before pivot
	}
	else if (k>pivot-start)
	{
		quickSelect(arr,pivot+1,end,k);// k is after pivot.
	}

}
