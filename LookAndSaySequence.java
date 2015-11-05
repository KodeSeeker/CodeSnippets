package com.test;

public class LookAndSaySequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(generateLookAndSay("21", 0));
		

	}

	
	static String generateLookAndSay(String numbers,int position)
	{
		//e.g. "1"
		char firstChar= numbers.charAt(0);
		if(numbers.length()== position)
		{
			return "1"+ firstChar; // if there is one character its count will always be 1.
			
		}
		return numbers.charAt(position)==firstChar? 
				generateLookAndSay(numbers,position+1):	            // the current char equals to the first one so keep checking
					String.valueOf(numbers.substring(0,position).length())+
						firstChar+generateLookAndSay(numbers.substring(position),0);
				 // otherwise, read off until just before the current position
	            // then check from the current position
	            // calling this function itself again.
	}
	
	
	
}


