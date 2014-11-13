/**
Convert a BST to Doubly Linked List.

Approach uses an in order traversal to effectively modify the links as you traverse the tree.
Key point here: we need to update the pointer of the last node to point to head and the head must point
to the last node.

Special case if tree has only one element then the corresponding list will have only one element that points to itself
**/
/** Assumption there is  a Node object that represents a LL node and BST Node**/


public static Node head=null;
public static Node prev=null;// static` to track the head and prev element.
public void convertBSTToDLL(Node root)
{
	convertBSTToDLL(root,head, prev);
}

public void convertBSTToDLL(Node n, Node head,Node prev)
{
	if(n==null)
		return;
	convertBSTToDLL(n.getLeft(),head, prev);
	prev=n.getLeft();
	if(prev==null)
		head=n;
	else
		prev.right=n;
	Node r =n.getRight();
	
	head.left=n;
	n.right=head;
	prev=n;
	convertBSTToDLL(r,prev,head);
	
}
