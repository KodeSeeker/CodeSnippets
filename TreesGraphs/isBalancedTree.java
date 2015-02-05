/**
How to determine if a binary tree is height-balanced?
Conditions : Height difference between left and right trees is at most 1.
Left and right subtrees are also balanced,
O(n^2)
**/

public boolean isBalancedTree(Node root)
{
	if(root ==null)
		return true;
	if(root.getLeft() !=null)
		int left =getHeight(root.getLeft());
	if(root.getRight()!=null)
		int right=getHeight(root.getRight());
	return (Math.abs(left-right)<=1 && isBalancedTree(root.getRight()) && isBalancedTree(root.getLeft()));
}

public int getHeight(Node root)
{
	if(root==null)
		return null;
	1+Math.max(getHeight(root.getRight()),getHeight(root.getLeft()));
}


/*
	 * O(n)
	 * return values: -1 means false, otherwise it represents height
	 *
 Based on the fact that we dont need to calculate height *separately* each time! The diff in height at 
each level can be used to determine if tree is balanced.
*/
public static int isBalanced(TreeNode root){

	
	if(root ==null)
		return 0;
	
	int leftHeight= isBalanced(root.getLeft());
	if(leftHeight == -1)
		return -1;// left side is not balanced. so tree cannot be balanced.

	int rightHeight =isBalanced(root.getRight());
	if(rightHeight ==-1)
		return -1;//right side is not balanced.

	if(Math.abs(leftheight-rightHeight)>1)
		return -1; // tree is unbalanced at this node.

	return Math.max(leftHeight,rightHeight) + 1;// height;
}

