// Count the number of inversions

//Trick is to use mergesort--> tweak in merge procedure
int merge(int[] arr, int [] left, int [] right,int )
{
    
    int i,j,count;
    while(i<left.length || j< right.length)
    {
        if(j== right.length)// the right array has been completely looked at.
        {
            arr[i+j]= left[i];
            i++;
        }
        if(i==left.length)// the left array has been completely looked at.
        { 
          arr[i+j]= right[j];
          j++;
        }
        if(left[i] <=right[j])
        {
            arr[i+j]=left[i];
            i++;
        }
        else
        {// we have an inversion!
            arr[i+j]= right[j];
            // count them
            count+= left.length-i;
            j++;
        }
    }
    
    return count;
    }
    
    int invCount(int [] arr)
    {
        if arr.length<2
            return 0;
        int mid = (arr.length+1)/2;
        int [] left= Arrays.copyOfRange(arr,0,m);
        int [] right= Arrays.copyOfRange(arr,m,arr.length);
        int count =invCount(left)+invCount(right)+merge(arr,left,right);
    }
}