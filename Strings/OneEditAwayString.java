/**
Check if two strings are at most one edit away from each other. 

Intuitive approach : Need to look at each character to see if its different. 

**/

boolean oneEditAway(String one, String two) {

	if(one == null || two == null )
		throw new IllegalArgumentException();
	int oneLen = one.length();
	int twoLen = two.length();

	int diffCount =0;//difference between two strings(initially 0);
	
	if(oneLen > twoLen+1 || twoLen> oneLen+1)
		return false;// they differ more than one character!

	if(oneLen == twoLen+1 || twoLen == oneLen+1)
		diffCount =1;// these strings cant be any more different. 

	int idx =0;
	
	while(idx<Math.min(oneLen,twoLen)){
	
		if(one.charAt(idx) != two.charAt(idx))
			diffCount++;
		idx++;
	}
	
	return (diffCount <=1);// if diffCount > 1 then it doesnt satisfy condition . 

}


 

