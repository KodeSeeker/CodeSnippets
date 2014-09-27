/**
Given a BST and a value K , check if two nodes that add up to K
Algo:
**/

public boolean findTwoNodesThatSumUptoK(Node root,int k)
{

	if(k<0)
		return;
	if(root ==null)
		return;

	 // take the max value and the min value and check if 
	// its equal to k. If sum > k. Reduce it by moving max to its inorder_predecessor.
	// if sum< k. Increase it by moving min to its inorder successor.
	
	int min = getMin(root);// the left most node
	int max = getMax(root); // the right most node.
	
	sum= min+max;
	while(root!=null ||max!=-1 ||min!=-1)
	{
		if(sum == k)
			return true;
		if(sum>k)
		{
			root= get_InOrderPredecessor(root,max);
			 max =(root !=null? root.data:-1);
		}
		if(sum <k)
		{
			root= get_InOrderSuccessor(root, max);
			min=root.data;
		}
	}
	
	return false;
}

/**
In order successor
**/

