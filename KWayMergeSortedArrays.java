/**
Perform a Kway merge for K sorted arrays and return a sorted array. 

**/

class Entry {

	int data;
	int arrNum;
	int  arrIndex;

	public Entry(int data, int arrNum, int arrIndex){
		this.data=data;
		this.arrNum=arrNum;
		this.arrIndex=arrIndex;
	}
}


int[] KWayMerge(int[] [] arr){

	
	/** Approach could be to either use ONE mega min heap for the merge or use a min heap of size k  
	    Usage of size k min heap is more efficient , but the array from which the minHeap top was retreived needs to be stored. 

	**/

	if( arr == null )
		return null; 

	int K = arr.length;

	//minHeap sorts on the basis of entry data. 
	PriorityQueue<Entry> minHeap = new PriorityQueue<Entry>(K,new Comparator<Entry>{

		public int compare(Entry e1,Entry e2){

			return e1.data- e2.data;
			
		}
		} );	
	
	int[] out = new int[arr.length * arr[0].length];
	

	//populate min Heap with initial entries from each array.
	for (int i=0;i<arr.length;i++) {
	
		Entry curr = new Entry(arr[i][0],i,0);
		minHeap.add(curr);
	}
	

	int ptr=0;
	//empty out minHeap will replacing the content from the respective array.
	while(!minHeap.isEmpty()) {
	
		Entry cand = minHeap.poll();
		
		out[ptr++]= cand.data;
		
		//get the next entry!
			
	
		//if arrIndex points to the last index in arrNum-> Then we dont need to pick the next element from this particular array.
		//otherwise we need to pick the element pointed to by arrIndex+1 in arrNum and create the corresponding entry. 

		if(cand.arrIndex == arr[cand.arrNum].length-1)
			continue;//pick next element from min heap 

		else {
			Entry  newCand= new Entry( arr[cand.arrNum][cand.arrIndex+1],arrNum,arrIndex+1);
			minHeap.add(newCand);
		}
	}
	return out;
}
