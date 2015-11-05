package com.test.sfmta;

import java.util.HashMap;
import java.util.Map;

public class ParseSFMTA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		init();
	}

	 static Map<Integer,String> orderTypeMapping = new HashMap<Integer,String>();
	 
	 static void init(){
		 orderTypeMapping.put(0,"Tram, Streetcar, Light rail. ");
		 orderTypeMapping.put(1,"Subway, Metro.");
		 orderTypeMapping.put(2,"Rail.");
		 orderTypeMapping.put(3,"Bus.");
		 orderTypeMapping.put(4, "Ferry");
		 orderTypeMapping.put(5, "Gondola, Suspended cable car. ");
		 orderTypeMapping.put(6,"Funicular");
	 }
	 

}
