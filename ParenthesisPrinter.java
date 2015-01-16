package com.test;

public class ParenPrinter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parenWrapper(3);
		parenWrapper(2);
		parenWrapper(5);

	}


	
	
	 static void parenWrapper(int nPairs)
	{
			if(nPairs<0)
			{
				throw new IllegalArgumentException();
			}
			if(nPairs==0)
			{
				System.out.println("");
			}
			printParens("",nPairs,0);
	}
	/**
	 * Idea here is that pass n:Pairs as param for openstock.
	 * openStock signifies no . of open paren, 
	 * 
	 * every time you print an open, it decreases and an offset for close increases. Base case: When both are 0 you print out. 
	 * @param out
	 * @param openStock
	 * @param closeStock
	 */
	  static void printParens(String out, int openStock,int closeStock)
	  {
		  if(openStock ==0 && closeStock==0)
			  System.out.println(out.toString());
		  if(openStock>0)
			  printParens(out+"(",openStock-1,closeStock+1);
		  if(closeStock>0)
			  printParens(out+")",openStock,closeStock-1); 
	  }
}

