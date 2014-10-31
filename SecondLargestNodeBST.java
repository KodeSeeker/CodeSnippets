
/**
Find the second largest node in a Binary Search Tree.

Key : Primary feel is to keep track of the parent while finding the largest element in a BST.
However, if the parent has a left subtree, then the second largest element is the largest in the left subtree.

**/

public Node secondLargest(Node root)
{
	if(root==null)
		return null;
	
	// keep the parent and search for the largest
	Node parent= root;
	while(root.getRight()!=null)
	{
		parent=root;
		root=root.getRight();
		
	}
	//does parent have a left child?
	parent.getLeft()==null?return parent: return getlargest(parent.getLeft());
}


public Node getLargest(Node n)
{
	while(n.getRight()!=null)
		n=n.getRight();

	return n;
}






