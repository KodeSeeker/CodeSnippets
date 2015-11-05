package com.test;

import java.util.Arrays;

public class MainpulateStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("abc  "+modifyStringInPlace("ac"));
		System.out.println("aac  "+modifyStringInPlace("aac"));
	}
	
	static String modifyStringInPlace(String in){

        if(in == null)
                throw new IllegalArgumentException();

        int newStringLength=0;
        int numAs=0;
        int numBs=0;
        char[] inArr= in.toCharArray();
        for(int i=0;i<inArr.length;i++){
        		if(inArr[i]=='b'){
        			numBs++;
        		}
                if(inArr[i]=='a'){
                   numAs++;
                }
         newStringLength++;
        }

        int finalStringLength = newStringLength+ numAs-numBs;


        //traverse from the end of the array, modifying it in one pass as you walk it
     
        // Reusing the same array not possible as java doesnt allow for resizing of arrays,
        char[]modArr = new char[finalStringLength];
        int idx =finalStringLength-1;
        for (int i =inArr.length-1; i>=0;i--){
        	switch(inArr[i]){
        	case 'b':  continue;
        	case 'a' : modArr[idx--]='d';
        			   modArr[idx--]='d';
        			   break;
        	default :  modArr[idx--]= inArr[i];
        				
        	}
        }
        return new String(modArr);
}

	    public static Double multiply(Double a, Double b) {
	        return a * b;
	    
	}

}
