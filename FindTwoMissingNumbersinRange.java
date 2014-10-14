/** 

Find 2 missing numbers in an array of integers with two missing values
he values are unsorted but are of [1..n] Example array [3,1,2,5,7,8]. Answer: 4, 6


Algo: Extended version of using XOR to find one missing number. More in comments.
**/

public static void printMissingNumbers(int[] arr)
{
	if(arr==null||arr.length <=0)
		return;
	int x;// used to store the xor.
	for(Integer i:arr)
	{
		x^=i;
	}
	
	//now continue to xor with all the elements in the range.
	for(int i=1,i<arr.length;i++)
	{
		x^=i;
	}
	// now x has the xor of both the missing values.
	//find the left most set bit in x.

	x= x& ~(x-1);// finds the left most set bit
	int p,q;//separate out the values.
	for(Integer i: arr)
	{
		if( i&x ==x)//
			p^=i;
		else
			q^=i;
	}
	
	for(int i=1;i<arr.length;i++)
	{
		if( i &x ==x)
			p^=i;
		else
			q^=i;
	}
		
	System.out.print("Value 1"+x+ "Value 2"+y);
}

		
