/**
http://stackoverflow.com/questions/12463118/in-order-successor-of-a-binary-tree
Simple in order traversal. While keeping track of the prev node and current node. When prev becomes the targetnode. Current node is the succ.

**/

public static Node prev=null;

public static void printInOrderSucc(Node root, Node n)
{
	if(root==null)
		return;
	printInOrderSucc(root.getLeft(),n)
	if(prev==n)// previous has become the target.
		System.out.print(root.data);
	prev=root;//update prev as you proceed.
	printInOrderSucc(root.getRight(),n);
}
`
	
