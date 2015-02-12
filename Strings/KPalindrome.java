/**
Determine if a given string is a k-palindrome.
A k-palindrome is a string which transforms into a palindrome on removing at most k characters.

Given a string S, and an integer K, print "YES" if S is a k-palindrome; otherwise print "NO".

**/


public boolean isKPalindrome(String input,int k)
{

	if(input.length()<=1)
		return true;// if the length of the input is <=1. Then its a palindrome
	
	while(input.charAt(0)==input.charAt(input.length()-1))//if the first and last character are the same. Skip them
	{
		input=input.substring(1,input.length()-1);
		
		if(input.length()<=1)
			return true;
	}
	
	if(k==0)// k has been decremented to 0 and there is a mismatch!
		return false;
	//recurse on smaller parts.
	
	return(isKPalindrome(input.substring(1,input.length()),k-1) || isKPalindrome(input.substring(0,input.length()-1),k-1));
}


