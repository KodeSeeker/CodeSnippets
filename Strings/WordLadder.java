/**
Given two words (start and end), and a dictionary, find the length of shortest transformation sequence from start to end, such that:

Only one letter can be changed at a time
Each intermediate word must exist in the dictionary
For example,

Given:
start = "hit"
end = "cog"
dict = ["hot","dot","dog","lot","log"]
As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
return its length 5.

Note:
Return 0 if there is no such transformation sequence.
All words have the same length.
All words contain only lowercase alphabetic characters.
**

Algorithm:
1) Use BFS.
2) Monitor the length of the ladder and the next word to be inspected using two queues. 

**/


public int wordLadderLength(String start, String end, Set<String> dict) {


	if(StringUtils.isEmpty(start) || StringUtils.isEmpty(end))
		throw new IllegalArgumentException();
 
	Queue<String> words= new LinkedList<String>();
	Queue<Integer> currDepth = new LinkedList<Integer>();

	//initialize the lists.
	words.add(start);
	currDepth.add(1);

	
	while(!words.isEmpty())
	{
		String currWord= words.remove();
		int depth = currDepth.remove();
		//perform BFS on currWord.
		//replace every character in it and check against dict.
		char[] currWordArr= currWord.tocharArray();
		for(int i=0;i<currWord.length();i++)
		{
			for(char c='a';c<='z';c++)
			{
				currWordArray[i]=c;

				
				
				String newWord= new String(currWordArray);
					
				if(newWord.equals(end))// a single transformation results in the end word.
					return depth+1;
			
				//transofrmation results in a word in the dict?
				else if (dict.contains(newWord))
				{
					words.add(newWord);// add this word to queue and increment  depth of ladder.
					currDepth.add(depth+1);
					dict.remove(currWord);// remove to prevent  repeats.
				}
			}
		}

	}
	
	return 0; // this point is reached when you start cannot be transformed to end!
}

/**
Complexity = O(dict size *26)
**/

