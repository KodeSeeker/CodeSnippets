package com.test;

public class RunLengthEncoding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(runLengthEncoding("a"));
		System.out.println(runLengthEncoding("aa"));
		System.out.println(runLengthEncoding("aabb"));

		System.out.println(runLengthEncoding("aabbc"));
		System.out.println(runLengthEncoding("abbc"));
		

		System.out.println(runLengthDecoding("a2"));
		System.out.println(runLengthDecoding("a2b2"));
		System.out.println(runLengthDecoding("a2b2c1"));
		
	}
	
	
	public static String runLengthEncoding(String in)
	{
		
		if(in==null)
			throw new IllegalArgumentException();
		if(in.length()==0)
			return "";
		if(in.length()==1)
			return in+ "1";
		
		char[] chars =in.toCharArray();
		int i=1;
		int count=1;
		char pChar=chars[0];
		StringBuilder out = new StringBuilder();
		
		while(i<chars.length) {
			
			//if its the same character. increment count
			if(pChar== chars[i])
			{
				count++;
				
			}
		
			else if(pChar!=chars[i])
			{
				out.append(pChar);
				out.append(count);
				//update pchar
				pChar=chars[i];
				count=1;
			
			}
			i++;

		}
		out.append(pChar);// we will miss out the last character as there is no change after it.So need to address it separately.
		out.append(count);
		return out.toString();
	}

	static String runLengthDecoding(String s){
		
		if (s ==null ||s.length()<=1)
			return s;
		StringBuilder result = new StringBuilder();
		int countPos=1;
		int charPos=0;
		char [] c= s.toCharArray();
		while(countPos<c.length){
			
			int cnt = c[countPos]-'0';
			for (int i =0;i<cnt;i++){
				result.append(c[charPos]);
			}
			charPos+=2;
			countPos+=2;
		}
		
		return result.toString();
				
		}
	}

