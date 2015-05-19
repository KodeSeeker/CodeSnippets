/**
 Given an array-based heap on n elements and a real number x, efficiently determine whether the kth smallest element in the heap is greater than or equal to x.
 Your algorithm should be O(k) in the worst-case, independent of the size of the heap.

 Hint: you do not have to find the kth smallest element; you need only determine its relationship to x.

**/

/**
 Key point here: DO NOT apply extractMin k times to find the kth smallest element and perform the check. This leads 
to O(k logn) complexity as the heap will rebalance each time you do extractMin.
**/

/**
Approach: Modified version of heapRebalance procedure. Inspect the heap as its in the form of an array. 
 
Assume there are functions getLeftChild, getRightChild which will get the left and rightChildren of an index.

**/


boolean KthSmallVsX(int[] heap, int idx,int k, int count, int X) {

	if(count>k || idx >heap.length) // if we ever see more than k elements or if there is overflow
 		return false;
	if(count == k && heap[idx]>X)// if we ever get to the Kth element and it happens to be > X. return true.
		return true;
	// else count current node 
	count++;
	
	//check recursively 
	return KthSmallVsX(heap, getLeftChild(idx),k,count, X) || KthSmallVsX(heap,getRightChild(idx),k,count,X);

}



int getLeftChild(int i) {

	return 2*i+1;
}

int getRightChild(int i) {

	return 2*i+2;
}

 			
