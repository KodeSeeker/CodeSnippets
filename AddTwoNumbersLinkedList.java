/**
Add two numbers in the form a linked list. 
First List: 5->6->3  // represents number 563
  Second List: 8->4->2 //  represents number 842
Output
  Resultant list: 1->4->0->5  // represents number 1405
Geeksfor geeks:
http://www.geeksforgeeks.org/sum-of-two-linked-lists/

**/



public class AddLists
{
	public Node AddTwoLists(Node head1, Node head2)
	{
		

		//if either one is null, return the other.
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		//simple idea.
		// IF the lists are the same length, then they can ve recursively added.
		int length1= getLength(head1);
		int length2= getLength(head2);
		
		if(len1==len2)
			{	Node result;
				result= addLinkedListNumbersSameSize(head1,head2,0,result);
				return result;
			}
	
		else
		{
			if(len1<len2)
				// swap the two lists.
			{
				Node tmp = head1;
				head1=head2;
				head2=tmp;
			}
			int diff= getLengthDiff(head1,head2);
			//move the head of the larger list diff places.			
			Node tmp =head1;
			while(diff>=0)
			{
				tmp= tmp.next;
			}
			//now both the lists are the same size.
			
			Node tmpSum=addLinkedListNumbersSameSize(tmp,head2);
			//carry, class variable.
			if(carry==0)
				return tmpSum;
			else
				return addCarryToRemaining(carry,head1,tmpSum);
		}
	}
	




public Node addLinkedListNumbersSameSize(Node head1,Node head2,int carry)
{
	if(head1==null|| head2==null)
		return null;

	result.next= addLinkedListNumbersSameSize(head1.next, head2.next,carry);
	
	int sum = head1.data+head2.data+carry;
	carry= sum/10;
	result.data=sum%10;
	return result;
}


public Node addCarryToRemaining(int carry, Node head1, Node tmpSum)
{
	int sum;
	if(head.next!=tmpSum)
		{
			addCarryToRemaining(carry, head1.next,tmpSum);
			int sum = carry+head1.data;
			carry=sum%10;
			sum/=10;
			result.data=sum;
			result=result.next;//advance the head of the result
		}

	return result;
}


}
