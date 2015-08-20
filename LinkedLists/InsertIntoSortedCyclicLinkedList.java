/**
Given a pointer to a random node in a sorted cyclic linked list and a value. Insert the value into the sorted cyclic linked list.
Key Point: The Node that is passed to you is not necessarily the minimum node
**/


public void insertCyclicLinkedList(Node a, int x)
{
	//base case - check if a is null.
	if(a==null)
	{
		//single node CLL
		Node tmp= new Node (x);
		tmp.next=tmp;
		return tmp;
	}
	
// handle the other cases. By keeping track of the prev node's value as well.

	Node prev=null;
	Node tmp=a;
	while(tmp!=prev)
	{
		prev=tmp;
		tmp=tmp.next;
		
		//case 1- x>prev and x<tmp
		if(x>prev.data && x<tmp.data)
			break;
	

		//case 2.- x is largest or smallest value
		if((prev.data>tmp.data && (x<tmp.data  && x>prev.data))) 
			break;
	}
	
	Node  newNode= new Node(x);
	prev.next=newNode;
	newNode.next=a;
}
		
