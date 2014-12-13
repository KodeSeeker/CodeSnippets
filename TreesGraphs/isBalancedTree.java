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

