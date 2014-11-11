/*
Rotate an array by k positions in place (without using extra memory) 
Approach :
1) {1,2,3,4,5,6} k=2.=>5,6,1,2,3,4.
{4,3,2,1} {6,5} (Split into two parts k-1, and k to n and reverse each part.

reverse the whole thing 
{5,6,1,2,3,4}


*/



public static int[] rotateK(int[] arr,int K)
{
    if(arr==null|| k<0)
        throw new IllegalArgumentException();
    
    //split the array into two parts 
    int[] arBeforeK= new int[k]
    for (int i=0;i<k;i++)
     {
         arBeforeK[i]=arr[i];
     }
    int[] arAfterK= new int[arr.length-k]
    for (int i=k;i<n;i++)
     {
         arAfterK[i]=arr[i];
     }
     
     //Reverse each part 
      arBeforeK= reverse(arBeforeK);
      arAfterK= reverse(arAfterK);
      
      
      int [] rotate= new int[arr.length];
      //merge both
     rotate= reverse(rotate);
     
 }
 
 private static int[] reverse(int[] arr)
 {
     for (int i=0,j=arr.length-1;i<arr.length/2;i++,j--)
     {
         int tmp=arr[i];
         arr[i]=arr[j];
         arr[j]=tmp;
     }    
 
     return arr;
 }
