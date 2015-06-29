/**
Sort a Linked List.
Approach : take the head as a parameter and find the middle of the linked list.
	Recursively sort each half and then merge.

**/
public class LinkedList
{
	public static Node a,b;
	public static Node mid;
	static Node result;
	
	public static void  SortLinkedList(Node head){
	
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

	public static Node SplitinHalf(Node head){
		if (head==null)
			return null;
		Node fast= head;
		Node slow=head;
		while(fast.getNext()!=null){
			fast=fast.getNext().getNext();
			slow=slow.getNext();
		}
		//slow is the mid pointer
		return slow;
	}

//Sorted Merge- to merge the function. 

	public Node mergeSortedLists(Node a , Node b){

		if (a ==null)
			return b;
		if (b==null)
			return a;
		
		Node c = new Node();
		while( a!=null && b!=null) {

			if(a.data <=b.data){
				c.data= a.data;
				a=a.next;
			}
			else if (b.data<a.data) {
				c.data=b.data;	
				b= b.next;
			}
		c= c.next;//advance c
		}
		
		while(a.next()!=null)
			c.next=a.next;
		while(b.next!=null)
			c.next=b.next;
		return c;
	}			



}
