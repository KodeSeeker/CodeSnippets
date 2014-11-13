/**
based off question : http://www.glassdoor.com/Interview/Given-a-Binary-Tree-Assuming-each-node-denotes-some-x-y-coordinate-root-node-denotes-0-0-Write-a-code-to-display-coord-QTN_508270.htm

Approach Preorder traversal of tree setting the  x and y coordinate during the traversal.
**/


//initial call setCoordinates(root,0,0);
public void setCoordinates( Node root, int x,int y)
{
	if(root==null)
		return;
	root.x=x;
	root.y=y;
	setCoordinates(root.getLeft(),x-1,y+1);
	setCoordinates(root.getRight(),x+1,y+1);
}



