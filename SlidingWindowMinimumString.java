/**
Finding the Minimum Window in S which Contains All Elements from T
    Given a set T of characters and a string S, find the minimum window in S which will contain all the characters in T in complexity O(n).

    eg,
    S = “ADOBECODEBANC”
    T = “ABC”

    Minimum window is “BANC”.
Leetcode : http://leetcode.com/2010/11/finding-minimum-window-in-s-which.html
**/



public String minimumWindow(String S, String T)
{
	// use maps to character maps to keep track of the minimum window!
	//initialize a map with characters of T
	// update two maps as you pass along the string S
	int[] needsToBeFound= new int[256];
	int[] hasBeenFound= new int[256];
	
	//update needs to be found based on the characters in T.
	for (int i=0;i<T.length;i++)
	{
		needsToBeFound[T[i]]++;
	}
	// now pass through S .
	
	int begin =0;
	int end =0;
	int minWindowbegin=0;
	int minWindowEnd=0;
	int minLen= INTEGER.MAX_VALUE;
	int count=0;
	
	int SLen= S.length();
	int TLen= T.length();
	while(end <sLen)
	{
		char curr= S.charAt(end);

		if (needsToBeFound[curr]==0)
			continue;// skip this character.
		//else
		hasBeenFound[curr]++;
		if(hasBeenFound[curr]<= needsToBeFound[curr])
		{
			count++;// update the count.  
		}
		

	//if count becomes equal to length of T
	// we need to move begin as far to the right as possible . To make sure we have the smallest window.

	if(count ==TLen)
	{
	 	char beg=S.charAt(begin)
		while(needsToBeFound[beg]==0] || hasBeenFound[beg]>needsToBeFound[beg])
		{
			if(hasBeenFound[beg]>needsToBeFound[beg])
			{
				begin++;// move begin forward 
				hasBeenFound[beg]--;// delete it from whats been found.
			}
		}
	}
	
	int length=end -begin+1;
	// check if overall Min Length needs to be updated.

	if(length<minLength)
	{
		minWindowStart=begin;
		minWindowEnd= end;
		minLength=length;
		count =0;
	}

		end++;//update end for while
	}


	if(minLength==TLen)// we have a minm window containing T
	{
		return S.substring(minWindowStart,minWindowEnd+1);
	}
	
	//else
	return null;

}

