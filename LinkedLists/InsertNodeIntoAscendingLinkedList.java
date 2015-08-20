public void add(Node aNode, int x)
{
    //buggy.
    
    /*
    Three cases. 
    1) NULL list. 
    2)One element list.
    3) N element list. 
    */
    if(aNode==null)
    {
        Node n= new Node(x);
        n.next=n;// self pointer.
        return;
    }
    else
    {
        Node nxt= aNode.next;
        while(nxt!=aNode)
        {
            
            if (nxt==null)
                {
                    Node z= new Node (x);
                    z.next= aNode;
                    aNode.next=z;
                    return;
                }
            else if(x > aNode.data && x < nxt.Data)
            {
                Node z= new Node(x);
                z.next= nxt;
                aNode.next=z;
                return;
            }
        nxt=nxt.next;
        }
        // if it reaches here, we have cycled through and quite possibly the node is before aNode.
        Node z= new Node(x);
        z.next=aNode;
    
        
        
    }
    
    
    
    if(itemNode < head) //assume head is the first node in linkedlist
    {
        Node<E>temp = head;
        head = itemNode;
        itemNode.next = temp
        return;
    }

    Node<E> current = head;
    while(current.next != null)
    {
        if(itemNode < current.next.data)
        {
            temp = current.next;
            current.next = itemNode;
            itemNode.next = temp;
            return;
        }
    current = current.next
    }
    //append at the end
    current.next = itemNode;

}