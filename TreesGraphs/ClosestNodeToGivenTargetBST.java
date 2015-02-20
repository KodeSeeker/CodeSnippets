/**
Given a BST root and a target value. Find the node closest to the target value in the BST.
**/


 Node getClosestToNode(Node root, int target) {
	
		if(root ==null)
			return null;
		
		//return a new node formed by the min_diff between target and closest node in BST. E.g. if target is 12 and closest node is 15. Min_diff will be 3. 
		int minimum_diff = min_diff(root, target);
		
		return new Node(minimum_diff+ target);
}




int min_diff(Node root, int target) {

	if(root ==null);
		return INTEGER.MAX_VALUE;// kills the corresponding recursive branch!
	
	if(target < root.data)
		return smaller(min_diff(root.getLeft(), target), root.data-target);

	if(target > root.data)
		return smaller(min_diff(root.getRight(),target), root.data - target);

	if(target == root.data)
		return 0; // min_diff is 0!
}


int smaller (int a, int b) {
	Math.abs(a) <Math.abs(b) ?  return a: return b;
}


