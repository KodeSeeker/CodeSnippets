/*
http://d2o58evtke57tz.cloudfront.net/wp-content/uploads/dist.png
 
 The key is that the distance between any 2 nodes in a binary tree 
 is given by 

  Dist(n1,n2)= Dist(root,n1)+Dist(root,n2)- Dist(root,LCA)
  LCA= lowest common ancestor, 

  Note: Only for BST : the LCA algorithm works in O( log n)
  but the overall algo runs in O(n)

  */
  
  //helper function to get distance from root to node
  
 public int getDistanceFromRoot(Node root, int value, int level)
 {
   if(root== null)
    return 0;
  if(root.data == value)
   { 
    return level;
   }
 int downlevel;
 
 downlevel=getDistanceFromRoot(root.getLeft(),value,level+1);
 if(downlevel!=0)// we hit our value while going down left!
  return downlevel;
 downlevel=getDistanceFromRoot(root.getRight(),value,level+1);
 
 return downlevel;
 }
  
  public int getDist(Node root, int value1, int value2)
  {
    Node LCA= getLCA(root,value1,value2); // LCA of binary tree. Should know this!
    int rootToLCA= getDistFromRoot(Node root,LCA.value,0);
    int distNode1=getDistFromRoot(root,value1,0);
    int distNode2=getDistFromRoot(root,value2,0);
    
    return (distNode1+distNode2- (2*rootToLCA));
  
}
public Node LCA( Node root, int value1, int value2)//value 1 and value2 should be in the array.
{
	if (root.value == value1 || root.value ==value2)
		return root;
	Node left = LCA (root.getLeft(),value1, value2);
	Node right= LCA(root.getRight(),value1,value2);)
	if (left ! =null && right !=null)	
		return root; // value 1 and value 2 are on either side.
	if(left	==null)
		return right;// left is null look at right.
	if(right==null)
		return left;// right is null look at left.
}
