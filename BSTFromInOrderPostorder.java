/**
 Given in-order and pre-order traversal of a binary search tree, build the binary search tree.

**/

//returns the node of the bst

//post Index =postOrder.length-1;

public Node (int[] postOrder,int[] inOrder,int postIndex,int startIn,  int endIn)
{
	if(startIn>endIn)
		return null;

	if(postOrder==null &&  inOrder==null)
		return null;
	if(postOrder==null ||  inOrder==null)
		throw new IllegalArgumentException();

	int idx = search(postOrder[postIndex],inOrder,startIn,endIn);//searches for the element in in order.
	Node root= new Node ((postOrder[postIndex]);
	postIndex--;
	
	//create the left and right subtrees recursively.
	
	root.setLeft(postOrder,inOrder,preIndex,startIn,idx-1);
	root.setRight(postOrder,inOrder,preIndex,idx+1,endIn);
	
	return root;
}


private int search(int target,int[] arr,int start, int end)
{
	for(int i=start;i<=end;i++)
	{
		if(arr[i]==target)
			return i;
	}
}




	
