package com.test;

public class CeaserShift {

	public static void main (String... args){
		
		//System.out.println("b shifted 2"+ getNewValueBasedOnShift('b', 2));
	//	System.out.println("Z shifted 2"+ getNewValueBasedOnShift('-', 2));
		System.out.println(" shifted 62  "+ getNewValueBasedOnShift('P', 62));
		   int N;
	        N= 90;
	        String str="!m-rB`-oN!.W`cLAcVbN/CqSoolII!SImji.!w/`Xu`uZa1TWPRq`uRBtok`xPT`lL-zPTc.BSRIhu..-!.!tcl!-U";
	        int k =62;
	        StringBuilder sb = new StringBuilder();
	        for(int i=0;i<N;i++) {
	            char curr = str.charAt(i);
	            char newChar=getNewValueBasedOnShift(curr,k);
	            sb.append(newChar);
	        }
//	        System.out.println(str);
//	        System.out.println(sb.toString());
//	        System.out.println("!w-bL`-yX!.G`mVKmFlX/MaCyyvSS!CSwts.!g/`He`eJk1DGZBa`eBLdyu`hZD`vV-jZDm.LCBSre..-!.!dmv!-E");
	}
	
    static  char getNewValueBasedOnShift(char c, int k){
    	 
    	int val =c;
    	int offset =0;
    	if (!(val >=97 && val<=122) && !(val >=65 && val<=90))
    		return (char)val;
    	if(val >=97 && val<=122){
    		if (val+k >122){// assumming we go only upto k-1 spaces greater than 122.
    		offset =((val+k)-122);
    		offset = (offset%26 ==0?offset/26:offset%26);
    		val= (offset+97)-1;
    		}	
    		else {
    			val+=k;
    		}
    	}
    	else if (val >=65 && val<=90){
    		if (val+k >90){// assumming we go only upto k-1 spaces greater than 90.
        		offset =((val+k)-90);
        		offset = (offset%26 ==0?offset/26:offset%26);
        		val= (offset+65)-1;
        		}	
        		else {
        			val+=k;
        		}
    	}
    	return (char)val;
     }

}
