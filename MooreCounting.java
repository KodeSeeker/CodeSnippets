package com.test;

public class MooreCounting {

	
	public static void main(String ... args)
	{
		
	}
	
	
	public int getmajorityElement(int[] arr )
	{
		int count=1;
		int cand=arr[0];
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i]==cand)
			{
				count++;
			}
			else
				count--;
			
			if(count==0)
				cand=arr[i];
		}
		
		//check if cand occurs more than half the time.
		int cnt=0;
		for(int i=0;i<arr.length; i++)
		{
			if(arr[i]==cand)
				cnt++;
				
		}
		if(cnt>arr.length/2)
		{
			System.out.println("maj element"+cand);
		}
		return -1;
	}
}
