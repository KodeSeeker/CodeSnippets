
/***
Validate whether a given tree is a binary search tree.
O(N) time complexity -- every node evaluated atleast once!
**/


//initial call validateBST(root,INTEGER.MAX_VALUE,INTEGER.MIN_VALUE).
boolean validateBST( Node root, int min, int max) {

	//null tree is a BST!

	if(root == null)
		return true;

	return (root >min && root <max) && validateBST(root.getLeft(),min,root.data) 
			&& validateBST(root.getRight(),root.data,max);
}
