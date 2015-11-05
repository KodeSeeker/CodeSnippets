package com.test;
/**
 * Master mind game :CTCI
 * @author vmahadevanveeramani
 *
 */
public class MasterMind {

	int hits;
	int pseudoHits;
	static int[] freq;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//	getScore("RGGB","RRRY");
			getScore("RGYB","GRRB");
			getScore("RGGB","GRYC");

	}

// to keep track of pseudo hits we need an array that tracks the number of hits per color. 
	// Store the colors and their hits in a hashmap or an array for this .
	/**
	 * Returns index to modify in the map.
	 * @param col
	 * @return
	 */
	static int getColorKey(char col)
	{
		switch(col)
		{
		case 'R': return 0;
					
		case 'G': return 1;
		case 'Y': return 2;
		case 'B' : return 3;
		default : return -1;
		}
	}
//	static void getScore(String correct, String guess) {
//		MasterMind mind  = new MasterMind();
//		
//		if(guess==null && correct ==null)
//			return ;
//		if(guess ==null|| correct==null || guess.length() !=correct.length())
//			throw new IllegalArgumentException("Invalid input arguments");
//		freq= new int[guess.length()];
//		for(int i=0;i<correct.length();i++)
//		{
//			if( correct.charAt(i)==guess.charAt(i))
//			{	mind.hits++;
//				continue; 
//			}
//			else if(guess.indexOf(correct.charAt(i))!=-1)// guess has the character at some other spot- psuedo hit
//			{
//				int key=getColorKey(guess.charAt(i));// key for pseudo hit. 
//				freq[key]++;//count pseudo hit.
//			}
//		}
//			//count the pseudo hit score  by 
//	
//		for (int j: freq)
//		{
//			if(j==-1)
//				continue;
//			mind.pseudoHits+=j;
//		}
//		
//		System.out.println("hits" +mind.hits +"pseudo hits"+ mind.pseudoHits);
//	}
	
	
	
	public static void  getScore (String correct, String guess)
	{
		if(guess==null && correct ==null)
			return;
		int hits=0;
		int pseudoHits=0;
		int[] freq=  new int[correct.length()];
	
		if(guess ==null|| correct==null || guess.length() !=correct.length())
			throw new IllegalArgumentException("Invalid input arguments");
		
		for ( int i=0;i<guess.length();i++)
		{
			char guessChar = guess.charAt(i);
			if(guessChar==correct.charAt(i))
			{
				hits++;
			}
//			else if(correct.indexOf(guessChar)!=-1)// this is O(n^2)
//			{
//				System.out.print(guessChar);
//				pseudoHits++;
//			}
			else {
				int code =getColorKey(guessChar);
				if(code==-1)
					continue;
				freq[code]++;
			}
		
		}
		for (int j:freq)
		{
			pseudoHits+=j;
			System.out.println("Freq"+j);
		}
		System.out.println("Hits "+ hits + " Pseudo" +pseudoHits);
	}
}
