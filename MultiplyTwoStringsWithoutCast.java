


/**
Multiply two numbers presented as strings. Use of casting is not allowed!

One Approach : Convert each character to number equivalent and then multiply.


***/

int multiplyStrings(String num1, String num2) {

	if( num1 == null || num2 == null || num1.length() == 0 || num2.length() ==0)
		throw new IllegalArgumentException();
	
	int numA= getNum(num1);
	int numB = getNum(num2);

	
	return numA*numB;
}


int getNum(String n) {

	int num=0;
	while(n.length()>0) {

		int val = (n.charAt(0)-'0');
		if(val<0 || val>9)
			throw new IllegalArgumentException("String contains non-digit  characters!!");
		num = num*10 + val;
		n = n.substring(1);
	}
	
	return num;// returns the int eqvt of n
}

