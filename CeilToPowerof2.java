/**
Given a number compute the closest ceil to the power of 2.
e.g. 5->8. 2->2. 
     7>8.

**/

public static int calcCeil(int n)
{
	if(n<0)
		throw new IllegalArgumentException();
	if(n==0)
		return 0;
	if(n & (n-1)==0)// power of 2
		return n;

	//multiply n by 2.
	n<<=2;
	while( n&(n-1)!=0)// e.g. n=10 here.  =1010 and n-1 = 1001=> 1010 &1001=1000.//8
		n= n&(n-1);
	return n;
}


