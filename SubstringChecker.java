package com.test;


public class SubstringChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(findIndex("balu", "alu"));
		
	}
	
	static int findIndex(String source, String target) {
		if(source ==null && target ==null)
			return 0;
		if(source ==null|| target==null)
			return -1;
		if(source.length()< target.length())
			return -1;
		char[] sourceArr= source.toCharArray();
		char[] tarArr= target.toCharArray();

		int i=0,j=0;

		
		while(i<sourceArr.length)
		{
			if(sourceArr[i]!=tarArr[j])
			{
				i++;
				continue;
			}
			while(sourceArr[i]==tarArr[j])
			{
				i++;
				j++;
				if(j==tarArr.length)
					return i-(tarArr.length);
			}
		}
		
		return -1;
}
}