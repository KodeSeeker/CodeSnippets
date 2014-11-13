/*
Given a binary tree which is a sum tree (child nodes add to parent), write an algorithm to determine whether the tree is a valid sum tree
*/


public boolean verifySumTree(Node root)
{
	if(root==null|| (root.getLeft()==null && root.getRight()==null))
		return true;
	if(root.data!=root.getLeft().data + root.getRight().data)
		return false;
		// implies root= sum of its children at this point. Need to check children.	
	return(verifySumTree(root.getLeft()) && verifySumTree(root.getRight()));
}

