/**
Check if  a given binary number is a palindrome or not . 
9(1001) is bit palindrome but 6(110) is not a bit palindrome.
One way would be to parse the number to base 2 and then convert to string and do simple string palindrome check.

Cleaner approach is to reverse the number in binary and check if its the same as the original number.

**/


//Helper to reverse a number to its binary 

private int reverse (int num){
	
	if(num ==0)
		return 0;
	
	int rev=0;
	
	while(num>0) {	
		rev<<=1;
		rev|=(num &1);
		num>>=1;
	}

 return rev;
	
}

boolean isPalindrome(int num){
	
	return (num == reverse(num));
}

