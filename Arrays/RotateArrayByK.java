/*
Rotate an array by k positions in place (without using extra memory) 
Approach :
1) {1,2,3,4,5,6} k=2.=>5,6,1,2,3,4.
Step 1 . Split into two arrays {1,2,3,4}{5,6}
Step 2 : Reverse each split {4,3,2,1}{6,5}
Step 3: Merge both splits -> {4,3,2,1,6,5}
Step 4: Reverse the whole array {5,6,1,2,3,4}-->Rotated by 2


*/
public static int[] rotateK(int[] arr,int K)
{
    if(arr==null|| k<0)
        throw new IllegalArgumentException();
    
    //split the array into two parts .. 0...n-k and n-k+1 to n
    int[] arBeforeK= new int[k];
    for (int i=0;i<n-k-1;i++)
     {
         arBeforeK[i]=arr[i];
     }
    int[] arAfterK= new int[arr.length-k]
    int tmp=0;
	for (int i=k;i<n;i++)
     {
         arAfterK[tmp++]=arr[i];
     }
     
     //Reverse each part 
      arBeforeK= reverse(arBeforeK);
      arAfterK= reverse(arAfterK);
	
	int[] rotate= new int[arr.length];
	//Copy over each part to the array
	for(i =0;i<arBeforeK.length;i++)
		rotate[i]=arBeforeK[i];
	int tmp=K;
	for(i=0;i<arAfterK.length;i++)
		rotate[tmp++]=arAfterK[i];
     	///reverse array to acheive rotate by k effect
	return reverse(rotate);
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
