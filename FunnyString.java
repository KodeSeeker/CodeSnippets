package com.test;

import java.util.Scanner;

public class FunnyString {

//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
////	       Scanner in = new Scanner(System.in);
////	       int a;
////	       a = in.nextInt();
////	       String first = in.next();
////	       String second = in.next();
//	       checkFunny("acxz");
//	       checkFunny("bcxz");
//	      // checkFunny(first,second);
//	}
//
//	static void checkFunny(String a){
//		StringBuilder aS= new StringBuilder(a);
//		checkFunny(a,aS.reverse().toString());
//	}
//	
//    static void  checkFunny(String a, String b){
//    
//    	if(a.length()!=b.length())
//    		System.out.println("Not funny");
//    	char[] aC= a.toCharArray();
//    	char[] bC = b.toCharArray();
//    	int i=0;
//    	
//    	for(i=1;i <aC.length;i++){
//    		
//    	int currAsciiValA= Math.abs(getAsciiCode(aC[i])-getAsciiCode(aC[i-1]));
//    	int currAsciiValB= Math.abs(getAsciiCode(bC[i])-getAsciiCode(bC[i-1]));
//    	
//    	if(currAsciiValA != currAsciiValB){
//    		System.out.println("Not funny");
//    		break;
//    	}
//    		
//    	}
//    	
//    	if(i ==aC.length)
//    		System.out.println("Funny");
//    }
//
//    static int getAsciiCode(char c){
//		
//		return c-'0';
//		
//	}
	
	
//	import java.io.*;
//	import java.util.*;
//	import java.text.*;
//	import java.math.*;
//	import java.util.regex.*;

		public static void main(String[] args) {
			// TODO Auto-generated method stub

	       Scanner in = new Scanner(System.in);
		       int a;
		       a = in.nextInt();
		       for(int i=0;i <a;i++){
		      checkFunny(in.next());
	           }
		}

		static void checkFunny(String a){
			StringBuilder aS= new StringBuilder(a);
			checkFunny(a,aS.reverse().toString());
		}
		
	    static void  checkFunny(String a, String b){
	    
	    	if(a.length()!=b.length())
	    		System.out.println("Not funny");
	    	char[] aC= a.toCharArray();
	    	char[] bC = b.toCharArray();
	    	int i=0;
	    	
	    	for(i=1;i <aC.length;i++){
	    		
	    	int currAsciiValA= Math.abs(getAsciiCode(aC[i])-getAsciiCode(aC[i-1]));
	    	int currAsciiValB= Math.abs(getAsciiCode(bC[i])-getAsciiCode(bC[i-1]));
	    	
	    	if(currAsciiValA != currAsciiValB){
	    		System.out.println("Not funny");
	    		break;
	    	}
	    		
	    	}
	    	
	    	if(i ==aC.length)
	    		System.out.println("Funny");
	    }

	    static int getAsciiCode(char c){
			
			return c-'0';
			
		}
	
	
	}



