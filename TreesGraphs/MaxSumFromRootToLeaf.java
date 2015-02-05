/**
		  10
               /      \
	     -2        7
           /   \     
	 8     -4 .

Should return 17.
**
Simple recursion. Go bottom up and add check max of left and right
at each step and add to root as you pass it up.
**/
    
public int maxFromRootToLeaf(Node root) {

	if(root ==null)
		return 0;
	int leftSumAtNode = maxFromRootToLeaf(root.getLeft());
	int rightSumAtNode = maxFromRootToLeaf(root.getRight());
	
	return root.data+ Math.max(leftSumAtNode,rightSumAtNode);
}

	

}
