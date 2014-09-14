/**
Populate the next pointer (pointing to the next right node in a binary tree) for all nodes in a binary tree.
Assume that each node  has a next pointer in addition to a left and right pointer.
**/

/** Approach : Use a reverse in order traversal . Go extreme right and set the right node and move leftward setting the next node.
**/

public static void populateNextNode (Node root)
{

	public node nxt= null;
	
	if(p!=null)
	{
		populateNextNode(root.getRight());// keep going right recursively.
		root.next= nxt;// next pointer of the right most node will be null.
		nxt=root;
		populateNextNode(root.getLeft());
	}
	
}
		
		
