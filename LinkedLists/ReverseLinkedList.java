public Node reverse(Node previous, Node current) {
    if(previous == null)
        return null;
    if(previous.equals(head))
        previous.setNext(null);
    if(current == null) {    // end of list
        head = previous;
        return head;
    } else {
        Node temp = current.getNext();
        current.setNext(previous);
        reverse(current, temp);
    }
    return null;    //should never reach here.
} 

//Function Call 
reverse(head, head.getNext());