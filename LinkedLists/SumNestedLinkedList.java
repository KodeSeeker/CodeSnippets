/**
Write a program that takes a nested linked list and returns the sum of each node on the linked list weighted by depth.
**/
//caller will be weightedSum(in,0,0); 
public int weightedSum(List<Node> in, int depth,int sum)
{
	if(in==null)
		return 0;//base case.
	//iterate through the linked list.
	for(int i=0;i<in.size();i++)
	{
		if(in.get(i) instanceof (List<Node>))// go deeper on this because its a List
		{
			sum+=weightedSum(in.get(i),depth+1,sum);
		}
		else
		{
			sum+=(Integer)in.get(i) *depth;
		}
	}
	return sum;
}	
