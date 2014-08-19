/*
Returns length of longest increasing subsequence.
// run time anal
*/
public int LIS(int[] arr)
{
 if (arr==null)
   return -1;
  if(arr.length==1)
   return 1;
  
  int[] tails= new int[arr.length];// stores the largest element in each LIS 
  //3 cases.
  int len=1; // length of the LIS.
  for(int num:arr)
  {
   	if(num<tails[0])
    	{	//overwrite the tails[0] with the new least element.
   		tails[0]= num;
  	} 
	if(num>tails[len-1])
   	{
  		  // new large element. So append to the end.
   		 tails[len++]=num;
   	}	
  	 else
   	{
    		//update tails  with the right element (in between)..
    		tails[ceilIndex(arr,0,len-1,num)]=num;
   	}
   
  }
 
return len; 
}  
/**
searches for the closest index that has the value closer to key
and returns the upper bound 
**/
  public int ceilIndex(int[] arr, int low, int high,int key)
  {
   
	while(high>low)
	{
		int m = low+ (high-low)/2;
		if( arr[m]>=key)
		 	high=m;
		else	
			low=m;	
			
	}
	return high;
  }

