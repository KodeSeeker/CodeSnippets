

/**
Finding the longest palindromic substring is a classic problem of coding interview.
**/

public String longestPalindromicSubstring(String str)
{
	if(str ==null ||str.length()==0 || str.length()==1)
		return str;
	String longest="";
	String tmp ="";
	
	for(int i=0;i<str.length()-1;i++)
	{
		//find longest palindromic substring around i.
		tmp= expandAroundIndex(str,i,i);
		if(tmp.length()> longest.length())
			longest=tmp;
		
		//find longest with center i and i+1.
		tmp =expandAroundCenter(str,i,i+1);
		
		if(tmp.length()>longest.length())
			longest=tmp;
	}
	
	return longest;
}


public String expandAroundCenter(String in, int begin, int end)
{
	
	if(in ==null) 
		return null;
	while ( begin > =0 && end<in.length() && in.charAt(begin) ==in.charAt(end))
	{
		begin--;
		end++;
	}
	return in.substring(begin+1, end-begin-1);
}
