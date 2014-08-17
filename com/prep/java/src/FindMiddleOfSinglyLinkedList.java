
// Advance p2 by two pointers and p1 by one pointer. The value of p1 when p2, hits the end will be the value of the 
//middle of the linked list.

public ReturnMidNode(){
Node p1,p2;
	while ( p2.next != null ) {
  		  p2 = p2.next;
    		if (p2.next != null) {
        		p2 = p2.next;
        		p1 = p1.next;
    		}
    
   		 return p1;
	}
}