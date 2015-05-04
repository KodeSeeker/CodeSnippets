/**
 Given in-order and pre-order traversal of a binary search tree, build the binary search tree.

**/

//returns the node of the bst

//pre order starts from the front of the btree
public Node buildBST(int[] preOrder,int[] inOrder,int preIndex,int startIn,  int endIn)
{
	if(startIn>endIn)
		return null;

	if(preOrder==null &&  inOrder==null)
		return null;
	if(preOrder==null ||  inOrder==null)
		throw new IllegalArgumentException();

	int idx = search(preOrder[preIndex],inOrder,startIn,endIn);//searches for the element in in order.
	Node root= new Node ((preOrder[preIndex]);
	preIndex++;
	
	//create the left and right subtrees recursively.
	
	root.setLeft(buildBST(preOrder,inOrder,preIndex,startIn,idx-1));
	root.setRight(buildBST(preOrder,inOrder,preIndex,idx+1,endIn));
	
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




	
