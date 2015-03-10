/**
Clone a linked list with a next pointer and an arbitary pointer.

Several approaches.
1) Use map  to track node and nodeClone and perform two iterations on the input list, first to set the next pointer and the next to set the arbitary pointer.
O(n) time and O(n) space. 
2) Also, one could clone th elist in 3 iterations  by modifying the original list's next to point to clone and iterate through the list and point clone's arb to point to the org.  next, then get the clone's to point to their actual next by doing an iteration. Final iteration to get the clone's arbitary pointers to point to the right arbitary pointers.
O(n) time.

App 1:
**/



Node cloneLL(Node head) {
	
	if(head == null)
		return null;
	if(head.next ==null) {
		Node newHead = new Node(head);
		return newHead;
	}
	

	Map<Node,Node> map = new HashMap<Node,Node>();
	
	Node newHead = new Node (head.data);
	newHead.next = head.next;
	
	map.put(head,newHead);

	Node tmp = head;
	
	tmp = tmp.next;//advance head pointer.

	//copy over nodes and their next pointers.
	while( tmp !=null) {
		
		Node n = new Node (tmp.data);
		n.next = tmp.next;
		map.put(tmp,n);
		
		tmp=tmp.next;
	}

	//set the arbitary pointers for the clones. 
	
	Node tmp2= head;
	while (tmp2!=null) {

		Node n = map.get(tmp2);
		n.arb = tmp2.arb;
		
		tmp2= tmp2.next;
	}

	return newHead;	
}

			
	
