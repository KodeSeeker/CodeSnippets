

public String convertToRoman(int num)
{
	if(num==null|| num<0)
		throw new IllegalArgumentException();

	if(num ==0)
		return "0";

	StringBuilder roman= new StringBuilder();
	if(num>0)
	{
		while (num >=1000)	
		{
			roman.append("M");
			num-=1000;
		}
		while(num>=900)
		{
			roman.append("CM");
			num-=900;
		}
		while(num>=500)
		{
			roman.append("D");
			num-=500;
		}
		while(num>=400)
		{
			roman.append("CD");
			num-=400;
		}
		while(num>=100)
		{
			roman.append("C");
			num-=100;
		}
		while(num>=90)
		{
			roman.append("XC");
			num-=90;
		}
		while(num>=50)
		{
			roman.append("L");	
			num-=50;
		}
		while(num>=40)
		{
			roman.append("XL");
			num-=40;
		}
		while(num>=10)
		{
			roman.append("X");
			num-=10;
		}
		while(num>=9)
		{
			roman.append("IX");
			num-=9;
		}
		while(num>=5)
		{
			roman.append("V");
			num-=5;
		}
		while(num>=4)
		{
			roman.append("IV");
			num-=4;
		}
		while(num>=1 && num<=3)
		{
			roman.append("I");
			num-=1;
		}
		
	return roman.toString();

}


