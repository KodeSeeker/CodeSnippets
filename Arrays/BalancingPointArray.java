/**
Given an array find the balancing point in the array

ie. the point where the sum on higher indices = sum of the lower indices
WHILE EXCLUDING THE CURRENT INDICE.

Trivial approach:O(n2). for every index compute leftSum and right sum, print the index where theyare equal.


Simpler approach O(n) without extra memory
1. Pre compute  Sum  by adding value from  each indice
2. Run through each element again - Subtract current value from sum, to get the right sum at current indice.
				  - if the sum is equal to the left sum then return indice.
				  - add current element to the leftSum. 
3. If the array has no balance point return -1. 
**/

static int balancePoint(int[] arr) {

        //validate arr.

        int leftSum=0,sum=0;
        for(int i=0; i<arr.length;i++) {
                sum+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
        	sum-=arr[i];
        	
        	//check if there is a match.
        if(leftSum ==sum)
        	return i;
        leftSum+=arr[i];
        }

        return -1;
}
