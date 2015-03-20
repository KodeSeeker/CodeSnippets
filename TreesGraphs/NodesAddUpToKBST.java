:/**
Given a BST and a value K , check if two nodes that add up to K
Algo:
**/

boolean findTwoNodesThatSumUptoK(Node root,int k) {

	if(k<0)
		throw new IllegalArgumentException();
	if(root ==null)
		return false;

	 // take the max value and the min value and check if 
	// its equal to k. If sum > k. Reduce it by moving max to its inorder_predecessor.
	// if sum< k. Increase it by moving min to its inorder successor.
	
	int min = getMin(root);// the left most node
	int max = getMax(root); // the right most node.
	
	
	while(root!=null ||max!=-1 ||min!=-1){
		int sum =min+max;	
		
		if(sum == k)
			return true;
		if(sum>k){
			root= get_InOrderPredecessor(root,max);
			 max =(root !=null? root.data:-1);
		}
		if(sum <k){
			root= get_InOrderSuccessor(root, min);
			min=root.data;
		}
	}
	
	return false;
}



/**
Get Min 

*/
//returns the left most node value in BST.
 int getMin(Node root) {

	 while(root.getLeft()!=null) {
		root=root.getLeft();
	}
	return root;
}

/**
Get MAX.
**/

//returns the max element from the BST.

public int getMax(Node root) {
	
	while(root.getRight()!=null) {
		root=root.getRight();
	}
	return root;
}



/**
In order successor
**/

 public Node get_InOrderSuccessor(Node root, Node value) {

	Node succ;
	if(value.getRight()!=null)
	{
		//smallest element on the right side.
		succ = getMin(value.getRight());
	
	}


 	else
	{
		root=root.getLeft();
		//need to search for succ from root.
		
		while(root!=null)
		{
			if(root.data< value.data)
				root=root.getRight();
			else if(root.data>value.data)// root could be a succ
			{
				succ=root;
				root=root.getLeft();
			}
			else
				break; // found value without finding succ- so no succ!

		}
	}
	
	return succ;
}



public Node get_InOrderPredecessor(Node root, Node value)
{
	Node pred;
	// largest on left side if it exists.
	if(value.getLeft()!=null)
	{
		pred=getMax(value.getLeft());
	}
	
	else
	{// search for value from root. Updating pred
		while(root!=null)
		{
			if(root.data>value.data)
				root.root.getLeft();
			else if (root.data<value.data)// root possibly a predecessor.
			{
				pred=root;
				root=root.getRight();
			}
			else
				break;
		}
	}
	
	return pred;
}

			
	
