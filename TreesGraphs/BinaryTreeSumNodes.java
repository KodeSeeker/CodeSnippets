/**
Find the sum of all the nodes in a binary tree.

Simple Recursive approach. Extension of pre-order traversal
**/

public int sumBinaryTree(Node root)
{
	if(root==null)
	{
		return 0;
	}
	// need to handle the left case and right case separately.
	int leftSum= sumBinaryTree(root.getLeft());
	int rightSum=sumBinaryTree(root.getRight());
	
	return root.data+leftSum+rightSum;
}

