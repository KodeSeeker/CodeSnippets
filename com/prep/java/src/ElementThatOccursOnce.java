/*
 
 Constraints: O(n) time O(1) space
 Sample Test Case arr =[2,3,3,3,5,5,5] Output : 2
*/

int elementOccuringOnce(int [] arr)
{
    if (arr.length==0)
        return -1;// no elements in array.
        
    int result=0;
    int int_sz=32; //assume integers are 32 bit.
    int sum;// sum of values for each bit.
    // calculate for each bit in number.
    int bit_mask;
    for(int i=0;i<int_sz;i++)
    {
        sum=0;
        bit_mask=1<<i;
        for(j=0;j<arr.length;j++)
        {
            if(arr[j] & bit_mask)
             sum++;
        }
        
        
        if(sum %3==0)
         {
             result|=x;
         }
    }
    
    return Integer.parseInt(result,2);// decimal form
    
}