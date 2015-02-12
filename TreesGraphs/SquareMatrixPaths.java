/**

Count all possible paths from top left to bottom right of a mXn matrix

**/
//complexity - O(m*n)
public static int numberOfPaths(int m, int n)
{
	
	int[] [] paths= new int[m][n];
	//m - number of rowa
	for( int i=0;i<m;i++)
		paths[i][0]=1;// from the first cell in each row there is only one path
	for(int j=0;j<n;j++)
		paths[0][j]=1;// from the first cell in each col there is only one path.
	//compute the number of paths for the rest of the matrix.
	for(int i=1;i<m;i++)
	{
		for(int j=1;j<n;j++)
		{
			paths[i][j]=paths[i-1][j]+paths[i][j-1];
		}
	}
	
	//paths will add up as we process the matrix
	

	return paths[m-1][n-1];//last element in matrix.
}
	




//Naive recursive approach
//exponential time complexity:
public static int numberOfPaths(int m, int n)
{
	if(m==0||n==0)
		return 1;
	return numberOfPaths(m-1,n)+ numberOfPaths(m,n-1);
}


