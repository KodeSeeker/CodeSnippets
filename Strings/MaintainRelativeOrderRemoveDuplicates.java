/**
WAP to remove duplicates from a string and print out  string while maintaining relative order.

abracadabra -> abrcd


Approach: Have an aux boolean array [256] and set all to false . Wlak through array and set whats there to true.
Walk through array again and add to out iff array[char] = true, set to false after that. 
**/




 String removeDups(String in) {
	
	if (in ==null)
		return null;
	
	boolean[] tracker = new boolean[256];// assume all ascii characters.
	
	for(char c: in.tocharArray()) {
		
		tracker[c] = true;
	}

	StringBuilder out = new StringBuilder();
	
	for(char c : in.tocharArray()) {
	
		if(tracker[c]) {
			out.append(c);
			tracker[c]= false;
		}
		
	}
	
	return out.toString();
}

