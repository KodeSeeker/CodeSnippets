//pass the left child and right child of root to the method/

//isSymmetric(root.getLeft(),root.getRight())l

public boolean isSymmetric(Node root) {
	
	if(root ==null) {
		return true;
	}
	return isSymmetric(root.getLeft(), root.getRight());
}


public boolean isSymmetric( Node left, Node right){
  if (left==null || right ==null)
    return (left==null) && (right ==null);// single node only-base case true
  return (left.data == right.data) && isSymmetric (left.getLeft(), right.getRight()) && isSymmetric(left.getRight(),right.getLeft());
}
