
/*
Bottom Up solution.

Key here is to advance the next pointer after you set the node and its left
O(n) complexity
*/

public Node sortedListToBST(Node head)//wrapper
{
  int len=getLen(head);
  sortedListToBST(head,0,len-1);
  
  
}
// in order traversal approach
public TreeNode sortedListToBST(Node h,int start,int end)
{
 		int mid= (start + end )>>>1;
		TreeNode leftChild = sortedListToBST(h, start,mid-1);
		TreeNode root= new TreeNode(h.data);
		root.left=leftChild;
		h=h.next;// forward to next node-- differs from array here.
		TreeNode rightChild = sortedListToBST(h, mid+1, end);
		root.right=rightChild;			
		return root;	
}
