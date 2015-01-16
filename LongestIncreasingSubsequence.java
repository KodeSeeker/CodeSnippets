/**
Based off geeksforgeeks longest increasing subseuqence to find the length of LIS.
**/

public static void  LongestIncreasingSubsequence(int[] arr)
{

int[] preIndices= new int[arr.length]; // to store previous indices.
int[] tailIndice new int[arr.length]; //to store the tail index.

preIndices[0]= -1;
tailIndices[0]=0;

int len=1;// represents the LIS length as we build it. 

//iterate through the array/

for(int i=0;i<arr.length;i++)
{
	if(arr[i]<arr[tailIndices[0]])
	{	//new small element, so new LIS is started.
		tailIndices[0]=i;
	}
	
	else if (arr[i]>arr[tailIndices[len-1]])// element is larger than the largest in the array.
	{
		//add to end of array after noting current for prev index.
		preIndices[i]=tailIndices[len-1];
		tailIndices[len++]=i;
	}
	else
	{
		//we need to add in between.
		int pos= getCeilIndex(arr,tailIndices,-1,len-1, arr[i]);// find the largest index where arr[i] can be added.
		
		preIndices[i]=tailIndices[pos-1];
		tailIndices[pos]=i;
	}

}
	

for (int i= tailIndices[len-1];i>=0;i=preIndices[i])
{
	System.out.print(arr[i]);
}
}


static int getCeilIndex(int [] arr, int[] tails, int low,int high, int key)
{
	while(high -low >1)
	{
		int mid= high+low>>>1;
		if(arr[tails[mid]]>=key)
			high=mid;
		else	
			low=mid;
	}
	return high;

}

