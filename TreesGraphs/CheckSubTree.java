/**
Given two binary trees, check if the first tree is subtree of the second one. 
A subtree of a tree T is a tree S consisting of a node in T and all of its descendants in T. 
The subtree corresponding to the root node is the entire tree; the subtree corresponding to any other node is called a proper subtree.
**/


boolean checkSubTree( Node source, Node target) {
	
	if(source == null && target == null )// null subtree is subtree of null tree
		return true;

	if(source == null || target ==null) //  either one is null not both. 
		return false;

	if (source.data == target.data) 
		return isIdentical(root,target);


	//check if target exists within right or left subtree of source.

	return checkSubTree(root.getLeft(),target) || checkSubTree(root.getRight(),target);
}

/**
Check node by node if two tree's are identical
**/
boolean isIdentical(Node a,Node b) {

	//base case .
	if ( a == null && b ==null)
		return true;
	
	if( a == null || b ==null)
		return false;

	if(a.data != b.data)
		return false;
	
	//check identical recursively
	return isIdentical(a.getLeft(),b.getLeft()) && isIdentical(a.getRight(),b.getRight());
}

