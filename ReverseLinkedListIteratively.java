/**

Walk through the linked list, noting head, prev and next at each point. Update relevant pointers and list should be reversed
in place.
**/

public void reverseIteratively(Node head)
{
	if(head ==null) // an empty list returns empty.
		return;

	Node prev,next;// used to hold pointers for previous and next node in the list as we traverse the list.
	
	while (true) //walk along the list to preform reversals.
	{
		next = head.next; 
		head.next = prev;//reverse the pointer.
		prev = head;//update prev
		if(next ==null)
			return;// reversal complete.
		head=next;
	}
	
}

