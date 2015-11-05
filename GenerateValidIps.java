package com.test;

import java.util.ArrayList;
import java.util.List;

public class GenerateValidIps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> result= generateAllIPs("19216811");
		for(String s:result)
			System.out.println(s);
	}


       static List<String> generateAllIPs(String in) {

               if(in ==null ||in.length()==0)
                       throw new IllegalArgumentException();
       List<String> result= new ArrayList<String>();
               //generate all possible IPs by placing the right periods on the input string. 
               // first consider 1 digit, then 2 all the way to 4 while ensuring the rest of the string is also valid
               // A valid  part of the ip address ranges from 0 to 255 .
       
       for(int i=1;i<4 && i<in.length();i++){
               String partA= in.substring(0,i);
               if(isValid(partA)) {

                       for(int j=1;j<4 && i+j<in.length();j++){
                               String partB= in.substring(i,i+j);
                               if(isValid(partB)){
                               
                               for(int k =1;k<4 && i+j+k<in.length();k++){
                                       String partC =in.substring(i+j,i+j+k);
                                       if(isValid(partC)){
                                        for(int l =1;l<4 && i+j+k+l<in.length();l++){
                                                String partD =in.substring(i+j+k,i+j+k+l);    
                                               if(isValid(partD))
                                                       result.add(partA+"." +partB+"."+partC+"."+partD);
                                               }
                                       }
                               }
                       }
               }                               
       }
}
return result;
}
   	static boolean isValid(String s) {

		if (s == null || s.length() == 0)
			return false;
		if (s.charAt(0) == '0' && s.length() > 1)
			return false;
		int numVal = Integer.parseInt(s);
		return (numVal > 0 && numVal <= 255);
	}
		



      

}
