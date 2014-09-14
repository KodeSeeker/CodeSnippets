public static TreeNode inorderSucc(Node n) { 
  if (n != null) { 
    Node p; 
    if (n.parent == null || n.right != null) { // if n is the root element, and has a right child.
       p = leftMostChild(e.right); //  the succesor is the leftmost child of the right child of 'n'
    } else
    { 
    // n is not the root.
    /*
     Get the parent of n, p. If the left child of p ==n, then p is the successor.
     Else, make n=p, and check till the parent, p.left==n. At this point the value of p will be the 
     successor of the original node.
     */
           while ((p = e.parent) != null) { 
              if (p.left == n) {
                 break; 
                }
               n = p; 
            }   
    } 
  return p; //successor
  } 
    return null; 
} 

 public static TreeNode leftMostChild(Node e) {
    if (e == null) return null;
    while (e.left != null) 
       e = e.left; // keep going left
    return e; 
 }

/**
Without using parent pointers.
**/
public static Node InOrderSucc(Node root, Node n)
{
	// if n has a right subtree. then the succ is the smallest in the right subtree
	if(n.getRight!=null)
	{
		return minVal(n.getRight);
	}
	
	//else repetitively search the left subtree for the smallest value larger than the node.
	
	else
	{
		Node succ;
		while(root!=null)
		{
			if(n.data <root.data)
			{
		 		succ=root;
				root=root.getLeft;
			}
			else if (n.data > root.data)
			{
				root=root.getRight;
			}
			else
				break;
		}
		
		return succ;
	}
}
	

