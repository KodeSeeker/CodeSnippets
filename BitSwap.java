/**
Swap the ith and jth bits in a given number

e.g. 10110 (i=1,j=3) =>11100
**/

int swapBits(int num, int i, int j) {
	
	//validate num,i,j
	
	//swap the bits at i and j IFF they are different.
	
	if(((num >>i)&1) ^ ((num >>j) &1){ 
		//they are diff.
	num ^= (1<<i) |(1<<j); //toggle the bits at the ith and jth position.
	}
	
	return num;
}

/**
Reverse a 64 bit number using bit manipulation
**/

public int reverseNum(int num) {

 //validate num

	for (int i=0;i<16;i++){
		int j=32-i;
		
		if((num>>i) &1) ^(num >>j)&1) {
			num ^=(1<<i)|(1<<j);
		}

	}

	return num;
}
