// find the square root of a number with sufficient precision.
//O(log N) time. Binary search

 int mySqrt(int x) {
	        
	        //Key insight - 
	        // if a > 1 ; a>sqrt(A).
	        // If 0<a<1.. 0<a<sqrt(A) <1. eg. a= 0.25
	        // since we just want to return the integer part we can simply return 0. 
	        if(x<=0)
	            return x;
	        if(x<1)
	            return 0;
	        int end = x;
	        int start = 0;
	        int ans =0;
	        while (start <= end) {
	            int mid = (start + end) >>>1;// end = 9 . mid = 4. ;end =3
	       // Use bigInt to avoid overflow of midSqr if x and mid end up being too large for int or long!
            BigInteger midi = BigInteger.valueOf(mid);
	        BigInteger midSqr = midi.multiply(midi);
                
	        BigInteger xAsBigInt = BigInteger.valueOf(x);

	            if( midSqr.intValue() == x ) { // perfect square
	                return mid;
	            }
	            if(midSqr.compareTo(xAsBigInt) >0) { //overshot value of x.
	                end = mid -1;
	            }
	            else { //midSqr <x - underestimated value of x
	                start = mid+1;
	                ans = mid;
                 // Store value of mid as the output as best effort value because mid could likely be 
                 //   overwritten to a wrong value by a change in start and end.
                 //Also, we update it in this branch instead of the other branch because we want to round down the value of the root 
                 // if its not a perfect square.
	                
	            }
	        }
	        
	        return ans;
	    }
}
