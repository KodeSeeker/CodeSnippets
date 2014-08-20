/**
Sort a Linked List.
Approach : take the head as a parameter and find the middle of the linked list.
	Recursively sort each half and then merge.

**/
public class LinkedList
{
	public static Node a,b;
	public static Node mid;
	
	public static void  SortLinkedList(Node head)
	{
		if(head ==null ||head.next ==null )//base case
			return ;
		Node mid = SplitinHalf(head);
		Node a =head;
		// Splitin Half should copy head into a mid node and a start node.
		//Recursively call above function 
		SortLinkedList(a);
		SortLinkedList(mid);
		//Merge the sortedLists
		return mergeSortedLists(a,mid);
	}	

	public static Node SplitinHalf(Node head)
	{
		if (head==null)
			return null;
		Node fast= head;
		Node slow=head;
		while(fast.getNext()!=null)
		{
			fast=fast.getNext().getNext();
			slow=slow.getNext();
		}

		//slow is the mid pointer

		return slow;
	}

//Sorted Merge- to merge the function. 



	public Node mergeSortedLists(Node a , Node b)
	{
		Node result=null;
		
		if (a ==null)
			return b;
		if (b==null)
			return a;
		if(a.getNext()!=null  && b.getNext()!=null)
		{
			if(a.value < b.value)
			{
				result= a;
				result.next=mergeSortedLists(a.next,b);
			}
			if(b.value<a.value)
			{
				result=b;
				result.next=mergeSortedLists(a,b.next);
			}
		}
		
		return result;
	}			




