/**
Find the sum of all the nodes in a binary tree.

Simple Recursive approach. Extension of pre-order traversal
**/

public int sumBinaryTree(Node root, int sum)
{
	if(root==null)
	{
		return sum;
	}
	// need to handle the left case and right case separately.
	int leftSum= sumBinaryTree(root.getLeft(),sum);
	int rightSum=sumBinaryTree(root.getRight(),sum);
	
	return root.data+leftSum+rightSum;
}

