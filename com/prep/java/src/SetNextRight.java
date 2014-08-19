/*
class Node {
  Node leftChild;
  Node rightChild;
  Node nextRight;
}
Populate the nextRight pointers in each node.

You may assume that it is a full binary tree (ie, each node other than the leaves has two children.)

Key: Recursive solution: Ensure that the nextRight pointer is populated at every level before passing down.
*/

public void setNextRight (Node root)
{
  if(root==null)
    return;
  //set the next right for the root and its children.
  //
  if(root.getLeft()!=null)// set Left childs nextRight pointer
  {
    root.getLeft().setNextRight(root.getRight());
  }
  if(root.getRight()!=null)
  {
    root.getRight.setNextRight(root.getNextRight()==null?null:root.getNextRight().getLeft());// if getNextRight of root exists, then its left child.
    
  }
  
  //recursively set for children
  setNextRight(root.getLeft());
  setNextRight(root.getRight());
}