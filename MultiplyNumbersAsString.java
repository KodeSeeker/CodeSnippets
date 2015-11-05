package com.test;

import java.util.Arrays;

public class MultiplyNumbersAsString {

	public static void main(String... args){
	//System.out.println(multiply("21", "5"));//105
	System.out.println(multiply("99","99"));
	System.out.println(multiply("919","99"));
	}
	
	
	static String multiply(String num1,String num2){
		
		if(num1 =="0" || num2 =="0")
				return "0";
		if (num1 =="" || num2 =="")
			  return "";
		char[] n1= new StringBuilder(num1).reverse().toString().toCharArray();
		char[] n2 = new StringBuilder(num2).reverse().toString().toCharArray();
		char[] n3= new char[num1.length() +num2.length()+1];// max length of n3 =n1+n2+1;
		Arrays.fill(n3,'0');
		
		for(int j=0;j<n2.length;j++){
			int dig1= n2[j]-'0';
			int carry=0;
			int i=0;
			for(i=0;i<n1.length;i++){
				int dig2= n1[i]-'0';
				 int temp=n3[i+j]-'0';
				int cur= dig1 *dig2 +carry+temp;
				n3[i+j]=(char)( (cur%10)+'0');
				carry = cur/10;
			}
			if(carry!=0)
				n3[i+j]= (char)(carry+'0');
		}
		
		StringBuilder rev= new StringBuilder();
		int firstNonZero=0;
		for ( firstNonZero= n3.length-1; firstNonZero>=0;firstNonZero--){//5010 firstNonZero-2
			if (n3[firstNonZero]=='0' && firstNonZero !=0)
				break;
		 
		}
        for(int i=0; i<firstNonZero;i++){
        	rev.append(n3[i]);
        }
		return rev.reverse().toString();
	}
	
	
}
