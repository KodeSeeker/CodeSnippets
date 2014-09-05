/**
Pick M numbers from an array of N numbers where each number can occur with equal probability.(M<N)
YOu are given a random number generator 
Algo:  Copy the first M numbers from the original array.
Traverse through the rest of the array and pick a random index to replace value in the initial subset. This ensures randomness.

**/

public int[] pickMNumbersfromN(int [] arr, int M)
{
	if(arr== null)
		return null;
	if (M> arr.length)
		return null;
	int[] Mnums= new int [M];
	//copy first M numbers .
	for(int i=0;i <M;i++)
		MNums[i]= arr[i];
	// now do random swapping.
	for (int i=M;i< arr.length; i++)
	{
		int k= rand(0,i);
		if (k<M)
			MNums[k]=arr[i];
	}

	return MNums;
}

