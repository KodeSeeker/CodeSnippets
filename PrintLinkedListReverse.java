/**
Given a singly linked list print it in reverse.
-- Key is to NOT reverse the list but to print it in reverse.
**/

// Off the bat approach . Use a stack. Push  the node one by one onto a stack and when your done. Pop one by one.

//Without using extra memory explicitly, we can use recursion.

public void printReverse(Node head)
{
	//Base case.
	if(head ==null)
		return;
	//recursive call.
	printReverse(head.next);
	System.out.print(head.data+"->");//prints the last node first.
}

