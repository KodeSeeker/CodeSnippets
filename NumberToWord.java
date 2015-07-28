/***
Key approach is to split in batches of 1000 till you reach hundreds. Also every  batch of 1000 needs to be processed as  ahundred. 

**/


 private static final String[] specialNames = {
        "",
        " thousand",
        " million",
        " billion",
        " trillion",
        " quadrillion",
        " quintillion"
    };
    
    private static final String[] tensNames = {
        "",
        " ten",
        " twenty",
        " thirty",
        " fourty",
        " fifty",
        " sixty",
        " seventy",
        " eighty",
        " ninety"
    };
    
    private static final String[] numNames = {
        "",
        " one",
        " two",
        " three",
        " four",
        " five",
        " six",
        " seven",
        " eight",
        " nine",
        " ten",
        " eleven",
        " twelve",
        " thirteen",
        " fourteen",
        " fifteen",
        " sixteen",
        " seventeen",
        " eighteen",
        " nineteen"
    };




String convert(int num) {

	if(num ==0 )
		return "zero";
	String prefix = "";
	//handle negative case
	if(num <0) {
		num =-num;
		prefix ="Negative";
	}
	int place =0;
	StringBuilder current = new StringBuilder();
	
	do {
		//process in groups of 3 . 
		int n = number%1000;

		if(n!=0) {
			String hundredPart = convertLessThanThousand(n);
			current = hundredPart + specialNames[place] + current;
		}
		place++;
		number/=1000;
	}while (n >0);
	
	
	return (prefix + current);
}



String convertLessThanThousand( int num) {

	//check for tens place less than 20. Special case. Handle unit's and ten's together here ! 
	String current;
	if(num %100 <20) {
		current = numNames[num %100];
		num /=100;
	}
	// rest of them 
	else {
		//units place
		if(num %10 >0) {
			current = numNames[num %10];
			num /=10;
		}
		// ten's place 
		if( num %10 >0) {
			current = tenNames[num %10] +current;
			num /=10;
		}
		
		if( num ==0) return current;
		
		//  else handle 100's place
		return numNames[num] + " hundred " +current;
	}
}
