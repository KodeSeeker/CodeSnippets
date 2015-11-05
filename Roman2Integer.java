package com.test;

import java.util.HashMap;
import java.util.Map;

public class Roman2Integer {

	/**
	 * @param args
	 */
	
	static Map<Character,Integer> map = new HashMap<Character,Integer>();

	static void init(){
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);

		map.put('C', 100);

		map.put('D', 500);
		map.put('M', 1000);
		
	}
	static int roman2Integer(String roman) {
		
		init();
        if(roman == null )
                throw new IllegalArgumentException();

        char[] rc = roman.toCharArray();
        int sum = map.get(rc [roman.length()-1]);

        for(int i = roman.length()-2;i>=0;i--){

                if(map.get(rc[i]) < map.get(rc[i+1]))
                	sum-=map.get(rc[i]);
                else
                	sum+=map.get(rc[i]);
        }

        return sum;
        
}
	public static void main(String[] args) {
		
		System.out.println("IV"+ roman2Integer("IV"));
		System.out.println("III "+roman2Integer("III"));
		System.out.println("VI"+ roman2Integer("VI"));
		System.out.println("XCI"+ roman2Integer("XCI"));


	}

}
