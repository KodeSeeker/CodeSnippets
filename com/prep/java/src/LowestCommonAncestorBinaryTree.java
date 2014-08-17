/*
 Approach similar to approach for Common ancestor for BST. Keep going down on one side(right or left) if both the nodes
 are in the same side(right or left), else the current node is the lowest common ancestor*/
  
  public Tree commonAncestor(Node  root, Node p, Node q) { 
    // 1st check if p and q, both belong to the left of the current root node, if yes then recurse on the left side
    if (covers(root.left, p) && covers(root.left, q)) // check out the covers subroutine, can be used elsewhere too!
      return commonAncestor(root.left, p, q);
    // else, check if both p and q are children of right side of the root, if yes, then recurse on the right side
    if (covers(root.right, p) && covers(root.right, q)) 
      return commonAncestor(root.right, p, q);
    return root; // lowest Common Ancestor.
  }

  private boolean covers(Node  root, Node p) { /* is p a child of root? */ 
    if (root == null) return false;
    if (root == p) return true;
      return covers(root.left, p) || covers(root.right, p); // recursively check if p is a child of right.
  }
