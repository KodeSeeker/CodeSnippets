/*
 Input: {34, 8, 10, 3, 2, 80, 30, 33, 1}
  Output: 6  (j = 7, i = 1)
  */
  
  /*
  Idea: Create an array of minimum elements seen from left to an element LMin . Create another array to create array 
  of max elements upto an element from right.
  Compute max(j-i) using above array
  */
public  int  arrayMaxJ-I(int [] arr)
{
  int len = arr.length;
  if (len==0)
    return;
  int[] LMin= new int[arr.length];
  int[] RMax = new int [arr.length];
  // calculate LMin[]
  
  LMin[0]= arr[0];
  for (int i=1;i< len;i++)
  {
     LMin[i]= Math.min(arr[i],LMin[i-1]);
     
  }
  
  RMax[len-1]= arr[len-1];
  for(int j=len-2;j>0;j--)
  {
     RMax[j]=Math.max(arr[i],RMax[j+1]);
  }
  
  // do the comparison
  int i=0;j=0;
  int maxdiff=-1;// init as -1:as maxDiff can also be 0 if j=i.
  while(i<len && j<len)
    {
      if(LMin[i]< RMax[j])
      {
        maxDiff= Math.max(maxDiff,j-i);
        j++;// move RMax to check to see if there is a bigger maxDiff
      }
      else
        i++;// move LMin to find next MaxDiff.
    }
    
    return maxDiff;// ta-da
}