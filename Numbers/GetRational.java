public static String GetRational(double a)
 {  	//.125
	boolean isNegative;
	if(a<0){// if a is negative then set flag
		isNegative=true;
		a=-a;
	}
	int tenPoly=1;
// compute the largest power of 10 that divides 'a' completely
	while(a*tenPoly-(int)(a*tenPoly)!=0)
		tenPoly*=10;

// compute the dividend and the divisor
	int dividend= a*tenPoly;
	int divisor=tenPoly;
	int gcd;
	if(dividend>divisor)
		gcd= GCD(dividend,divisor)
	else
		gcd=GCD(divisor,dividend);
// make the dividend and divisor pretty
	dividend/=gcd;
	divisor/=gcd;
	String output=dividend+"/"+divisor;
	if(isNegative)
		output="-"+output;
	return (" the rational number is "+output);
}
	
	
	//defined as private method for supporting method only, define as public for out of class invokation
	//let's assume a>=b
	private static int GCD(int a, int b)
	{
	 if( a==0 || b==0)
		return a+b;
	 return (b, a%b);
	}

