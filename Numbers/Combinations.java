
/** Program to print combinations of numbers in an array.
Key: Use a temp array to store the current combination.
Print it out as soon as it matches the current value of r.
**/


//n - length of the list. 
// r- choose r at a time
//arr - input array.
public static void printCombinations(int[] arr, int n, r)
{

if (n==0 || r==0)
	return ;
int[] data = new int[r];// tmp buffer to hold each combination.

printCombinations(arr,n,r,0,data,0);
}

//i is the index in the array.
//dataIdx is the index in data.
public static void printCombinations(int[] arr, int n, int idx,int [] data, int r,int dataIdx)
{

	if(dataIdx==r)
	{	
		for(int i=0;i<r;i++)// print current combination
			System.out.print(data[i]);
		System.out.println();
	}
	if(dataIdx>r)
		return;
	data[dataIdx]=arr[idx];//create a buffer to hold a combination.

	//include  current element in placeholder to create a combination and move dataIdx forward to include next element.
	printCombinations(arr,n,idx+1,data,r,dataIdx+1);
	

	//overwrite current element in placeholder with next element from array by not incrementing it.
	printCombinations(arr,n,idx+1,data,r,datIdx);

}

