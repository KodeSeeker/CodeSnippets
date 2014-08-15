/*
Passed in a a decimal/floating number between 0 & 1.  Return binary representation upto a max length of 32

Key here 2* float, retreives the digit right after the floating point.
if num>=1, append 1
else append 0

*/

public String returnBinary(double num)
{
  StringBuilder binary= new StringBuilder();
  while(num>0)
  {
    if(binary.length()>32)
      return "ERROR";
    //num=.5=>.101;r=1;0;1
    double r=num*2;
    if(r>=1)
    {
      binary.append(1);
      num=r-1;
    }
    else
    {
    binary.append(0);
    num=r;
    }
    
  }
  return binary.toString();
}