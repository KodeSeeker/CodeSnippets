/**Find the max of two numbers without using operators
Key here : if  a-b is positive . then a is >b.  
else if a-b is negative . then a is <b.

Naive approach: check sign of a-b and multiply its sign with a and flip its bit value and multiply it with b
**/

public int findMaxNaive(int a , int b)
{
	
int k= getSign(a-b);
int q= flip(k);
// at this point either k or q will be 0. and the other will be 1.

return a *k +b*q;
}




public int getSign(int a )
{

	return ( flip(a>> 31) & 0x01);
}

// flips the bit value of the input integer.
public int flip (int a )
{
	return 1^a;
}

// Naive approach doesnt deal with overflow!
// so to deal with overflow, we understand that 
// if a>0 and b<0 a-b has  sign 1. or if a <0 and if b>0  then a-b has sign 0
// so use sign a if a and b have different sign.

public int findMax (int a , int b)
{
	int sgn_a= sign (a); //1 if a>0  and 0 if a<0;
	int sgn_b= sign (b); //"" 
	int sgn_a-b=sign (a-b);
	int both_diff_Sgn= sgn_a ^sgn_b;
	int k;
	if (both_diff == 1)
		k=sgn_a;
	else
		k =sgn_a-b;
	int q= flip (k);
	// either k or q will be 0 and the other will be 1.
	return a*k+b*q;
}

	


