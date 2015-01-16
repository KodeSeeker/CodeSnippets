/**
Similar to inorder traversal. Stores the head and changes the pointers as you traverse the tree.

The key here is that since java variables are pass by value we use an array to store the head of the linkedlist
**/


public void convertBTToDLL(Node root)
{
	if(root ==null)
		return;
	Node[] head= new Node[1];
	convertBTToDLL(root, head);

}

public void convertBTToDLL(Node root,Node[] head)
{

	if(root ==null)
		return;

	//go left
	convertBTToDLL(root.getLeft(),head);

	if(prev==null)
	{
	 	head[0]=root; // this code is hit when you look at the leftmost node in the tree.
	}

	else
	{
		root.setLeft(prev);
		prev.setRight(root);
	}
	//update prev
		prev=root;
	
	//go right
	convertBTToDLL(root.getRight(),head);
	


}

