/*
Given a string, find the length of the longest substring without repeating characters.
For example, the longest substring without repeating letters for “abcabcbb” is “abc”,
which the length is 3. For “bbbbb” the longest substring is “b”, with the length of 1.

Solution idea- O(n) time- use a boolean array Keep track of max length. When you hit a repeated character,
reset array for all seen characters and update max if its larger than the value of max so far.
*/

public static int maxLengthnonRepeating(String in)
{
  // basic error checking.
  boolean[] exists= new boolean[256];
  char[] chars = in.tocharArray();
  int i=0;j=0;
  int maxLen=0;
  while(j<chars.length)
  {
    if(exists[j])
    {
      maxLen=Math.max(maxLen,j-i);
      while(i<j)
      {// set all seen so far to false
        exists[i]=false;
        i++;
      }
      i++;
      j++;//increment both i and j
    }
    else
    {
      exists[j]= true;
      j++;
    }
    
  }
  return maxLen;
}
