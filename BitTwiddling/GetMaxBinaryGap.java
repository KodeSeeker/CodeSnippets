	public static void main(String... args){
		
		//System.out.println(getRightMostSetBit(10));
		System.out.println(getmaxBinaryGap(9));
		System.out.println(getmaxBinaryGap(4));
		System.out.println(getmaxBinaryGap(13));
		
	}
	
	static int getmaxBinaryGap(int n){
		
		if (n==0)
			return 0;
		int count =-1;
		int maxCount=0;
		while(n>0) {
			
			int rightMostBit= n&1;
			if(rightMostBit ==0 &&count >=0)
				count++;
			if(rightMostBit==1)
				count =0;
			n>>=1;
			maxCount= Math.max(maxCount, count);
		}
		
		return maxCount;
	}
