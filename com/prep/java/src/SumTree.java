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
*/

boolean isLeaf(Node node)
{
  if(n==null|| (n.getLeft()== null && n.getRight()== null))
  {
    return true;
    
  }
  return false;
}
public boolean isSumTree(Node root)
{
 
 if(root == null)
    return true;
 if(isLeaf(root))
  return true;
 Node left = root.getLeft();
 Node right= root.getRight();
 int sum=0;
 if(left!=null)
 {
   sum+= left.data;
   if(!isLeaf(left))
      sum+=left.data;
   
 }
 if(right!=null)
 {
   sum+= right.data;
   if(!isLeaf(right))
      sum+=right.data;
   
 }
 if(root.data != sum)
  return false;
 if(!isSumTree(root.getLeft()) || !isSumTree(root.getRight()))
  return false;
 return true;  
  
}
