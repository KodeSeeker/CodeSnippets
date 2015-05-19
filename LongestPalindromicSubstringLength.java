/**
Find the length of the longest palindromic substring.

Recursive - Intuitive approach. 

**/

int lengthLPS(String in, int begin, int end) {

	if(in == null) 
		return 0;
	
	if(begin == end)//"a"
		return 1;

	if(in.charAt(begin) == in.charAt(end) && begin == end+1)//"aa"
		return 2;
	
	if(in.charAt(begin) ==in.charAt(end))//"aba"
		return lengthLPS(in, begin+1, end-1)+2;
	
	return Math.max(lengthLPS(in,begin+1,end),lengthLPS(in, begin, end-1));// characters at begin and end are different. So look at the substrings!
}

/**
Memoize to avoid repeated lookups!
**/

int lengthLPSMemoized(String in) {
		
	int len = in.length();
	
	if ( len ==0 || len ==1)
		return len;

	int[][] mem= new int[len][len];
	
	// all indices where the length of string =1 are palindromes by default.

	for (int i=0;i<n ;i++) {
		mem[i][i] =1;
	}
		
	//walk through string for each subsequence length; susbsequence length denoted by gap
	for(int gap =1; gap<n ;gap++){
		for(int i=0;i<n;i++) {
			
				int j = i+gap;// pointer to end of substring
		
				if(in.charAt(i) == in.charAt(j) && i==j+1)
					mem[i][j] =2;
				else if(in.charAt[i] ==in.charAt[j])
					mem[i][j] =mem[i+1][j-1] +2;
				else 
					mem[i][j] = Math.max(mem[i+1][j],mem[i][j-1]);
		}
	}
	


	return mem[0][len-1];
}
			
		
