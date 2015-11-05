package com.test;

public class SubstringIndex {

	/**
	 * @param args
	 */
	
	int sourceHash;
	int targetHash;
	
	public static void main(String[] args) {

		System.out.println("We have a match at" +substringIndex("apple", ""));
		System.out.println("We have a match at" +substringIndex("apple", "ba"));
		System.out.println("We have a match at" +substringIndex("apple", "barry"));
		
		System.out.println("We have a match at" +substringIndex("terrific", "terr"));


	}

	/**
	 * Check if the target string in the search string.
	 * Using rolling hash to perform the comparison.
	 * Robin Karp Algorithm.
	 */
	
	static int substringIndex(String source, String target) {
		
		if(source == null && target == null)
			return 0;
		if(source == null || target == null)
			return -1;
		if(source.length() <target.length())
			return -1;
		if (source.length()>0 && target.equals(""))
			return 0;
		int targetHash= getTargetHash(target); 
		System.out.println("Computing  initial target Hash"+ targetHash);
		String sourceString= source.substring(0,target.length());
		int sourceHash = getTargetHash(sourceString);
		System.out.println("Computing  initial source Hash"+ sourceHash);

		if (sourceHash == targetHash){
			return 0;// initial substring matches.
		}
		
		int targetEndinSource= target.length()-1;
		int srcStart=0;
		while(sourceHash != targetHash && targetEndinSource <source.length() -1){
			// rebalance source Hash.
			sourceHash -= Math.pow(7,0)*sourceString.charAt(0);// remove character from left.
			sourceHash/=7;//divide the hash by constant.
			sourceHash+= Math.pow(7,target.length()-1)*source.charAt(++targetEndinSource);
			sourceString=source.substring(srcStart++,targetEndinSource);
			System.out.println("Source string"+sourceString +" source start "+srcStart);
		}
		if (sourceHash == targetHash){
			System.out.println("We found a complete match");
			return srcStart;
		}
			
		else
			return -1;
	}
	
	static int getTargetHash(String target){
		
		int targetHash =0;
		for (int i=0;i<target.length();i++){
			targetHash+= Math.pow(7, i)*target.charAt(i);//crude hash function.
		}
		return targetHash;
	}
}
