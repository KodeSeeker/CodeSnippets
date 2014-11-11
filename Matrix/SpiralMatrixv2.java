
/**
 * Prints the spiral matrix	
 * @param mat
 * @param start_row
 * @param start_col
 * @param stop_r
 * @param stop_c
 */
	public void printSpiral(int[][] mat, int start_row,int start_col,int stop_row, int stop_col)
	{
		if(start_row== stop_row && start_col ==stop_col)
		{
			System.out.print(mat[start_row][start_col]);
			return;
		}
		
		if(start_row>stop_col || start_col >stop_col)
			return;
		//Spiral traversal.
		
		for(int i= start_col;i<stop_col;i++)
		{
			System.out.print(mat[start_row][i]+ " ");
		}
		
		for(int i= start_row;i<stop_row;i++)
		{
			System.out.print(mat[i][stop_col]+ " ");
		}
		
		for(int i= stop_col;i>start_col;i--)
		{
			System.out.print(mat[stop_row][i]+ " ");
		}
		
		for(int i= stop_row;i>start_row;i--)
		{
			System.out.print(mat[i][start_col]+ " ");
		}
		
		//Recurse to cover next layer of matrix.
		printSpiral(mat,start_row++,start_col++,stop_row--,stop_col--);
		
	}
