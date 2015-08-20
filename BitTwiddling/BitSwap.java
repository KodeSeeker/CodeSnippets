/**
Swap the ith and jth bits in a given number

e.g. 10110 (i=1,j=3) =>11100
**/

int swapBits(int num, int i, int j) {
	
	//validate num,i,j
	
	//swap the bits at i and j IFF they are different.
	
	if(((num >>i)&1) != ((num >>j) &1)){
	//they are diff.
	num ^= (1<<i) |(1<<j); //toggle the bits at the ith and jth position.
	}
	
	return num;
}

