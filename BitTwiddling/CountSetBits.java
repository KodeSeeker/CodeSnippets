private int countSetBits(int num){

	if(num == 0)
		return 0;
	int count;
	while(num>0)
	{	// check if the last(rightmost) bit of num is 1. If yes, append count
		if(num &1 ==1)
			count++;
		num=num>>1;// shift right. to tackle next rightmost digit.
	}
	
	return count;// total number of set bits in the binary representation of num.
}

