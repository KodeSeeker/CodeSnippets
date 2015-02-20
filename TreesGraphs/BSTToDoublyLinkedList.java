/**
Recursively convert BST to Doubly LinkedList . 
**/

// The head is stored in an array of size one head[] .  Because values in arrays are pass by reference. 
// head[0] has the head of the linked list. 
public void BSTToDoublyLinkedList(Node root, Node prev, Node[] head) {

	// base case. 
	if(root == null)
		return;
	//recurse left. 
	BSTToDoublyLinkedList(root.getLeft(),prev, head);
	
	// if prev is null. Then we have the root. 

	if (prev == null)
		head[0]= root; 

	//assign right and left pointers.
	else {
		root.setLeft(prev);
		prev.setRight(root);
	}
	
	//recurse right. 
	BSTToDoublyLinkedList(root.getRight(),prev,head);
}
