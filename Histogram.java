package com.test;

import java.util.Stack;

public class Histogram {

	/**
	 * 
	 * @param arr
	 * @return largest area
	 */
	public int largestAreaHistogram(int[] arr)
	{
		Stack<Integer> hists= new Stack<Integer>();
		Stack<Integer> indexes= new Stack<Integer>();
		
		if(arr.length==1)
			return arr[0];
		int largestArea=Integer.MIN_VALUE;
		int tmpArea;
		
		//inspect histogram

		for(int i=0;i<arr.length;i++)
		{
			//if value seen is greater than any seen yet, push value and index onto respective stacks
			if(arr[i]> hists.peek() || hists.isEmpty())
			{
				hists.push(arr[i]);
				indexes.push(arr[i]);
			}
			
			else if(arr[i]<hists.peek())
			{
				 int lastIndex=0;
				 
				 while(!hists.isEmpty() && hists.peek() >arr[i])
				 {
					 //remove all values that are less than the current  value and compute the area.
					 lastIndex= indexes.pop();
					 tmpArea= (lastIndex-i)*hists.pop();
					 if(tmpArea>largestArea)
						 largestArea=tmpArea;
				 }
				 // add current index and hist to stacks.
				 hists.push(arr[i]);
				 indexes.push(i);
			}			
		}
		
		return largestArea;
	}
}
