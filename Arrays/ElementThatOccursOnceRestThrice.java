/**


Find the element that appears once

Given an array where every element occurs three times, except one element which occurs only once. Find the element that occurs once. Expected time complexity is O(n) and O(1) extra space.
Examples:

Input: arr[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 3}
Output: 2


Key approach: Cannot use hashmap due to the space constraint.

Cannot use xor directly as other numbers occur three (odd) times.
Use bit wise approach.

**/

public int getElementOccuringOnce(int[] in)
{
	if(in.length<3||in==null)
	{
		throw new IllegalArgumentException();
	}
	
	int result=0;
	int bitSum,bitFlag;
	public static int INT_SIZE=32; //constant in Java.

	for(int i=0;i<INT_SIZE;i++) //inspect all the bits
	{
		bitFlag=1<<i;
		bitSum=0;//set bitsum to zero for every bit.
		for(int j=0;j<in.length;j++)
		{
			if(in[j] &bitFlag==1)
				bitSum++;
		}// at this point. the ith bit of all numbers  is checked.

		if(bitSum%3!=0)// the elements occurring thrice will be cancelled out. The bit of the element occurring once will remain
		{
			result|=bitFlag;
		}
	}

	return result;
}
