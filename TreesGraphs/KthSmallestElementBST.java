/*
Basic Algo: In order traversal (Iterative)

Go left to the smallest element. 
Then keep popping and reducing k, 
Ifk ==0
 popped node is the kthsmallest node.
else
{
if node has a right child. Copy its left subtree completely to the stack!
}

  

Point where k==0, the node returned will be kth smallest element

NOTE: Algo same for kth largest Element, invert left and right.

*/
public Node findKthSmallestElement(Node root, int k)
{
  
  // Stack to hold the traversal.
  
  Stack <Node> stk= new Stack<Node>();
  
  // go left bruh
  while(root!=null)
  {
    stk.push(root);
    root=root.getLeft();
  }
  
  while (!stk.isEmpty())
  {
    Node kthSmall=stk.pop();
    if(k==0)
    {
      //k=0
      break;
    }
    k--;
    // do we have a right child for this node?
    if(kthSmall.getRight()!=null)
    {
       //copy its entire left subtree to stack
       kthSmall = kthSmall.getRight();
       while(kthSmall.getLeft()!=null)
       {
         stk.push(kthSmall);
         kthSmall=kthSmall.getLeft();
         
       }
    }
    
  }
  
  return kthSmall;
 }

// Kth Smallest element BST. Simplified Approach.
public void  findKthSmallestElementBST(Node root)
{
	
	if(root == null)
		return;
	Node curr= root;
	Stack<Node> st = new Stack<Node>():
	st.push(curr);
	while((curr !=null)|| !(st.isEmpty())
	{
		if(curr!=null)
		{
			//keep going left.
			st.push(curr);
			curr= curr.getLeft();
		}
		
		else
		{
			
			curr= st.pop();
			if(k==0)
				System.out.print(" Kth largest node is "+curr.data);
			k--;
			
			curr= curr.getRight();
		}
	}
}

