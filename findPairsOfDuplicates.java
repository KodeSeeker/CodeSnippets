/**
Find pairs of elements that are same in an array.
e.g. [0,2,4,2,4,2] should return 4 because there are 4 pairs of duplicates. (1,3) (3,5) (1,5) and (2,4).

Expected Time Complexity: O ( n log n) Space Complexity : O (1).
**/

public class FindPairsofDuplicates
{
/**
Key here : a) Sort the array using in-place heap sort-> space complexity O(1)
b) Using an auxillary array to count the number of occurreneces of an element in the  array.
c) Calculate( Count Choose2)-1, which is the number of duplicate pairs e.g. there are 3 -2's . so 3c2=3 aand 2 4's 2c2=1 . So total of 4.

**/

public static int[] posMap= new int [INTEGER.MAX_VALUE];
public static int[] negMap= new int [INTEGER.MAX_VALUE];

private static PriorityQueue <Integer> minHeap= new PriorityQueue<Integer>();

public static PriorityQueue<Integer> sort(int [] in)
{

	if(in ==null)
	{	
		return null;
	}
	
//	PriorityQueue <Integer> minHeap= new PriorityQueue<Integer>();
	for(Integer i: in)
	{
		minHeap.add(i);
	}

	return minHeap;
}

public static void countFrequency(){

	while(!minHeap.isEmpty())
	{
		Integer p=minHeap.poll();
		if(p<0)
			negMap[p]++;
		else if (p>=0)
			posMap[p]++;
	}

}


public static int NChoose2( int n)
{
	if(n<2)
	return -1;//invalid
	if(n==2)
	return 1;
	else
		return (n *(n-1))/2;
}


