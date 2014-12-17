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

//0100= 4 -> 0*2^3+1*2^2+0*2^1+0*2^0
//0101= 5-> 0*2^3+ 1*2^2+0*2^1+1*2^0.
	for(int i =0;i<binary.length();i++)
	{
		if(binary.charAt(i)=='0')
			continue;
		decimal+=Math.pow(2 , str.length()-1-i);
	}

	return decimal;	
	
}
