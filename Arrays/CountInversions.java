// Count the number of inversions

//Trick is to use mergesort--> tweak in merge procedure
int merge(int[] arr, int [] left, int [] right,int mid )
{
	int i=0,j=mid,invCount=0,k=0;
	int[] temp = new int[arr.length];
	//merge the arrays
	while (i <mid && j<arr.length-1)
	{
		if(left[i]<=right[j])
		{
			temp[k++]=left[i++];
		}
		else if (right[j]<left[i])// we have an inversion!
		{
			invCount += mid-i;  // key statement.
			temp[k++]=right[j++];
		}
	}
	//copy remaining elements- from left subarray
	while (i<= mid)
    		temp[k++]= left[i++]
	
   	//copy rest of the elements from right subarray
	while(j<arr.length-1)
		temp[k++]=right[j++];

	return invCount;
}
    
    return count;
    }
    
    int invCount(int [] arr)
    {
        if (arr.length<2)
            return 0;
        int mid = (arr.length+1)/2;
        int [] left= Arrays.copyOfRange(arr,0,mid);
        int [] right= Arrays.copyOfRange(arr,mid,arr.length);
        return invCount(left)+invCount(right)+merge(arr,left,right,mid);
	 
    }
}
