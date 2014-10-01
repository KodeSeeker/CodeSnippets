
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
public static void printCombinations(int[] arr, int n, int r, int dataIdx,int [] data, int i)
{

	if(dataIdx==r)
	{	
		for(int i=0;i<r;i++)// print current combination
			System.out.print(data[i]);
		System.out.println();
	}
	if(i>=r)
		return;// exit condition.
	data[dataIdx]= arr[i];
	//include current element and recurse
	printCombinations(arr,n,r,dataIdx++,data,i++);
	//exclude current element.
	printCombinations(arr,n,r,dataIdx,data,i++);
}

