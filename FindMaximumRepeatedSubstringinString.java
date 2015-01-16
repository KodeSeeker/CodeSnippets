/**
Find the longest repeated substring in a given string ..
For example, the maximum repetitive substring of "abcabcabc" is "abcabc".
Return None in case of no such string. "123456" return "None".

Application of suffix arrays.
**/

public String findLongestRepeatedSubstring(String in)
{
	if(in ==null||in.length()==0)
		throw new IllegalArgumentException();
	String[] suffArr= new String[in.length()];
	
	//construct the suffix array.
	for (int i=0;i<in.length();i++)
	{
		suffArr[i]= in.substring(i);//substring is a linear operation as of Java 7. So overall complexity O(n^2)?
	}
	
	Arrays.sort(suffArr); // sort the suffix Array.
	
	int minL=0;
	String maxStr="";
	for (int i=0;i<suffArr.length-2;i++)
	{
		int j=0;
		
		minL= Math.min(suffArr[i].length(),suffArr[i+1].length())
		
		while(j<minL &&(suffArr[i].charAt(j)==suffArr[i+1].charAt(j)))
		{
			j++;
		}

		if(j>maxStr.length())
		{
			maxStr=suffArr[i].substring(0,j);
		}
	}
	
	return maxStr;
}

