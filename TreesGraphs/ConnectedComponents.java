
/**

Find the number of islands
Given a boolean 2D matrix, find the number of islands.
A.K.A Find the number of islands in a satellite map.
A.K.A Find the number of disjoint objects in a bit map.
Image : http://en.wikipedia.org/wiki/File:Pseudoforest.svg
**/

/**
Algorithm: Use DFS to find the individual connected components/islands in the input.
The number of islands is given by the number of calls to DFS
**/

public class ConnectedComponents
{

	 //created a boolean map that represents the flag for whether an island 
        // has been visited or not.

	public static boolean [] [] visited ;
	public static int countConnectedComponents;
	public static int NUM_ROWS;
	public static int NUM_COLS;
/**
 @args : 2D int  array that represents the map.
 @returns: number of connected Components.
**/
public static int connectedComponents(int [][] in )
{
	if(in==null)	
		return 0;

	//now look at each cell and do DFS from each to count number of connected components.
	NUM_ROWS=in.length;
	NUM_COLS=in[0].length;
	
	//initialize the boolean array .
	visited = new boolean [in.length][in[0].length];
	
	for(int i=0;i <NUM_ROWS;i++)
	{
		for(int j=0; j< NUM_COLS;j++)
		{
			if(in[i][j]==1 && visited[i][j]==false)
			{
				DFS(in[i][j],i,j);
				countConnectedComponents++;
			}
		}
	}

	return  countConnectedComponents;
}


public void DFS(int[][] in,int x,int y)
{
	// making sure we visit all 8 neighbors for a given cell.
	int[] rowIndices= new int[]{-1,-1,-1,0,0,1,1,1};
	int[] colIndices= new int[]{-1,0,1,-1,1,-1,0,1};

	//mark current node as visited
	visited[x][y]=true;
	//mark all k neighbors as visited.
	for(int k=0;k<8;k++)
	{
		if(isSafeToVisit(in,x+rowIndices[k],y+colIndices[k]))
			DFS(in,x+rowIndices[k],y+rowIndices[k]);	
	}

}
	


/**
Checks if a cell is safe to visit. ie. it has not exceeded beyond the boundaries
and has not been visited already.
**/
public boolean isSafeToVisit( int[][] in, int x,int y )
{
	

	return ( (x>0 && y >0) && (x<NUM_ROWS && y<NUM_COLS) && !visited[x][y] && in[x][y] ==1);

}	
