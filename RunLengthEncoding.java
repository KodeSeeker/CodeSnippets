/**
Given a string containing uppercase characters (A-Z), compress repeated 'runs' of the same character by storing the length of that run, and provide a function to reverse the compression. The output can be anything, as long as you can recreate the input with it.

wwwwaaadexxxxxx
w4a3d1e1x6
**/


String runLengthEncoding(String in) {

	if( in == null || in.length() <=1)
		return in;
	
	StringBuilder out = new StringBuilder();


	int charCount=1;

	int i=1;

	while( i <in .length()){

		if(in.charAt(i) == in.charAt(i-1)) {
			charCount++;
		}

		else {
			out.append(in.charAt(i-1));
			out.append(charCount);
			charCount =1;
		}
		i++;
	}
	out.append(in.charAt(in.length()-1);// last character!
	out.append(charCount);// left over char count -- for the last character.


	return out.toString();
}

	

		
		
