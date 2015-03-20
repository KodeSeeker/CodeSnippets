/**
Find the longest increasing subsequence in a given sequence of numbers
**
Direct extension of finding the length of LIS approach. 
Keeps track of the previous Index's in addition of the current tail indexes.

Time Complexity: O(nlogn ).


**/



public int[] LongestIncreasingSubsequence(int[]arr)
{
    
        if(arr==null||arr.length==0)
            return null;
         
        int size=arr.length;
        
        //two arrays to track the tail of the LIS and prev indexes.
        int[] tailIndices = new int[size];
        int[] prevIndices= new int[size];
        
        //initialise all prev indices to -1.
        
        for(int i=0;i<size;i++)
        {
            prevIndices[i]=-1;// by default prev index is -1.
        }
        
        // by default all tail indexes are 0.
        
        int LISlen=1;// by default 1.
        
        //now inspect each element of the array starting from the second.
        
        for(int i=1;i<size;i++)
        {
            //current element is smaller than the smallest element.
            if(A[i]<A[tailIndices[0]])
            {
                //discard current tail index and start a new list as per algo.
                tailIndices[0]=i;
            }
            
            
            //current element is greater than the largest element.
            else if(A[i]>A[tailIndices[LISlen])
            {
                prevIndices[i]=tailIndices[LISlen];// note the prev index.
                tailIndices[LISlen++]=i;
            }
            
            else
            { // Need to update an element in the current LIS .. 
            
              //find position of the update by doing binary search for its position.
              
              int pos= getCeilIndex(arr[],tailIndices[],-1,LISlen-1,A[i]);
              
              prevIndices[i]=tailIndices[pos-1];
              tailIndices[pos]=i;
            }
            
            
            
            int[] lis= new int[len];
            int k=LISlen-1;
            for(int i=tailIndices[len-1];i>=0;i=prevIndices[i])
            {
                // this is because the list is backwards at this point.
               lis[k--]=A[i];
             }
             
             //now lis has the sequence in the correct direction.
             
             return lis;
             
 }
            
        
        private int getCeilIndex(int[] arr,int [] tails, int start, int end, int target)
        {
            while(end-start>1)
            {
                int mid=start+end>>>1;
                if(target <=arr[tails[mid]])
                   end =mid;
                else
                    start=mid;
                    
             }
		return end;
        }
	        




