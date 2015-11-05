package com.test;

import java.util.HashMap;
import java.util.Map;

public class Panagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(checkPanagram("We promptly judged antique ivory buckles for the next prize"));
		System.out.println(checkPanagram("We promptly judged antique ivory buckles for the prize"));
	}

	
	static boolean checkPanagram(String s){
		s=s.trim();
		if (s == null ||s.length()<=26)
			return false;
		
		char [] in =s.toCharArray();
		Map<Character,Integer> map= new HashMap<Character,Integer>();
		for (char c ='a'; c<='z'; c++){
			map.put(c, 0);
		}
		for (char c: in){
			
			c=Character.toLowerCase(c);
			if(Character.isAlphabetic(c)){
				int count = map.get(c);
				map.put(c, ++count);
			}
		}
		for (char c ='a'; c<='z'; c++){
			
			if(map.get(c)==0)
				return false;
		}
				
		return true;
	}
}
