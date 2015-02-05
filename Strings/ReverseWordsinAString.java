
/***
Reverse words in a string.
Hi how are you
you are how Hi
**/



public String reverseWords(String in)
{
	if(in==null|| in.length()==1)
		return in;

	//reverse all the characters in the string
	String rev= reverse(in,0,in.length()-1);
	StringBuilder result= new StringBuilder();
	//reverse based on spaces
	wordStart=0;
	for(int i=0;i<rev.length();i++)
	{
		if(rev.charAt(i)== ' ')
		{
			result.append(reverse(rev,wordStart,i-1));
			wordStart=i+1;
		}
	}
	//left over part
	result.append(reverse(rev,wordStart,rev.length()-1));
}


public String reverse(String word, int start, int end)
{
	if(end >start)
		return null;
	char[] chars= word.tocharArray[];
	for(int i=start,j=end,i<start/2;i++,j--)
	{
		char tmp=chars[i];
		chars[i]=chars[j];
		chars[j]=tmp;
	}
}



	

