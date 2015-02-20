/***
Delete a node from a BST.
Approach : Use bst search plus 3 case strategy.

**/


boolean deleteANodeBST(Node root, Node target, Node parent) { // parent is initially null.

	if(root ==null && target ==null)
		return true;
	if(root ==null)
		return false; //empty root does not have target to delete.
	
	if( target <root) {
		//target is on left side
		return deleteANodeBST(root.left, target,root);// parent is root from subsequent call.
	}

	else if (target > root) {
		
		return deleteANodeBST(root.right,target,root);
	}
	
	if ( target == root) {
		
//3  cases
	//case 1 : No kids
		if (root .getLeft() ==null && root.getRight() ==null)
		{
			root =null;
			return true;
		}
	//case 2 :one kid only
		if(root.getRight()! =null)//  has only  right kid.
		{
			parent.getRight()==root? parent.right = root.getRight(): parent.left = root.getRight();// if root is on right side of parent then assign right side of parent to root
			return true;											//s right child else left child of parent to root's right child .
		}
			
		  if(root.getLeft()! =null)//  has only  left kid.
                {
                        parent.getRight()==root? parent.right = root.getLeft(): parent.left = root.getLeft();// if root is on right side of parent then assign right side of parent to root
                        return true;                                                                                        //s right child else left child of parent to root's right child .
                }

	//case 3 : both kids
		else {
			root= new Node(getMaxFromLeftSideAndDelete(root.getLeft()));
			return true;
		}
	}

}


int  getMaxFromLeftAndDelete(Node root) {
		int  maxVal = root;
		while(root.getRight()! = null) {
			maxVal =root;
			root=root.getRight();
		}
	//set root to null to delete it 
	root =null;
	return maxVal;
}
	
		
	
