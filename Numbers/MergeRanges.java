/**
Given an array of ranges, please merge the overlapping ones.
 For example, four ranges [5, 13], [27, 39], [8, 19], [31, 37] 
(in blue in  Figure1) are merged into two ranges, which are [5, 19] and [27, 39] (in green in Figure 1).
**/

/**
Input : List of arrays. 
Output: List of arrays with merged range
**/



public List<Integer[]> mergeRange(List<Integer[]> input)
{

// key  to merger is to sort by the 

	if(input ==null)
		return null;
//sort the input List based on the first element.
	Collections.sort(input,new Comparator<Integer[]>()
		{
			public int compare(Integer[] a, Integer[] b)
			{
				//sort based on the first element.
				if(a[0] ==b[0])
					return 0;
				if(a[0]<b[0)
					return 1;
				else
					return -1;
			}
		}

	// Merge ranges. Use a container to keep track of the ranges- Stack
	
	Stack<Integer[]> st= new Stack<Integer[]>();
	
	for(Integer[] i: input)
	{
		if(st.isEmpty())
			st.push(i);
		else 
		{
			Integer[] top = st.peek();
			if(isOverlap(top,i))// there is an overlap between these ranges
			{
				//so merge them.
				Integer[] merged= mergeArrayRanges(top,i));
				st.pop();
				st.push(merged);
			}
			else
				//push the array range into the stack
				st.push(i);
		}
	}


//helper function
// check overlap between any two ranges
public static boolean isOverlap(Integer[] a, Integer[] b)
{
	if(a==null && b==null)
		return true;
	if ((a[0] >b[0] && a[0]<b[b.length-1]) ||(b[0]> a[0] &&b[0] <a[a.length-1]))
		return true;
	
	//else- false;
	return false;
}

//given two array ranges. Merge and return array of mergeed ranges
public static Integer[] mergeArrayRanges(Integer[] a, Integer[] b)
{
	if(a==null && b==null)
		return null;
	 if (a==null)
		return b;
	if(b==null)
		return a;
	
	//find the new array start and stop.
	int start= Math.min(a[0],b[0]);
	int end =Math.max(a[a.length-1],b[b.length-1]);
	int size= end-start+1;
	Integer[] mergedArr= new Integer[size];

	for(int i=0;i<=size;i++)
	{
		mergedArr[i]=start;
		start++;// possible because the numbers are continous values from start to end.
	}
	
	return mergedArr;
}

	


 
