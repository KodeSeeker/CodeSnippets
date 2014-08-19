


public void alternateTraverse(Node root1, Node root2) {
    	if (root1 != null && root2 != null) {
    		alternateTraverse(root1.left, root2.left);
    		System.out.println("Tree1: " + root1.data);
    		System.out.println("Tree2: " + root2.data);
    		alternateTraverse(root1.right, root2.right);
    	}
    }