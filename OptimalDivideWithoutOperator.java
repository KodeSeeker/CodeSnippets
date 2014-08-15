ublic static int OptDiv(int divident, int divisor)
  {
		int quotient = 0;
		java.util.List<Integer> divisors = new java.util.ArrayList<Integer>();
		java.util.List<Integer> quotients = new java.util.ArrayList<Integer>();
		//now we need some supporting variables to keep track of the increased/decreased divisor and base
		quotients.add(1);
		divisors.add(divisor);
		//now we start our loop, we will use the same criterial as naive div to determine continue or stop
		int currentDivisorIndex = 0;
		while(divident>=divisor)
		{
	  	if(divident>=divisors.get(currentDivisorIndex))//there is space we substract and increase the divisor by doubling!
			{
				divident -= divisors.get(currentDivisorIndex);
				quotient += quotients.get(currentDivisorIndex);//notice it is not 1 but base
				//also double the current divisor and quotient and add to lists
				divisors.add(divisors.get(currentDivisorIndex)*2);
				quotients.add(quotients.get(currentDivisorIndex)*2);
				currentDivisorIndex++;
			}
			else//the current divisor may be too large now thus we need decrease it by halving
			{
				currentDivisorIndex--;//do not forget the update base quotient
			}
		}
		return quotient;
	}
	