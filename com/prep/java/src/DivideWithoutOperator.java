
/**
Division can be performed by reptititive subtraction. If the dividend is much larger than the  divisor we lose a large amount of time 

 how can we speed this up? Approach: Double the divisor  each time and subtract from the dividend
. We reduce the time significantly by this approach.
**/

public static int divideOptimally(int dividend, int divisor)
{

	if (dividend < divisor)
		return INTEGER.MAX_VALUE;
	if (divisor == 0)
		return INTEGER.MAX_VALUE;
	// keep a set of ArrayLists and an index to track the quotients and divisor
	List<Integer> quotients = new ArrayList<Integer>();
	List<Integer> divisors = new ArrayList<Integer>();
	int quotient =0;
	quotients.add(1);
	divisiors.addh(divisor);
	//index to keep track of the current quotient/divisor
	int currentIndex=0;

	while(dividend>= divisor )// basic condition for division to proceed.
	{
		if(dividend- divisors.get(currentIndex) >=0)
		{
			dividend-= divisors.get(currentIndex);
			quotient+=quotients.get(currentIndex);
			divisors.add(divisors.get(currentIndex)*2);//double the divisor
			quotients.add(quotients.get(currentIndex)*2);// double the quotient to reflect doubled divisor.
			currentIndex++;
		}
		
		else
		{
			currentIndex--; // we overshot and now need to look at earlier entries.
		}
	
	}

	return quotient;

}


 
