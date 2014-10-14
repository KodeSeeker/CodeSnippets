
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
	return (paths(i+1,j) +paths(i,j+1));
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

