/**
Ctci 17.5
Guess comparator
 given a guess string and solution string. Compute scores of actual hits and psuedo hits.
Pseudo hits are characters that are present in the guess string but at a different location from the solution string
**/
public class Result 
{

int hits;
int pseudoHits;

//generate a code for a character- makes it simpler for comparisons
public int code(char c)
{
	switch(c){
			case 'R':
				return 0;
			case 'G':
				return 1;
			case 'B':
				return 2;

			case 'Y':
				return 3;
			default:
				return -1;
	}	


}
}

public int getScore( String guess, String solution)
{

 	if(guess.length() != solution.length())
		return -1;// incomplete guess!!
	Result res = new Result();
	int[] pseudoHitMap= new int[4];//4 because we have 4 colors!
	for(int i=0;i< guess.length ;i++)
	{
		if(solution.charAt(i)== guess.charAt(i))
			res.hits++; // calculate the hits.
		else 
			{
				int code= code(guess.charAt(i));
				pseudoHitMap[code]++;
			}
	}
	

	// calculate pseudo hits

	for (int i=0;i< guess.length;i++)
	{
		int code =code(guess.charAt(i));
		if(code >=0 && pseudoHitMap[code]!=0)
		{
			res.pseudoHits++;
			pseudoHitMap[codet]--;
		}
	}
}

