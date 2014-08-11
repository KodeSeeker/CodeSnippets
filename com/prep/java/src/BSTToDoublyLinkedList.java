/*
http://leetcode.com/2010/11/convert-binary-search-tree-bst-to.html
Idea is to set the pointers as we traverse through the bst using inorder traversal.
ie. set the left to the node we just saw, and right to the next node

Key point: Use Recursion to set the right pointer of the last node to point to the head
and the left pointer of the head to the last node.
*/

public void bstToDoublyLinkedList(Node root, Node prev,Node head)
{
  
  if(p==null)
    return;
    //recursive call  to go left.
    bstToDoublyLinkedList(root.getLeft(),prev,head);
   if  (root.getLeft()!=null)
  {
    root.left=head;
  }
  else
    root=head;// we've seen all the nodes  going left and hit the head, so set the node to head.
  // now to set the  pointer to the head.left and last node.right recursively.
  
  Node right= root.right// hold ccurrent right
  head.left=root;// head left to root, 
  root.right=head;// update root right to head
  
  prev=root;// update prev
  bstToDoublyLinkedList(right,prev, head)
  
}
  
  
  
public void bstToDoublyLinkedList(Node root)// wrapper!
{
  Node prev=null;
  Node head=null;
  bstToDoublyLinkedList(root,prev,head)
}
}
  
