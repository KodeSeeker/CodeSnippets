


/**
Find the intersection of two sorted arrays. 

Trivial approach : Use a hashset, and place element from each array into the set. Eliminate duplicates.O(n) extra memory .

Better approach : Modified merge.  Move pointer with lower value forward. 

**/

int[] intersect(int[] a, int[] b) {

	if( a== null || b == null)
		throw new IllegalArgumentException();

	int i=0, j=0;
	
	int len= Math.min(a.length,b.length);// intersection as big as the smallest. 
	int k =0;

	int[] intersect = new int[len];
	while(i<len && j<len) {
		
			if(a[i]<b[j]){
				i++;
				continue;
			}
			if(b[j]<a[i]) {

				j++;
				continue;
			}
			else{//a[i] == b[j]
				intersect[k++]= a[i];
				i++;
				j++;
			}
	}


	return intersect;
}



		 
	


