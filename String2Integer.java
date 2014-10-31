/**
Typical atoi function that converts string to int and vice-versa
**/


public int  atoi(String num)
{
	boolean neg=false;
	if(num.charAt(0)=='-')
	{
		neg=true;
		num=num.substring(1);
	}

	int intVal=0;	
	for( char c: num.tocharArray())
	{
		int d= c-'0';
 		intVal=intVal*10+d;
	}
	
	return intVal;
}



public String itoa(int num)
{
	boolean neg=false;
	if(num<0)
	{
		neg =true;
		num=-num;
	}
	 StringBuilder  numString= new StringBuilder();
	while(num>0)
	{
		int d=num%10;
		char c=char(d+'0');
		numString.append(c);
		num/=10;
	}
	
	
	return numString.reverse();
}

		
