/***
Given a list of numbers, find the consecutive sequence of
  numbers whose sums equal to a target number

Source : http://www.glassdoor.com/Interview/Given-a-list-of-numbers-find-the-consecutive-sequence-of-numbers-whose-sums-equal-to-a-target-number-QTN_864647.htm

Trivial O(n^2) approach- Move two pointers, start and end repeatedly checking for target within a subsequence. If sum > target drop elements from left else if
less than  add elements from right. 
**/


int[] findConsecutiveSeqAddUptoNum(int[] arr, int target) {

	if( target == null || arr == null )
		throw new IllegalArgumentException();

	int start=0;
	int sum =0,end =0;

	while( start <end  && start < arr.length) {

		
		// add elements in the start-end range and check if they are eq to target
		for( int i=start; i <=end; i++) {
			sum+=arr[i];
		
		}
		
		if(sum == target){ // return array in range start,end
			break;
		}

		if(sum > target) { //drop elements from left.
			start++;
		}
		
		else if (sum < target){ // add elements on right
			end++;
		}
	
	}

	if( start >end ) // no seq found
		return new int[0];
		
	int[] ret = new int[end - start+1];

	for(int i = start; i<= end;i++) {
		ret[i] = arr[i];

	}

	return ret;

}

