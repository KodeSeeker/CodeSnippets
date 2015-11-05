package com.test;

import java.util.HashMap;
import java.util.Map;

public class PhoneMnemonics {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printMnemomics("02");
		System.out.println("-----");
		printMnemomics("1234567");
		System.out.println("-----");
		printMnemomics("2344505");
		System.out.println("-----");
	}


	
	 static  Map<Character,String>  num2c = new HashMap<Character,String>();
     static void printMnemomics (String num){

    	   	 num2c.put('0',"0");
    	     num2c.put('1',"1");
    	     num2c.put ('2',"ABC");
    	     num2c.put('3',"DEF");
    	     num2c.put('4',"GHI");

    	     num2c.put('5',"JKL");
    	     num2c.put('6',"DEF");
    	     num2c.put('7',"PQRS");
    	     num2c.put('8',"TUV");
    	     num2c.put('9',"WXYZ");
             printMnemonics(num,0, new char[num.length()]);
     }



     static void printMnemonics (String num, int idx, char[] alphaBuf){

    	
    	 
             if(idx == num.length()){
            	  StringBuilder tmp=new StringBuilder();
                  for (char b:alphaBuf){
                 	 tmp.append(b);
                  }
                     System.out.println(tmp);
                     return;
             }
             else {
            	 
                     for (char c : num2c.get(num.charAt(idx)).toCharArray()){
                             alphaBuf[idx]=c;
                          
                             printMnemonics(num,idx+1,alphaBuf);
                     }
             }
     }


}
