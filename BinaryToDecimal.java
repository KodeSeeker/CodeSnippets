/**
Convert a binary string based input into a decimal output.
Key here : 
 101011 =1*2^5 + 0*2^4 + 1*2^3 + 0*2^2 + 1*2^1 + 1*2^0

**/

public int binaryToDecimal( String binary)
{

	if (binary == null)
		return -1;
	if (binary.equals("0"))
		return 0;
	int decimal;
	for(int i =0;i<binary.length();i++)
	{
		if(binary.charAt(i)=='0')
			continue;
		decimal+=Math.pow(2 ,(int)binary.charAt(i));
	}

	return decimal;	
	
}

