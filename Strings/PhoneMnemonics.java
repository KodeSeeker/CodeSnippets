/**
EPI 7.5
Given a phone number mapping and a 7 digit phone number, generate all possible combinations of numbers


First thought approach . For each phone number, assign a character and loop through the rest of it, for 7 numbers
this will  be O(n^7).

However, since this problem lends itself to be recursive in nature, fix one- change one. ie fix a character, look at the rest. 
(Reduces size of input by 1 at each step).
P.S
USE an array to build out the string, so that you can track each index as you build the alphabet mapping. 
**/

mport java.util.HashMap;
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

