/**

Direct extension of Level order traversal.

Perform level order traversal. When target node is found and nodesAtACurrentLevel =1 . Print that node. 
**/


public void RightMostCousinBinaryTree(Node root, Node target) {

	if(root ==null && target ==null)
		return;
	if(root ==null || target ==null)
		throw new IllegalArgumentException();

	Queue<Node> queue = new LinkedList<Node>();
	queue.add(root);
	int nodesAtCurrentLevel =1;
	int nodesAtNextLevel;
	boolean targetLevel =false;

	while(!queue.isEmpty()) {

		if(nodesAtCurrentLevel>0) {
			Node current= queue.remove();
			nodesAtCurrentLevel--;
			if(current == target) {
				targetLevel =true;
			}
		//edge case: Node is right most cousin of itself
		if(nodesAtCurrentLevel ==0 && targetLevel) {
		System.out.print("Right most cousin" +current.data);
		targetLevel=false;
		return;
		}
		//end edge case		
		if(nodesAtCurrentLevel == 1 && targetLevel) { // the content of the queue at this point will be the right most cousin
			System.out.print(" The right most cousin is " queue.peek().data);
			targetLevel=false;
			return;
		}
			
			if(current.left!=null) {
				queue.add(current.left);
				nodesAtNextLevel++;
			}
			
			if(current.right!=null) {
                                queue.add(current.right);
                                nodesAtNextLevel++;
                        }
  		}
		
		if(nodesAtCurrentLevel ==0) {
			nodesAtCurrentLevel = nodesAtNextLevel;
			nodesAtNextLevel =0;
			}
	}
}
