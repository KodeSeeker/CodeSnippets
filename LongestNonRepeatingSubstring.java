/** Find the longest non repeated substring within a string .

  The idea is to have two pointers and move one along the string till you encounter a repeating character.
   Keep track of the characters in the array using a boolean array [256]
**/

public static String longestNonRepeatedSubstring(String in)
{
	if(in == null)
		return null;
	boolean[] map= new boolean[256];
	int i,j;
	int maxLen;
	int startPos,endPos;
	while(j<in.length())
	{
		int asciiCode= (int)in.charAt(j);
		if(map[asciiCode]==true)//we've already seen this character.
		{
			maxLen=Math.max(maxLen,j-i);
			startPos=i;
			endPos=j;
			//now update i to j to look for the next sequence and also reset the boolean array
			while(i!=j)
			{
				map[(int)in.charAt(i)]=true;
				i++;
			}
		}
		else
		{//we've not seen this character till now. So we update the map to reflect it as seen.
			map[asciiCode]=true;
		}

	}	

	//max length is stored in -maxLen
	return in.substring(startPos,endPos+1);

}
