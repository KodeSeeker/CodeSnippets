
/**

    Given an NxN matrix, find out the number of ways to get to
      the NxNth cell from the 1x1 cell... **/

//Simple recursive approach.

public int paths(int i, int j)
{

	if(i >N || j>N)// where N is the size of the matrix
		return 0;
	if(i==N && j==N)
		return 1;
	return (paths(i+1,j) +paths(i,j+1));// add paths(i+1,j+1) as well if diag movement is allowed!
}


//call starts with paths(0,0);

/**
Another approach to the problem
http://joaoff.com/2008/01/20/a-square-grid-path-problem/
Number of paths for a n x n grid
2n C n
= (2n)!/(n! xn!)

For a M xN grid
=(m+n)!/ (m! x n!)
/** Using  DP to  find number of ways to get from 1x1 th cell to the NxN th cell, using a M x N matrix. 
**/


int paths(int i, int j) {
	
	 if(i< 0 || j <0)
		return -1;

	int[] counts = new int [M] [N]; // for a M xN matrix.
	
	//base case 
	//fill last  column 
	for(int row=0; row<M;row++) {
		counts[row][N] = 1;// if we are going from M xN to 1 it will be counts[i] [0].
	}
	//fill last row .
	for(int col=0; col<N;j++){
		
		counts[M][col]=1;
	}
	
	for(int row=M-1;row>0;row--) {
		for (int col =N-1;col>0; col --) {
			
			counts[i][j] = counts[i+1][j] + counts[i][j+1]; // add counts [i+1][j+1]  if diag movement isallowed !
		}
	}

	return counts[0][0];
}


	

