/**
WAP to find the Longest Compound Word formed from other words in an array of strings.

Sort list in decreasing order of length.
Split each word and check recursively 
**/

public static String findLongestCompoundWord(String[] arr)
{
	if (arr== null)
		return null;
	Map<String,Boolean> map = new HashMap<String,Boolean>();
	//sort in descending order
	Arrays.sort(arr, new Comparator()
	{
		public int compare(String a, String b)
		{
			if (b.length()>a.length())
				return 1;
			if(a.length()== b.length())
				return 0;
			if(a.length() > b.length())
				return -1;
		}
	});

	//add to map.
	for(String s: arr)
	{
		map.put(s,true);
	}
	// check for compound words
	for(String word: arr)
	{
		if (canBeFormedFromOtherWords(word, true, map))
			return word; // we have found our compound word!
	}
}

private static boolean canBeFormedFromOtherWords(String part, boolean isOriginal, HashMap<String,Boolean> map)
{
	if((!isOriginal) && map.contains(part))  //base case
		return true;
	for(int i= 0;i< part.length();i++)
	{
		String left = part.substring(0,i);
		String right= part.substring(i.len);
		
		if( ( map.contains(left) && map.get(left) ==true)  && canBeFormedFromOtherWords(right, false, map)) //check recursively.
			return true;
	}
	map.put(part,true);// prevents repetitions.
	return false; // this compound word doesnt have constituents in the list.
}

