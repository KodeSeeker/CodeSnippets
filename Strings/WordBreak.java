/**
Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

For example, given
s = "leetcode",
dict = ["leet", "code"].

Return true because "leetcode" can be segmented as "leet code".
Approach use dynamic programming. Use a boolean array to check the invariant.
ie. the last index of the tracker should be true if the prev index is true and the current substring can be split into a valid word.
Remove from the front of the current substring to ensure all substrings are checked. 
**/

boolean wordBreak(String in,Set<String> dict) {

	if( in ==null || in.length() == null )
		return true;
	
	if(dict.size() ==0)
		return in.length()==0;
	
	boolean[] tracker = new boolean[in.length()+1];//auxilary tracker to track if the substring at this point is a valid string.
						      //by default all are false!
	tracker[0] =true;
	
	//start from i=1 as 0 is base case in tracker(already set).
	for (int i=1; i<in.length(); i++) {
	
		//inspect all the valid substrings looking back from 0 till i.
		for( k =0; k<i; k++) {
			
			if(checker[k] && dict.contains(in.substring(k,i))) { // basically we check if the first character was true and then whether the rest of
				checker[i] =true;					  // the current substring is part of the dict. If yes. we mark this value of i in tracker as true
			}						  // for "helloworld" this would be i=6 as substring (0,6) is in dict 
			
			if(checker[i])// this ensures that we pick the next substring as SOON as we've seen a valid word!
				break;
		}	
	}

	return tracker[in.length()+1];// will be true if all substrings were part of the dict. 
					// "hellofwabif" will fail as wabif is not in dict 
}


