/**
Given the binary Tree and the two nodes say ‘a’ and ‘b’, determine whether the two nodes are cousins of each other or not.
     6
   /   \
  3     5
 / \   / \
7   8 1   3
Say two node be 7 and 1, result is TRUE.
Say two nodes are 3 and 5, result is FALSE.
Say two nodes are 7 and 5, result is FALSE.

**/

/**
Algo: 
1) Two nodes are said to be cousins if they are at the same height and dont have the same parent(ie. are not siblings)

**/

public boolean isCousin( Node root, Node a ,Node b)
{
	if( root ==null && (a==null && b==null ))
		return true;
	 return (getHeight(root, a)==getHeight(root,b)  && !isSibling(root,a,b));

}

// helper function. 
// recursively checks if a and b are siblings.

public boolean isSibling(Node root, Node a, Node b)
{
	if(root == null)
		return false; // root is null only when entire tree has been inspected and still no sibling !
	return((root.getLeft().data==a.data &&root.getRight().data==b.data)|| (root.getRight().data==a.data && root.getLeft().data==b.data) 
										|| isSibling(root.getRight(),a,b) || isSibling(root.getLeft(),a,b));
}


public int getHeight(Node root, Node n)
{
	if(root ==null && n!=null)
		return -1;
	return getDist(root, n,0);
}

public int getDist(Node root, Node n, int height)
{
	if(root ==null)
		return 0;
	if(root,equals(n))
		return height;
	int nodeDepth=getDist(root.getLeft(),n,height++);
	if(nodeDepth!=0)
		return nodeDepth;
	nodeDepth=getDist(root.getRight(),n,height++);
	return nodeDepth;
}
	
