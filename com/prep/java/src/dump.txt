/**
Find the longest palindrome in a given string.
. Expand around centers . Total of 2N-1 centers . 


**/
// prints the longest palindromic substring and its length
public void  longestPalindrome(String s)
{

	if (s==null)
		return 0;
	if(s.length()=1)
		return 1;

	int longestPal=1;
	
	char[] chars = s.tocharArray();
	int left, right, len;
	int startPal;
	//walk through the array .
	for (int i=1;i< chars.length;i++)
	{
		// KEY: Need to find out both odd length and even length palindromes.
		// ODD length palindromes  are centered around i.
		low= i-1;	
		high= i+1;
		
		while(low >=0 && chars[low]== chars[high])
		{
			len = high-low;
			if(len>longestPal)
			{
				startPal=low;
				longestPal=len;
			}
			low--;	
			high++;
		}
	
		
		// EVEN length ones are centered around i-1 and i.
		low =i-1;
		high=i;
		
		while(low>=0 && chars[low]== chars[high])
		{
			len =high-low;
			if(len > longestPal)
			{	
				startPal=low;
				longestPal=len;
			}
			low--;	
			high++;
		}

	}

System.out.print("Longest Palindrome is "+ s.substring(startPal, longestPal+1+ " and is of length"+longestPal );
}



