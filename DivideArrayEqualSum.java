/*
How to optimally divide an array into two subarrays so that sum of elements in both are same . otherwise give an error
*/

//This can be only solved if the elements are treated in order and are all positive. Otherwise problem is NP complete.

public boolean canBeBalanced(int [] arr)
{
	int leftSum,rightSum;
	if (arr.length==0)
		return true;//0 if index.
	if(arr.length==1)
		return false; //or -1 cannot be balanced.
	for(int i=0,j=arr.length-1;i<j;)
	{
		//correct imbalances as you walk the array.
		if(leftSum<=rightSum)
		{
			leftSum+=arr[i];
			i++;
		}
		else// increase right sum and decrement j
		{
			rightSum+=arr[j];
			j--;
		}
		//loop will break when i crosses over j;
	}
		
	return (i==j);//equal sum parts exist? or i if you are looking for index of equal partition,
}

