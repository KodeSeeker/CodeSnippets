/**
Find a missing number from an array of length n. where the elements are in the range 1 to n.

**/
// simple approach sum all the elements in the array and sum of the elements in the range . Subtract the two . you will get the missing number
// using xor- avoids overflow.

public int getMissingNumber(int [] arr)
{
	if (arr== null)
		return -1;
	int xor;
	for(int i=0;i<arr.length;i++)
		xor^=a[i];
	for(int i=1;i<=arr.length;i++)
		xor^=i;
	
	//xor now has the missing value 
	return xor;
}


//BONUS: Find two missing numbers in the range.
/**
Reference : http://stackoverflow.com/questions/20026243/find-2-missing-numbers-in-an-array-of-integers-with-two-missing-values
**/


public void printTwoMissingNumbersinRange(int [] arr)
{
	if(arr== null)
		return;
	// similar approach to above.
	//xor all the numbers in the array and all the numbers in the range. The resultant value 
	// will be the xor of 2 elements.
	int xor;
	for( int i=0;i< arr.length;i++)
		xor^=arr[i];
	for(int i=1;i<=arr.length;i++)
		xor^=i;
	/**
	 Now xor contains the xor of the  2 missing elements. 
	Find the left most set bit in xor. And if the left most element is set then xor it with p other wise xor it with q.
	Do this for both the array and the elements in the range. This will put the missing elements into p and q.
	**/

	int p,q;
	xor= xor & (~(xor-1));// set only the left most set bit in xor.
	
	for(int i=0;i < arr.length;i++)
	{
		if(arr[i] & xor ==1)
			p^=a[i];
		else
			q^=a[i];
	}
	
	for(int i=1;i <= arr.length;i++)
        {       
                if(i & xor ==1)
                        p^=i;
                else
                        q^=i;
        }

	// at the end of this. Both the values should be separated into p and q respectively.
	
	System.out.print("Value 1" +p " Value 2" +q);
}
	



