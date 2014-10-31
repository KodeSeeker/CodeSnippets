/**
* Given a nested list of integers, returns
  the sum of all integers in the list weighted by their depth * For example, given the list {{1,1},2,{1,1}} the function should return 10 (four 1's at depth 2, one 2 at depth 1) * Given the list {1,{4,{6}}} the function should return 27 (one 1 at depth 1, one 4 at depth 2, and one 6 at depth 3
**/


public void  weightedSum(Node head, int sum,int depth)
{
	if(head==null)
		return 0;

	for(int i=0;i<head.size();i++)
	{
		if (head.get(i) instanceOf(List))// its a list
		{
			weightedSum(head,sum,depth+1);
		}
		
		else// its a number
		{
			sum+=head.get(i)*depth;
		}
	}

}

//sum has the final sum!!


