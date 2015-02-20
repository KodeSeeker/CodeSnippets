/**
Lowest Common Ancestor Binary Tree.
Leet code approach.
**/


public Node LCABTree(Node root, Node a, Node b) {

	if(root ==null) {
		return null;
	}
	
	if(root == a || root == b) {
		return root;
	}
		
	Node left = LCABTree(root.getLeft(), a, b);
	Node right = LCABTree(root.getRight(), a, b );

	return (left ==null?right: left);
}

