public int maxIndexDiff(int[] arr)
{
    if (arr==null)
        return null;
    /* 
    Sample Input :  {9, 2, 3, 4, 5, 6, 7, 8, 18, 0}
    Output :8
    */
    
    //O(n^2)- trivial keep two pointers: one at end of array and one at start. and keep moving end to left to check 
    //if j-i is maximised.
    
    //O(n) algorithm. Trade time for memory- Dynamic Programming.
    //Keep two aux arrays to store the min from the left and max from the right. (Pre processing)--LMin and RMax.
    // walk through both of them LMin from left and RMax from right. and update  maxDiff as you walk.
    
    // create aux arrays.
    
    int[] LMin= new int [arr.length];
    int[] RMax= new int [arr.length];
    
    LMin[0]=arr[0];
    for(int i=1;i<arr.length;i++)
    {
        LMin[i]=Math.min(LMin[i-1],arr[i])
    }  
    
    RMax[arr.length-1]= arr[arr.length-1];
    for(int j=arr.length-2;j>=0;j--)
    {
        RMax[j]=Math.max(RMax[j+1],arr[j]);
    }
    int i,j;
    int max_diff=-1;
    while(i<arr.length && j<arr.length)
    {
        
        if(LMin[i]<RMax[j])
            {
                max_diff=Math.max(max_diff,j-i);
                j++;// keep increasing j to max j-i.
            }
        else
        {//look at next LMin. -- Remember its not sorted.
            i++;
        }
        
    }
    
    return max_diff;
}