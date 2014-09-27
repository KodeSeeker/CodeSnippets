/*
Print all possible combinations of r elements in a given array of size n
* if input array is {1, 2, 3, 4} and r is 2,
Then output is 
{1, 2}, {1, 3}, {1, 4}, {2, 3}, {2, 4} and {3, 4}.
**/


public static void printCombination(int[] arr,int r)
{
	int n = arr.length;
	int[] data= new int[r];//if r>0.
	printCombnUtil(arr,n,r,0,data,0);
}

/*
* arr- input array 
* n- length of input array
* r- number of input combinations.
* dataIndex- index of the temp array.
* data -temp array.
* i- index of the main array.
*/
public static void printCombnUtil(int [] arr, int n, int r , int dataIndex, int [] data, int i)
{
	if(dataIndex==r)
	{
		//print out the temp array.
		for(int j=0;j<r;j++)
		{
			System.out.print(data[j]+ " ");
		}
	}
	
	if(i>=n)
		return;// the whole array has been inspected.
	data[dataIndex]= arr[i];
	printCombnUtil(arr,n,r,dataIndex++,data,i++);// include current element and generate combination.
	printCombnUtil(arr,n,r,dataIndex,data,i++);//exclude current element and generate combination.


} 




