/**
Find the diameter of a binary tree.

http://www.geeksforgeeks.org/diameter-of-a-binary-tree/
e.g.http://geeksforgeeks.org/wp-content/uploads/tree_diameter.GIF
Approach
The diameter of a tree (sometimes called the width) is the number of nodes on the longest path between two leaves in the tree. 

So the diameter can be recursively defined recursively as the largest amongst
the diameter(left Subtree), diameter(rightSubtree), diamter passing through the root.

**/

public int diameter(Node root)
{
	if(root==null)
		return 0;
	int leftDiameter= diameter(root.getLeft());
	int rightDiameter=diameter(root.getRight());
	//calculate diameter through root.
	int leftHeight= getHeight(root.getLeft());
	int rightHeight=getHeight(root.getRight());
	

	return Math.max(leftHeight+rightHeight+1,Math.max(leftDiameter,rightDiameter));
}

public int getHeight(Node n)
{
	if(n==null)
		return 0;
	return 1+Math.max(getHeight(root.getRight(),root.getLeft());
}

