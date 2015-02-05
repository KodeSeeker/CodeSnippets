/**
For example, 9's binary form is 1001, the gap is 2.
**/


int maxBinaryGap(int num)
{
	if(num ==0)
		return 0;
	int count =-1;
	int maxCount=0;

	while(num >0)
	{
	
		//get the rightmost bit.
		int right= num &1;
		num>>=1;
		
		if(right==0 && count >=0)
			count++;
		
		else if (right ==1)
		{
			if (count>max)
				max=count;
			count=0; //reset count.
		}
	}

return max;

}

		
