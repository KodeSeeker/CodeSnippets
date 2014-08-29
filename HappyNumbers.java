/**A happy number is defined by the following process: Start with a positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay). Those numbers for which this process ends in 1 are happy numbers, while those that do not end in 1 are unhappy numbers (or sad numbers).**/

import java.util.*;

public boolean isHappyNumber(int num)
{
	if (num == 1)
		return true;
	Map<Integer> repeats = new HashMap<Integer>();
	
	while(num!=1 and repeats.add(num))
	{
		int sum =0;
		
		while(num >0)
		{
			int d= num %10;
			sum += Math.pow(d,2);
			num=num/10;
		}
		num =sum;
	}
	
	return ( num==1? true:false);
}
