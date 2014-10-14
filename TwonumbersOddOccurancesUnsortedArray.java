//sample input 
/*Input: {12, 23, 34, 12, 12, 23, 12, 45}
Output: 34 and 45
Simple solution HashTable. store count and number. If count%2 !=0 then print.
Shooting for O(n) time and O(1) space.
 
 Solution use XOR: Allthe numbers occuring even number of times will be xored. 
 Even occurances of these numbers will also be xord
 Retreive number pair from xor
 Find right most set_bit 
 rightmostsetbit=(xor) & ~(xor-1)
  
  recover numbers from xor.

*/


public static void recoverOddOccurring(int [] arr)
{
  // basic error checking.
  int xor=arr[0];
  for(int i=1;i<arr.length;i++)
  {
    xor^=arr[i];
  }

  int right_most_set_bit= xor & ~(xor-1);

  
  for(int i=0;i<arr.length;i++)
  {
     if (arr[i] & right_most_set_bit)
      x^=arr[i];
    else
      y^=arr[i];
  }

  Sysout (x,y);

}
