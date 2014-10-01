
/**
11 is decimal number which can be converted to binary and written as 1011. 
example:
2  12

2  6    0

2  3   0

2   1   1

1
**/

public string decimalToBinary(int num)
{
	if(num<=0)
		return null;
	
	int [] tmp = new int[10];// tmp array to store its value - assume binary is at most 10 digits long. 
	StringBuffer binary = new StringBuffer();
	int i=0;
	while(num!=0)
	{
		i++;
		tmp[i]=num%2;
		num/=2;
	}
	
	while(i>=0)
	{
	 binary.append(tmp[i]);
	}
	
	return binary.toString();


}



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
