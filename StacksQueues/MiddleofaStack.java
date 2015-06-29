/**
Find the middle of a stack in constant time. 

Insight: To use a doubly linked list to simulate a stack. Move the mid pointer up/down based on elements being pushed /popped from the stack.
Push.
1 mid 1

2->1 mid 1

3->2->1 mid 2.

4->3->2->1 mid 2.


Pop

4-3-2-1 mid 2

3-2-1 mid 2

2-1 mid 1

1 mid 1


Key - update references of prev and next correctly so that mid can move up/down.
**/

public class Node{

	Node prev;
	Node next;
	int data;
	
	public Node(int data){
		this.data = data;
	}

}

class StackWithMin{
		Node head;
		Node mid;
		static int count;
		public void push( int a) {
			
			if( a == null)
				return;
			Node newNode= new Node(a);
			count++;
			// the prev of the node inserted is always null initially.
			newNode.prev =null;
			//case first node.
			if(head ==null)	{
				head = newNode;
				mid = head;
				return;
			}
			//otherwise.
			else {
				head.prev = newNode;
				newNode.next = head;
				if(count%2!=0)
					mid= mid.prev;
			}
			
			//update the new head.
			head = newNode;
		}



		public int  pop() {
		
			if(head == null|| count<=0)
				throw new IllegalStateException("Underflow Stack");
			
			int ret = head.data;
			//decrement count.
			count --;
			// move head to next.
			head = head.next;
			//prev of new head is set to null.
			if(head != null)
				head.prev= null;
			// even. then move mid down. 
			if(count%2 ==0)
				mid = mid.next;

			return ret;
		}


		int getMid() {
			
			if(head == null || count <=0)
				return -1;
			return mid;
		}

}
