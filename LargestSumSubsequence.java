/**
Find the largest sum subsequence in a given array.

Kadane's algorithm!!!Plus,  Keeping track of the indices so that you can print the subsequence.

 **/


public int[] subsequenceWithMaxSum(int[] in)
{
	if(in.length==0 || in==null)
		return null;
	int maxSum=-1;
	int curSum;
	int start=0;
	int end=0;

	int startIndexsoFar=0;
	//walk through input array.
	for(int i=0;i <in.length;i++)
	{
		curSum+=in[i];
		
		if(curSum>maxSum)//update pointers.
		{
			maxSum=curSum;
			start=startIndexsoFar;
			end=i;
		}
		
		if(curSum<0)// if current sum falls below 0--reset values.
		{
			maxSum=0;
			startIndexsoFar=i+1;
		}
	}
	
	System.out.println("Max Subsequence sum"+maxSum);
	int[] arr= new int[end-start];

	for(i=start;i<end;i++)
	{
	arr[i]= in[i];
	}
	
	return arr;
}
