/*
int x[3][4] = { 1,  2,  3,  4,
                5,  6,  7,  8,
                9, 10, 11, 12};
                    */
                    
public static void printDiagStrips(int[][] mat)
{
  int rows =mat.length;
  int cols=mat[0].length;
  // calculate the number of slices.
  // rows +cols-1
  int totalSlices = rows +cols-1;
  // key values
  
  for(int slice=0;slice<totalSlices;++slices)
  {
    //for every slice.
    // calculate the number of values that must be skipped before and after a value.
    //z1-before 
    //z2-after
    
    print("Slice "+slice);
    int z1= slice <rows ?0:slice-cols+1;
    int z2 = slice < cols ? 0: slice-cols+1;
    //now print every slice
    //z1>z2
    for(int j=  slice-z1; j >= z2 ; j--)
    {
      
      //print x[j] [slice-j] for [1,(2,5),(3,6,9)..]
      //print x[rows-j-1][slice-j] for [9,(10,5).....]-- anti diagonals
    }
  }