
/**
Reverse a Linked list recursively. <==Best approach==>
**/

public Node reverseLLRecursively(Node head)
{

	// the reverse of an empty list?==> empty list.
	if(head == null)
		return null;
	//reverse of a single element list ==> the element.
	if(head.next ==null)
		return head ;
	Node secondElem= head.next;
	head.next=null;// to prevent a cycle.

	Node reverse= reverse(secondElem);
	secondElem.next=head;//connect secondElem to the head.
	
	return reverse;

}
