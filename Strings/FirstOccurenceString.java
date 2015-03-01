
/*
Idea. 

 Min time : O(n) we need to look at each element.
 we can store number of occurances of each element in a map. But this would be extra memory.
 So we can use an array of size 256 and store each element based on its ASCII value.
 
 
*/


public int firstOccurenceString(String input)
{
  if (input==null)
    return -1;
  int [] cntArray= new int  [256];
  
  int chrArr=input.toCharArray();
  for(int i=0;i<chArr.length;i++)
  {
  
      cntArrayArray[chrArr[i]]++;
  
  }
  
  for(int i=0; i<input.length;i++)
  {
    if (cntArray[chrArr[i]]==1)
      return chrArr[i];
  }

}
