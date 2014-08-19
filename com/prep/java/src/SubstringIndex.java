/**Find the first index of the substring. Condition: Do not use java library function 
or regular expressions. And measure the performance of your implementation with the standard java 
library function.
Examples: String 1: “abcdefg” String 2: “bcd” Should return 1 String 1: “abcdefg” String 2: “x” Should return -1**/


public int  subStringIndex(String  in,String pattern)
{
 int matchIndex=-1;
 int i=0,j=0;
 while (i<in.length())
 {
  int tmp=i;
  if (in.charAt(i)==pattern.charAt(j))
   {
    
    while(j<pattern.length()-1)
   {
    if(in.charAt(i++)!=pattern.charAt(j++))
     break;
   }
    if(j==pattern.length-1)
     matchIndex=tmp;// pattern inspected completely.
     
   }
  }
  
  return matchIndex;
 }
