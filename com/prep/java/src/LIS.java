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
  
  int[] tails= new int[arr.length];
  //3 cases.
  int len=1;
  for(int num:arr)
  {
   if(num<tails[0])
    //overwrite the tails[0] with the new least element.
    tails[0]= num;
   if(num>tails[len-1])
   {
    // new large element. So append to the end.
    tails[len++]=num;
   }
   else
   {
    //update LIS with the right element (in between)..
    tails[ceilIndex(arr,-1,len-1,num)]=num;
   }
   
  }
  
  
  public int ceilIndex(int[] arr, int low, int high,int key)
  {
   while (high>low)
   {
    int m=low +(high-low)/2;
    
    (key>=arr[m] ? high:low)=m;
   }
   
   //return upperBound!
   return r;
  }
}