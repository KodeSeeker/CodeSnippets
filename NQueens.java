/**
Solve the 8 queens problem using recursion and backtracing.
 *  Prints out all solutions.
 *
 *  Limitations: works for N <= 25, but slows down considerably
 *  for larger N.
 *
 *  Remark: this program implicitly enumerates all N^N possible
 *  placements (instead of N!), but the backtracing prunes off
 *  most of them, so it's not necessarily worth the extra
 *  complication of enumerating only permutations.
**/


//wrapper enumeration
public static void enumerate(int N)
{
	if(N<=0)
		return;
	int[] arr= new int[N];
	enumerate(arr,0);
}

// function that does the enumeration
public static void enumerate(int[] arr, int N)
{
	int len= arr.length;
	if(N==len)
		printQueens(arr);////print out the board.
	else
	{
		for(int i=0;i<len;i++)
		{
			arr[N]=i;// assign i to Nth column.
			if(isConsistent(arr,N))// check if this arrangment is valid.
				enumerate(arr,N+1);// check next level.
		}
	}
}

//checks if the arrangment upto the Nth column is valid.
public static boolean isConsistent(int[] arr, int N)
{
	for(int i=0;i<N;i++)
	{
		if(arr[i]==arr[N]) 
			return false;// same column check.
		if(arr[i]-arr[N]==( N-i)) 
			return false;// same major diagonal.
		if( arr[i] - arr[N] == (i-N))
			return false;// same minor diagonal
	}
return true;// this is a valid placement.
}


public void printNQueens(int [] arr)
{
	int N= arr.length;
	for(int i=0;i<N;i++)
	{
		for(int j=0;j<N;j++)
		{
			if(arr[i]==j)
				System.out.print("Q ");
			else
				System.out.print("* ");
		}
		System.out.println();
	}

	System.out.println();
}
	
	


