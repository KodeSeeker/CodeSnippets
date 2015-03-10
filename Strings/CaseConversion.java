/**
WAP to convert case.

Basis Characters are seperated from different case by 32. 
**/



//to lower 
String toLower(String upperCase) {
	
	if(upperCase == null || upperCase.equals(""))
		throw new IllegalArgumentException();
	
	chars[] chars = upperCase.tocharArray();
	
	StringBuilder lower = new StringBuilder();
	for(char c : chars){

		//if its an uppercase alphabet
		if( c >= 65 && c <= 90)
			lower.append((c+32))
		else 
			lower.append(c);
	}
}
}


//to upper
String toUpper(String lowerCase) {
	
	if(lowerCase == null || lowerCase.equals(""))
		throw new IllegalArgumentException();
	
	chars[] chars = lowerCase.tocharArray();
	
	StringBuilder upper = new StringBuilder();
	for(char c : chars){

		//if its an lowecase alphabet
		if( c >= 97 && c <= 123)
			upper.append((c-32))
		else 
			upper.append(c);
}
}
