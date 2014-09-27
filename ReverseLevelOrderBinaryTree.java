/**
Perform the reverse level order traversal of a binary tree
http://geeksforgeeks.org/wp-content/uploads/2009/06/tree122.gif returns 4,5,2,3,1.
Algo :
1.  push to queue.
2. Keep track of left and right using nodes in next level.
3. Key here : is to push to stack instead  of printing. Also push right first to queue instead of left so that the order is reversed when its moved to a stack.

**/

public void LevelOrderBTree (Node root)
{

	if (root  == null)
		return;
	Queue <Node> q= new LinkedList<Node> ();
	int nodesCurrentLevel=1;
	int nodesNextLevel;
	Stack<Node> st= new Stack<Node>();
	q.add(root);
	while( !q.isEmpty())
	{
		if(nodesCurrentLevel>0)
		{
			Node curr= q.remove();
			st.push(curr);
			nodesCurrentLevel--;
		        if(curr.getRight()!=null)
				{ 
					q.add(curr.getRight());
					nodesNextLevel++;
				}
			if(curr.getLeft()!=null)
                                { 
                                        q.add(curr.getLeft());
                                        nodesNextLevel++;
                                }
		}
		
		if(nodesCurrentLevel==0)
		{
			nodesNextCurrentLevel=nodesNextLevel;
			nodesNextLevel=0;
		}
	}

	// print out from stack

	while(!st.isEmpty())
		{
			System.out.print (st.pop + " ");
	

		}
}
	
