/**
Key insight here : we do repetitive subtraction . Instead we can do division and replace num with the remainder at each instance.

**/

public String getRoman(int num)
{

	if(num<0|| num==null)
		throw new IllegalArgumentException();
	StringBuilder roman= new StringBuilder();

	String [] symbol = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	int[] magnitude={1000,900,500,400,100,90,50,40,10,9,5,4,1};
	
	int repeats;//number of times a symbol is repeated.

	for(int count=0;num>0;count++)
	{
		repeats=num/magnitude[count];//for 2015 initially 2.

		for(int i=0;i<repeats;i++)
		{
			roman.append(symbo[count]);
		}
		
		num%=magnitude[count];//2015%1000=15. Update num for next symbol.

	}

	return roman.toString();

} 
		
		
