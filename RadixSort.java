/**

Implemented as count sort for indices.
Intuitive code: http://www.geekviewpoint.com/java/sorting/radixsort
**/

public void radixSort(int[] in)
{
	//sorts in [] in place.
	public static int RADIX=10;// base 10 numbers.
	
	//create an array of buckets to hold elements for each digit.
	List<Integer>[] bucket= new ArrayList<Integer>[RADIX];
	//now initialize each of them
	for(List<Integer> b:bucket)
		b=new ArrayList<Integer>();

	//actual sorting.
	int tmp=-1,// used to calculate index.
	int placement=1;// used to calculate index. starts with 1
	maxLength=false;// flag to indicate the maximum length number has been seen
	while(!maxLength)
	{
		maxLength=true;
		for(Integer i:in)
		{
			tmp=i/placement;
			bucket[tmp%RADIX].add(i);// add i to the corresponding bucket.
			if (maxLength && tmp>0)
				maxLength=false; // we havent reached max length yet so keep repeating
		}
	// place the valuein the right position based on the current placement.
	//NOTE: Position of the element is shifted several times based on the index upon which it is
	//currently being sorted.
		int count=0;//simple var to walk through input
		for(List<Integer> b: bucket)
		{
			for(Integer i:b)
				in[count++]=i;
			//clear each bucket for the next iteration.
			b.clear();
		}
	
		//modify placement to pick up next radix.
		placement*=RADIX;
		
	}
}
 
			
	
