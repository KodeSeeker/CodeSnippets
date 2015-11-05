package com.test;

public class ArrayMaxJ2I {

	/**INCOMPLETE
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr ={6,5,4,3,2,1};
		int[]arr2= {1,2,3,4,5,6};
		int[] arr3= {1,2,3,4,5};
		System.out.println(arrayMaxJ2I(arr2));
	}

	static  int  arrayMaxJ2I (int [] arr)
	{
	  int len = arr.length;
	  if (len==0)
	    return -1;
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
	     RMax[j]=Math.max(arr[j],RMax[j+1]);
	  }

	  // do the comparison
	  int i=0,j=0;
	  int maxDiff=-1;// init as -1:as maxDiff can also be 0 if j=i (for all descending case).
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

}

