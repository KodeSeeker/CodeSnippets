

/**
Validate parantheses in a given  expression.
/*[a+(b*c)] // valid
[a+(b*c] // invalid
[], (), {}*/



/*
Checks whether character is a bracket open or close.
 public boolean isBracket(char c) {


}
*/ 



boolean isValidExpression( String input) {


	if(input.length() <=1 && input ==null)
		throw new IllegalArgumentException();
	
	Map<Character,Character> bracket = new HashMap<Character,Character>();

	 brackets.put("{", "}");
   	 brackets.put ("[", "]");
    	 brackets.put ("(", ")");

	//use a stack to maintain the status of the brackets seen so far. 
	Stack<Character> st = new Stack<Character>();
	
	//inspect the string. 
	for(int i=0;i<input.length();i++) {
		char c = input.charAt(i);
		if(!isBracket(c))
			continue; //interested only in bracket.
		if(map.containsKey(c))
			st.push(c);
		else if ( st.isEmpty() || map.get(st.pop())!= c)
			return false;
	}
	
return st.isEmpty();//if stack is empty then we have a valid arrangment of parantheses. else not.
}



