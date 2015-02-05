/**
Generate
11
21
1211
111221
312211
13112221
1113213211
31131211131221
13211311123113112211
11131221133112132113212221
**/

void lookAndSay(String num) {
	
	if(num==null)
		return null;
	StringBuilder result = new StringBuilder();
	char repeat=num.charAt(0);
	num=num.substring(1);
	
	// add an additional space in the end to ensure that last character change is checked.
	num+= " ";

	int times= 1;
	for(char actual :num.tocharArray())	{
		if(actual !=repeat) {// there is a change.
		result.append(times + "  " + repeat);
		times =1;
		}
		else {
		times++; // increase number of times.
		}
	}

return result.toString();

}


