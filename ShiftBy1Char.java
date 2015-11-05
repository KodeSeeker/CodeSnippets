package com.test;

public class ShiftBy1Char {

	public static void main(String[] args){
		
		char a='a';

	//	System.out.println((char)(a+1));
		System.out.println(shiftBy1('z'));
		//System.out.println('y'+1);
	}
	
	static char shiftBy1(char a){
		
		if( a <97 || a>123)
			return '0';
		int numericAscii = a-97;
	//	System.out.println(numericAscii);
		int retAscii= (numericAscii+1)%26;
		
		char ret;
		
		ret = (char)(retAscii+97);
		return ret;
		
	}
}
