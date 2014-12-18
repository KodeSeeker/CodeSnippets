
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
	 i--;	
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


/** Composite program to handle a number that has both integer and fractional part and returns the binary representation.
**/

public String returnBinaryOfDouble(double num)
{
	if(num<0)
	{
		num=-num;// ignore negative sign as it requires 2's complement.
	}
	

	String rep = String.valueOf(num);
	
	int decPos= rep.indexOf(".");
	
	
	if(decPos!=-1)
	{
		int intPart= Integer.parseInt(rep.substring(0,pos));//19
		double  decPart = Integer.parseInt(rep.substring(pos));//.25
	}
	
	else
	{ // without decimal part
		int intPart= Integer.parseInt(rep);
		double decPart =0;
	}

	//handle int part using general algorithm

	StringBuilder binaryInt= new StringBuilder();
	
	while(intPart>0)
	{
		binaryInt.append(intPart%2);
		intPart/=2;
	}
	binaryInt = binaryInt.reverse();
	
	
	StringBuilder binaryDec= new StringBuilder();
/** Approach for decimal part- Keep checking wrt part>0, if 2* part >=1 , then append 1 and sub 1 from num else append 0.
*/	
	while(decPart>=0)
	{
		if(binaryDec.size()>32)
			throw new IllegalArgumentException("Decimal Part is too large to parse");
		decPart*=2;
		if(decPart>=1)
		{
			binaryDec.append("1");
			decPart-=1;
		}
		else
		{
			binaryDec.append("0");
		}
	}
	
	return binaryInt+"."+binaryDec;
}
