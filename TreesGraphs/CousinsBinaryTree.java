/**
Find all the nodes at a level of a given node's level
    15
     /  \ 
    18   19
   / \   / \
  2   3  4  5
 /\  /  /\
1 6  7  8 9

Input: k=6
Output: 1,7,8,9

Approach : Modified Level order search with variable to keep track of the current level.
**/


void printAllCousins( Node root, Node target) {

	if(root ==null)
		return;

	Queue <Node> queue = new LinkedList<Node>();
	
	
	//process the root first.
	if(root == target) {
		System.out.print(root.data);
		return;
	}
	 
	queue.add(root);
	int nodesAtCurrentLevel =1;
	int nodesAtNextLevel =0;
	boolean targetFound =false;
	boolean targetLevel = false;
	while(!queue.isEmpty()) {
		
		if(nodesAtCurrentLevel >0){
			Node curr = queue.remove();
			
			if(targetLevel)// we are at target's level so print node.
				System.out.print(curr.data);
			nodesAtCurrentLevel --;
			if(curr.getLeft()!= null) {
				queue.add(curr.getLeft());
				nodesAtNextLevel++;
			
				if(curr.getLeft() == target)
					targetFoundAtNextLevel =true;
			
			}
			
			if(curr.getRight()!= null) {
                                queue.add(curr.getRight());
                                nodesAtNextLevel++;

                                if(curr.getRight() == target)
                                        targetFoundAtNextLevel =true;

                        }
		}
		
		
		if(nodesAtCurrentLevel == 0) {
				nodesAtCurrentLevel = nodesAtNextLevel;
				nodesAtNextLevel =0;
			
				if(targetLevel)
					targetLevel =false; // to avoid printing lower levels.
				
				//else if target is there in the next level. 
				if(targetFoundAtNextLevel){
					targetLevel =true;
					targetFoundAtNextLevel= false;// to prevent multiple levels from printing. 
				}
		}
	}	

}

					
