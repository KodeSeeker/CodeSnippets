/**
Add two numbers in the form a linked list. 
First List: 5->6->3  // represents number 563
  Second List: 8->4->2 //  represents number 842
Output
  Resultant list: 1->4->0->5  // represents number 1405
Geeksfor geeks:
http://www.geeksforgeeks.org/sum-of-two-linked-lists/

This  approach involving persisting the carry as a global. This value may mess up in multi threaded access.
Simpler approach: Reverse both lists and add them from the front. 


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
			
			Node tmpSum=addLinkedListNumbersSameSize(tmp,head2,0,result);
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


public Node  addUsingReverse(Node head1, Node head2 )
{
	if(head1==null && head2 ==null)
		return null;
	if(head1==null)
		return head2;
	if(head2==null)
		return head1;

	int len1= getLength(head1);
 	int len2= getLength(head2);
	int maxLen= Math.max(len1,len2;

	//Pad zero to the the one with smaller length.
	//make head1 the smaller one always .
	if(len2<len1)
	{
	Node tmp = head1;
	head1=head2;
	head2=tmp;
	}
	//Pad zero to head1
	int count=0;
	Node temp= head1;
	while(head1.next!=null)
	{
	 head=head.next;
	 count++;
	}
	while(count<maxLen)
	{
		Node n = new Node (0);
		head1.next=n;
	}
	//head1 is padded with zeros.
	//and both are of the same length.
	
	Node rev1= reverse(temp);
	Node rev2=reverse(head2);
	Node result;
	int sum=0;
	int carry=0;
	while(rev1!=null && rev2!=null)
	{
		sum=rev1.data+rev2.data+carry
		carry=sum/10;
		sum%=10;
		result.data=sum;
		rev1=rev1.next;
		rev2=rev2.next;
		result=result.next;
	}
	
	//check for any left over carry.

	if (carry==1)
	{
	 result. next =new Node(1);
	}


	return reverse(result);
}
