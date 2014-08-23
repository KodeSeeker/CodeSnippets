/** Given a sorted rotated array as the input . Find the index of a target element.
e.g.{ 3 4 5 1 2} target 2==>4
    {2,2,2,2,2} target 3=>-1
    {2 2 2 2 3 2} target 3 => 4

**/

/**Algo is a variation of binary search, with careful considerations for edge cases and corner conditions.**/


public int findTarget(int[] in, int target)
{
	if(in ==null)
		return null;
	return findTarget(in,0,in.length-1,target);
}

public int findTarget(int[] in,int start,int end,int target)
{
	//find the mid - in a safe way.
	int mid = (start + end) >>>1;
	if(arr[mid] == target)
	{
		return mid;// base case.
	}
	
	if(start >end)
	{
		return -1;// we searched the whole array and couldnt find target :-(
	}
	if(arr[start]< arr[mid]) //left side is sorted.
	{
		if(target >arr[start]  && target < arr[mid])//target is in the sorted left half
		{
			return findTarget(in,start,mid,target);
		}
		else //target is in the right half.
		{
			return findTarget (in, mid ,end, target);//search right half.
		}
	}
	else if(arr[mid] <arr[end]) //right half is sorted.!
	{
		
		if(target >arr[mid] && target < arr[end])// target should be  in between mid and end
		{
			 return findTarget(in,mid ,end,target);
		}
		else //right half is sorted but target should be in left half.
		{
			return findTarget(in,start ,mid,target);
		}
	}
//Verify duplicates.
// Code below handles duplicates .
	if(arr[start] == arr[mid])
	{  //left half is full of duplicates!
		//search the right half
		int find =findTarget(in,mid  ,end,target);
		if (find ==-1)// if find is not in the right half, we need to search both halves,
		{
			 find = findTarget(in, mid, end, target); 
		}
		if(find ==-1)
		{
			 find = findTarget(in, start, mid, target);  
		}
		if(find!=-1)
			return find;
	}

	else if(arr[mid] == arr[end])
	{	//right half is full of duplicates.
		
                //search the left half
                int find =findTarget(in,start,mid,target);
                if (find ==-1)// if find is not in the right half, we need to search both halves,
                {
                         find = findTarget(in, mid, end, target);   
                }
                if(find ==-1)
                {
                         find = findTarget(in, start, mid, target); 
                }
                if(find!=-1)
                        return find;
	}

}
