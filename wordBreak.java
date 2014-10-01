/**
Given an input string and a dictionary split the input string into words based on the dictionary.
http://ideone.com/Y9AFTx
http://www.geeksforgeeks.org/dynamic-programming-set-32-word-break-problem/
**/

public static void wordBreak(String input)
{
	if( in == null)
		return null;
	StringBuffer result;
	wordBreak(input,input.length(),result);
}

public static void wordBreak(String input, int length, StringBuffer result)
{

	for(int i=1;i<length;i++)
	{
		String prefix= input.substring(0,i);
		
		if(dictionary.hasWord(prefix))
		{
			// dict has word so append to result.
			result.append(" "+prefix);
		   if(i==length)// i is the last character in the string.
			System.out.println(result.toString());
			//recurse on part after i
		   wordBreak(input.substring(i),length-i,result);
		}
	
	}
}
