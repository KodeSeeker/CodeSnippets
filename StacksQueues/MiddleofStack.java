
public class DLLNode
{
    int a;
    DLLNode next;
    DLLNext prev;
    int count;
}


public void push (Integer a)
{
    if(a==null)
        throw new IllegalArgumentException();
     DLLNode n= new DLLNode(a);
     
     if(head!=null)
         head.prev=n;
     head.count++;
     
     //now update mid
     //Two cases
     //head.count=1.
     // count is odd.
     
     if(head.count ==1)
     {
         mid=head;
     }
     else 
     {
         if (head.count%2!=0)
         {
              mid =mid.prev;
         }
     }
     
     
     //update to the new head
     
     head=n;
}

public int pop()
{
    if(head==null)
        throw new Exception("Underflow");
    DLLNode n= head;
    
    head= head.next;
    head.prev=null;
    head.count--;
    
    if(head.count %2==0)
    {
        mid=mid.next;
        
    }
    
    
    return n.data;
    
}



public int getMid()
{

    if(mid!=null)
        return mid.data;
     return -1;
}
