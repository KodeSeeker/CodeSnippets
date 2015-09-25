//returns the right most set bit 

	static int getRightMostSetBit(int n){
		
		return n &(~(n-1));
	}
	
