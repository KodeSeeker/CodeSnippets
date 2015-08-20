/**
Find the longest repeated substring within a string and return it.(Non overlapping)

ie. "bananana"=>"ana"

Algorithm.
	1) Create a suffix array from the input.
	2) Sort the suffix array.
	3) Longest common prefix of the items in the suffix array.(Just check neighbors,after sorting) . Should return the longest repeated substring.

**/

public String LongestRepeatedSubstring(String in)
{
	if(in == null)
		return null;
	String clean =in.replaceAll("\\s+"," ");//replace multiple spaces with a single space.
	int len=clean.length();
	//create suffix array
	String[] suffixArr= new String [len];
	for(int i=0;i< len;i++)
	{
		suffixArr[i]= clean.substring(0,i);
	}
	
	//sort the suffix array.
	Arrays.sort(suffixArr);
	//now compute the longest common prefix-- 
	String lrs;
	for(inti=0;i<suffixArr.length-2;i++)
	{
		String x= lcp(suffiArr[i],suffixArr[i+1];)
		if(x.length()>lcp.length())
		{
			lrs=x;	
		}
	}
	
	return lrs;
}

//helper to find the longest common prefix between two strings
public static String lcp(String a,String b)
{

	int minLen= Math.min(a.length(),b.length());
	StringBuilder longestPrefix= new StringBuilder();
	for(int i=0;i<minLen;i++)
	{
		if(a.charAt(i)==b.charAt(i))
		{
			longestPrefix.append(a.charAt(i));
		}
		else
			break;
	}
	
	return longestPrefix.toString();
}
	
