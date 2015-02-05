/**
Given an unsorted array of integers, find the length of the longest consecutive elements sequence.

For example, given [100, 4, 200, 1, 3, 2], the longest consecutive elements sequence should be [1, 2, 3, 4]. Its length is 4.
**/


public int longestSequence(int[] arr) {


Map<Integer,Integer> intervals = new HashMap<Integer,Integer>();// represents a contiguous interval of values.

Set<Integer> seenValues= new HashSet<Integer>();// set to eliminate duplicates.


for(Integer i :arr)	{

 if (seen.contains(i))
	continue; //skip any values that have been already seen,
 int hi=i;
 int lo=i;
//coalesce existing intervals based on whether values around i already exist. 

	 if(intervals.containsKey(i+1))
	 {
		hi= intervals.remove(i+1);
	 }
	 if(intervals.containsKey(i-1))
	{
		lo= intervals.remove(i-1);
	}
	intervals.put(lo,hi);
	intervals.put(hi,lo); //we put both hi and lo as keys and values so that they can be picked by both ifs.

}

//iterate the intervals.
int hi=0,lo=0;
for(Map.Entry<Integer,Integer> pair : intervals.entrySet())
{
	if((hi-lo)< (pair.getKey()-pair.getValue()))
	{
		hi=pair.getKey();
		lo=pair.getValue();
	}
}


return hi-lo+1;
}
