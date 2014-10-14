

/**
Prints the power set of all elements in a set
Size of a power set: 2^n, where n is the size of the set.
Algo : Proceeds to compute size of power set and then bitwise logic based on the size of the set.

Reference: http://www.geeksforgeeks.org/power-set/
**/


public void powerSet(int [] arr)
{
	if(arr==null || arr.length==0)
		return;
	int sz_powset=Math.pow(2,arr.length);
	int j;
	int sz_set=arr.length-1;
	for(counter=0;counter<sz_powset;counter++)
	{
		for(int j=0;j<sz_set;j++)
		{
			/* Check if jth bit in the counter is set
             If set then print jth element from set */
			if(counter &(1<<j))
				System.out.print (arr[j]);
		}
		System.out.println();
	}
}

