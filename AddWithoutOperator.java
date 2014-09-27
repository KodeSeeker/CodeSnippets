/**
WAP to add two numbers without using the + operator.
Key: Use bitwise operations. 
- Calculate sum without carry using the ^.
- Caluclate the carry using the & operation. Recurse
**/

public int add( int a , int b)
{
	if (b==0) 
		return a;
	int sum_without_carry= a ^ b;
	int carry= (a & b) <<0x01;
	return (sum_without_carry,carry);
}

