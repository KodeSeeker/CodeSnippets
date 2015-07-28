/**
Count the parity of a givenn num =>
1001=>2
1101=>3

*/

/**
Naive O(n) algorithm
**/

public int parity (int n ) {

	//validate n
	int count =0;
	while(n>0) {

		if(n & 1 ==1)
			count++;
		n>>=1;
	}

	return count;
}

/**
Better O(k) algorithm, where k is the number of set bits in the number
n=n&(n-1); -- clears the last set bit of n and sets the resulting value to n
**/


int parity (int n) {
	
	int count =0;
	while(n>0){
		count++;
		n&=(n-1);
	}

return count;
}



