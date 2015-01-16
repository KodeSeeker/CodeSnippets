/*Write a function that returns true if the given Binary Tree is SumTree else false. 
A SumTree is a Binary Tree where the value of a node is equal to sum of the nodes present in its left subtree and right subtree.
An empty tree is SumTree and sum of an empty tree can be considered as 0. A leaf node is also considered as SumTree. 
Following is an example of SumTree.


            26
          /   \
         10    3 
       /    \    \
      4     6     3 

Algo:
Two approaches:
1)Check recursively for each node if the node value = sum of left and right.
 O(n)
 
 int sum(struct node *root)
{
   if(root == NULL)
     return 0;
   return sum(root->left) + root->data + sum(root->right);
}
 
int isSumTree(struct node* node)
{
    int ls, rs;
    if(node == NULL ||
            (node->left == NULL && node->right == NULL))
        return 1;
 
   ls = sum(node->left);
   rs = sum(node->right);
 
    if((node->data == ls + rs)&&
            isSumTree(node->left) &&
            isSumTree(node->right))
        return 1;
 
   return 0;
}
2) Use the fact that
if the tree is a sum tree then:
 
 if (node (leaf))
   return true;
 for a given node:
 if right child : leaf
 left child : leaf
  root .data = left.data+right. data
if right child: non- leaf
  left-child : non- leaf
   root.data=  2* right+ 2*left;

if right child:  leaf
  left-child : non- leaf
   root.data=   right+ 2*left;
if right child: non- leaf
  left-child :  leaf
   root.data=  2* right+ left;
LOGIC :


Right child  : non-leaf
Left child   : non-leaf
  root->data==2*root->left->data + 2*root->right->data.

Right child  : leaf
Left child   : leaf 
 root->data==root->left->data + root->right->data.

Right child  : leaf
Left child   : non-leaf
 root->data==2*root->left->data + root->right->data.

Right child  : non-leaf
Left child   : leaf
 root->data==root->left->data + 2*root->right->data.

*/

boolean isLeaf(Node node)
{
  if (node.getLeft()== null && node.getRight()== null)
  {
    return true;
    
  }
  return false;
}


static boolean isSumTree(Node root)
{
	if(root ==null || isLeaf(root))
		return true;
	int leftSum=0;
	int rightSum=0;
	//handle left child
	if(root.getLeft()!=null)
	{
	 leftSum=root.getLeft().data;
	
		if(!isLeaf(root.getLeft()))// double leftsum;
			leftSum*=2;
	}
	
	//handle right child
	if(root.getRight()!=null)
	{
		rightSum=root.getRight().data;
		
		if(!isLeaf(root.getRight()))//double rightsum;
			rightSum*=2;
	}

	return ( (root.data== leftSum+rightSum) &&(isSumTree(root.getRight()) && isSumTree(root.getLeft())));
}
