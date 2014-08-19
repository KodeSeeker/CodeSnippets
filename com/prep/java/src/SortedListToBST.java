
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

public Node sortedListToBST(Node h,int start,int end)
{
 int mid= (start +(end-start))/2;
 
 TreeNode left=sortedListToBST(start,mid-1);
 TreeNode root=h.val;
 h=h.next;// only difference between array and linked list!
  TreeNode right=sortedListToBST(mid+1,end);
 //set the left and right
 root.setLeft(left);
 root.setRight(right);
 
 return root;
 
}