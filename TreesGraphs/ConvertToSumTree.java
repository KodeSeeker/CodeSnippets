/**
Given a Binary Tree where each node has positive and negative values.
 Convert this to a tree where each node 

contains the sum of the left and right sub trees in the original tree. The values of leaf nodes are changed to 0.
Return the value of root node when done
**/
/***
 Recursive approach .

If leaf return 0.
**/


int toSumTree(Node root) {

	if(root ==null)
		return 0;
	//store old root. 
	int old_root_value= root.value;

	root.data= toSumTree(root.left) +toSumTree(root.right);
	
	return root.data+old_root_value;

}

