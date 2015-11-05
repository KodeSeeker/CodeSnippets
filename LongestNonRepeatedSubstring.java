package com.test;

public class LongestNonRepeatedSubstring {

	
	
	public static void main (String[] args) {
		System.out.println("zeryz "+ longestNonRepeatedSubstring("zeryz"));
		System.out.println("zeryzterifab "+ longestNonRepeatedSubstring("zeryzterifab"));
		System.out.println("zeryzterifabbgwq "+ longestNonRepeatedSubstring("zeryzterifabbgwq"));

	}
	
	public static String longestNonRepeatedSubstring(String in)
	{
	        if(in == null)
	                return null;
	        boolean[] map= new boolean[256];
	        int i=0,j=0;
	        int maxLen=0;
	        int startPos=0,endPos=in.length()-1;
	        while(j<in.length())
	        {
	                int asciiCode= (int)in.charAt(j);
	                if(map[asciiCode]==true || j==in.length()-1)//we've already seen this character.
	                {
	                		if(j-i >maxLen) {
	                			maxLen=j-i;
	                			startPos=i;
	 	                        endPos = (j== in.length()-1?j+1:j);// edge case to pick up the last letter.
	                		}	                        
	                        //now update i to j to look for the next sequence and also reset the boolean array
	                        while(i!=j)
	                        {
	                                map[(int)in.charAt(i)]=false;
	                                i++;
	                        }
	                }
	                else
	                {//we've not seen this character till now. So we update the map to reflect it as seen.
	                        map[asciiCode]=true;
	                }
	               j++;
	        }

	        //max length is stored in -maxLen
	        System.out.println("Max len "+ maxLen);
	        return in.substring(startPos,endPos);

	}

}
