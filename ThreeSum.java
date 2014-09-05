/**
When supplied a target Efficiently check whether there are three values that sum up to the target in the input sorted array.
Three sum problem
**/

public boolean threeSum(int[] arr, int target)
{

	if(target > arr[length-1])
		return false;
	int len = arr.length;
	for(int i=0;i <=len-1;i++)
	{
		int j=i+1;
		int k= arr.length-1;
		while(j<k)
		{
			int tempSum= arr[i]+arr[j]+arr[k];
			if(tempSum == target)
			{
				return true;// we found the target return true.
			}
			else if (tempSum < target)
			{
				j++;
			}
			else if (tempSum >target)
			{
				k--;
			}
		}
	}
			
	return false;// no 3 values sum up to target :-(.


}
