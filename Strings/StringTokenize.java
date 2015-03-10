/**
Implement strtok function
**/


List<String> stringTokenize(String input, char delim) {

	if(in ==null)
		return null;
	
	if( input.indexOf(delim) <0)
		return null;
	
	char[] chars = input.tocharArray();
	
	int idx=0;
	
	int wordStart=0;	
	int wordEnd=0;

	List<String> tokenized = new ArrayList<String>();
	
	while(idx <chars.length) {
		
		if(chars[idx] != delim) { // single word.
			wordEnd++;
			idx++;
			continue;
		}
		if(chars[idx] == delim) { // have a match need to find and add a word to list here.
		
			tokenized.add(input.substring(wordStart,wordEnd)); //substring is exclusive so thats ok!
			//update indexes while handling multiple delimiter scenario!
			while(chars[idx] == delim) {//skip all delimiters!
				wordStart = wordEnd+1;
				wordEnd = wordEnd+1; // for the next word.
				idx++;	
			}
		}
	
	
	}
 
	return tokenized;
}

		
