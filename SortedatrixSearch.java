/**
Search for an element in a sorted matrix. 

Matrix is sorted row wise and column wise in the following manner. 
		  {{10, 20, 30, 40},
                    {15, 25, 35, 45},
                    {27, 29, 37, 48},
                    {32, 33, 39, 50},
                  };

Algorithm - start Search from top right.( or bottom left) Key : Position where going  up/down and left/right leads to increase and decrease or vice versa.

**/

boolean searchSortedMatrix(int[] [] mat, int target) {
	
	if (target == null || mat ==null)
		throw new IllegalArgumentException();

	if ( target < mat[0][0] || target >mat[mat.length-1][mat[0].length-1] )
		return false;// cant be smaller than smallest or larger than largest!

	int rowIdx = 0;
	int colIdx =mat[0].length-1;// top right
	
	while (rowIdx < mat.length && colIdx >0) { // bottom left.
		
		if(target == mat[rowIdx][colIdx])
			return true;
		else if ( target >mat[rowIdx][colIdx]){
			rowIdx++;
		}
		else if (target <  mat[rowIdx] [colIdx]){
			colIdx --;
		}
	}
	
	return false; //not found in matrix !
}
//Runtime O(n) for n Xn matrix and O(m+n) for mxn matrix - Optimal!

	
