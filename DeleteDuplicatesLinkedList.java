/***
Write a program to delete duplicates from a linked list. 
Given a sorted linked list, delete all duplicates such that each element appear only once.

Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.
**/

static Node deleteDups(Node head) {

	if(head==null|| head.next ==null)
		return head;

	Node p=head;
	while(p!=null && p.next !=null)
	{
		if(p.data ==p.next.data)
		{
			p.next=p.next.next;
		}
		else
			p=p.next;
	}
	
return head;
}


/**
TO DO 
static Node deleteAllDups(Node head) {
	
	if(head ==null || head.next ==null)
		return head;
	
	Node p = h;
		}
	}

	return head;

