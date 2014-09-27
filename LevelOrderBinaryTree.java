/**
Perform the level order traversal of a binary tree
http://geeksforgeeks.org/wp-content/uploads/2009/06/tree122.gif returns 1,2,3,4,5.
Algo :
1. Print node data and push to queue.
2. Keep track 
**/

public void LevelOrderBTree (Node root)
{

	if (root  == null)
		return;
	Queue <Node> q= new LinkedList<Node> ();
	int nodesCurrentLevel=1;
	int nodesNextLevel;
	q.add(root);
	while( !q.isEmpty())
	{
		if(nodesCurrentLevel>0)
		{
			Node curr= q.remove();
			System.out.print (curr.value +" ");
			nodesCurrentLevel--;
		        if(curr.getLeft()!=null)
				{ 
					q.add(curr.getLeft();
					nodesNextLevel++;
				}
			if(curr.getRight()!=null)
                                { 
                                        q.add(curr.getRight();
                                        nodesNextLevel++;
                                }
		}
		
		if(nodesCurrentLevel==0)
		{
			nodesNextCurrentLevel=nodesNextLevel;
			nodesNextLevel=0;
			System.out.println();
		}
	}

}
