package com.test;

public class SimpleReverseString {

	public static void main(String[] srgs){
			
		System.out.println("rev " + rev("rev"));
		System.out.println("verr " + rev("verr"));
		
	}
	
	static String rev(String in){
		char[] tst= in.toCharArray();
		
		for(int i=0,j =tst.length-1; i<=j;i++,j--){
			char tmp= tst[i];
			tst[i]=tst[j];
			tst[j]=tmp;
		}
		
		return new String(tst);
	}
}
