/**
You are given with an array of 1s and 0s. And you are given with an integer m, which signifies number of flips allowed. 

find the position of zeros which when flipped will produce maximum continuous series of 1s.
**/
/**
To find the length of the longest sequence  -- just keep an array to track of the count of 0's at each index and add
the number of 0's to that index as we walk the entire array basically count [k]= number of zeros seen upto k.
while(count[maxLength]- count [k] <m)- k=maxlength-1.
{
    k--;
    }
return maxLength-(k+1); we could return all 1's from k to maxlength as well?- No it would always start from the back- wrong for finding the actual sequence.


But in order to return the position of zeros we need to keep track of the longest sequence(after flipping zeros)- start of that sequence and the end of the sequence. Similar to sliding window principle
**/

public int[] flipTomax1s(int[] arr, int m)
{
    if (m>arr.length||m<0||arr==null)
        return null;
    
    
    int numZero=0;// denotes the number of zeros seen so far
    int wRight=0;// right edge of window.
    int wLeft=0; //left edge of window.
    int maxLengthSeq=-1;//longest sequence so far flipping zeros so far.
    int maxR=0;
    int maxL=0;
    int i=0;
    while(wRight<arr.length)// we need to inspect the array atleast 1 time completely.
    {
        
        if(numZero<m)
            {
                wRight++;
                if(arr[wRight]==0)
                {
                    numZero++;
                }
             }
             
         if(numZero>m)// exceeded the number of zeros
         {
             wLeft++;//move window from left side
             if(arr[wLeft]==0)
                {
                    numZero--;
                 }
                 
          }
          if(wRight-wLeft>maxLengthSeq)
          {  //update max values.
              maxR=wRight;
              maxL=wLeft;
              maxLengthSeq=wRight-wLeft;
          }
    }
    // now populate the new array based on the above info
    
    System.out.print("The max length of straight 1's after flipping m zeros is "+maxLengthSeq);
     int[] newArr= new int[oldArr.length];
     while(i<maxL)
     {
         newArr[i]=arr[i];// the original array
         i++;
      }
     while(i<maxR)
     {
         newArr[i]=1;//the patch of 1's
         i++;
      
     }
     // remaining need to be copied over from a[i]
     while(i<arr.length)
     {
         newArr[i]=arr[i];
         i++;
      }
      
      return newArr;   
 }
    
    
          
              
             
