
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
	//connect secondElem to the head.. 
	//prior to this step all the elements are disjoint. this step connects the element to its next ie. its head
	secondElem.next=head;
	
	return reverse;

}


