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




boolean wordBreak(String str, Set<String> dict) {
	
	if(str.length()==0 || str ==null)
		return true;
	//tracker to track the boolean array.
	boolean [] tracker = new boolean[str.length()+1];

	//initialize the tracker.
	tracker[0]= true;
	
	//inspect the string.
	for(int i=0;i< str.length()-1;i++) {
		
		StringBuilder s= new StringBuilder(str.substring(0,i+1));
		//inspect if substrings are valid. 
		for (int j=0;j<=i;j++) {
			if(tracker[j] && dict.contains(s)) {
				tracker[i+1]=true;
				break;// inspect next larger substring.
			}
			
			//remove from head of s to check other substrings.
			s.deleteCharAt(0);	

		}
	}	
	//if the entire string can be broken into valid words, then the last index of tracker will be true, else false.

	return tracker[str.length()];
}

 
			
