/**
Simple but tricky question. 

Mirroe a binary tree. 
Swap the left and right children but do so using post order traversal and create a new node. 
if Null return;
else post order 
and then swap left and right children.

**/


public static void  Mirror(Node root)
{
	if(root ==null)
		return;
	Mirror(root.left);
	Mirror(root.right);

	Node tmp = root.right;
	root.right=root.left;
	root.left=tmp;
}
	
