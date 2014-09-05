/***Given a list of words, write a program to find the longest word made of other words in the list.

Example:
input: cat, banana, dog, nana, walk, walker, dogwalker
Output: dogwalker 
**
Idea, 

Recursively split the larger words in the list and check if there are smaller words that make  it up.

***/

public String longestWordFromOtherwords(String[] words)
{
	if (words ==null)
		return null;
	Set<String> set= new HashSet<String>();
	for(String s: words)
	{
		set.add(s);// gets rid of duplicates.
	} 
	//sort in descending length order.
	Arrays.sort(words, new Comparator()
			{ 
				public int compare(String a, String b)
					{
						if (a.length()<b.length())
							return 1;
						if (a.length()== b.length())
							return 0;
						else
							return -1;
					}
			}
		);
	
	for (int i=0;i< words.length;i++)
	{
		if(canBeFormedFromSplits(words[i],true, set))
		{
			return (words[i]); // longest will be checked first because we have the words sorted in descending order.
		}
	}
}

public  boolean canBeFormedFromSplits(String word, boolean originalWord, Set<String> set)
{
		if(set.contains(word) && !originalWord)
			return true;// base case
		else
		{
			for (int i=0;i<word.length();i++)
			{
				String left = word.substring(0,i);// left portion of word.
				String right= word.substring(i);// right portion  of word.
				if(set.contains(left) && canBeFormedFromSplits(right,false,set))// recursively check if the current word can be formed from constituents.
					return true;
			}
			return false;// the word cant be formed by other words in the set.
		}
}
