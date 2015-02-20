/**
Check if  a given binary number is a palindrome or not . 
9(1001) is bit palindrome but 6(110) is not a bit palindrome.
One way would be to parse the number to base 2 and then convert to string and do simple string palindrome check.

Cleaner approach is to reverse the number in binary and check if its the same as the original number.

**/
boolean checkPalindrome(int num) {

	if(num ==0)
		return true;
	int aux=num
	int  reverse=0;

	while(aux>0){
		
		//reverse num by checking each bit of aux.
		//rev is moved to the left as well each time so that it gets filled from right to left as aux's last bit is inspected.
		reverse= (reverse << 1 ) | (aux & 1);

		aux = aux >>1;//right  shift aux.
	}

	//when control reaches here reverse will be reversed version of num
	return (num == reverse);

}
