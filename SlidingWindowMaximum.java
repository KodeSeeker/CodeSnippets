
/** Sliding Window Problem
Solid one.

A long array A[] is given to you. There is a sliding window of size w which is moving from the very left of the array to the very right. You can only see the w numbers in the window.
Input: A long array A[], and a window width w
Output: An array B[], B[i] is the maximum value of from A[i] to A[i+w-1]
Requirement: Find a good optimal way to get B[i]
**/
/**
Use a Deque
Keep track of the index of the largest element seen so far in the window . Also ensure that you remove the index of the first index from the window when you move the window ahead to make sure the window is updated correctly
**/

public int[] slidingWindowMax(int[] a,int w)
{
    int len =a.length;
    Deque <Integer> dq= new ArrayDeque<Integer>();
    //set up the deque for the initial window size.
       
    for(int i=0;i< w;i++)
    {
        while(!dq.isEmpty() && a[dq.getLast()]<a[i])
            dq.pollLast();//remove the index's from the end that have values less than current value.
        dq.offerLast(i);// add the new ones at the end.
    }

    // find the sliding window max for the rest of the array.
    for(i=w;i<n;i++)
    {
        B[i-w]=a[dq.getFirst()];// the max of the current window is the value at the  first index of dq.
        
        //remove from end if the value at end index is  less than current value
        
        while(!dq.isEmpty() && a[dq.getLast()]<a[i])
            dq.pollLast();
        //remove from the front of the dq based on the window movement.
        while(!dq.isEmpty() && dq.getFirst()<=i-w)
            dq.pollFirst();
        dq.offerLast(i);
     }
     
     B[n-w]=a[dq.getFirst()]; // last case
     
     return B;  
}
        
