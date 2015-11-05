/**
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

For example, given [100, 4, 200, 1, 3, 2], the longest consecutive elements sequence should be [1, 2, 3, 4]. Its length is 4.

Trivial approach : Sort the array and find the longest consecutive seq.

O(n) average time  approach : Trading off time for memory using a set to track elements.


**/




int longestConsecutiveSeq(int[] arr ) {

	if(arr.length ==0)
		return 0;

	Set<Integer> nums = new HashSet<Integer>();

	for(int i: arr){
		nums.add(i);
	}
	int maxCount =-1;

	for(int i :arr) {

		int count =1;// a seq is atleast as big as itself.
		int left =i-1;
		int right =i+1;
		
		while(nums.contains(left) && left >0){
			nums.remove(left);
			count++;
			left--;
		}
	
		while(nums.contains(right)&& right <arr.length-1){
			nums.remove(right);
			count++;
			right++;
		}

	
		if(count>maxCount)
			maxCount=count;
	}

	return maxCount;
}
	 
