/*
         ___30______
      /              \
    __20__          __40__
   /      \        /      \
  10      25      35      50
 /  \       \            /
 5  15      28          41

Output 30, 20, 10, 5, 15, 28, 35, 41, 50, 40.

Approach :
Depth first search:
Pattern : Root, then left and then right in backwards fashion.

Key point:
If a node is a left outer node then its left child is also a left outer node.


If a node is a right outer node then its right child is also a right outer node.

Left nodes: Pre order traversal printing only left nodes.
Right nodes: Post order traversal(to reverse order of nodes) And print only the right nodes.

*/


public void printOuterNodes(Node root)// wrapper
{
  if (root==null)
    return;
  printLeftNodes(root.getLeft(),true);
  printRightNodes(root.getRight(),true);
}

public void printLeftNodes(Node n,boolean print)// print variable decides whether the node is to be printed
{
  //Pre-rder traversal
  if(n==null)
    return;
  if(print || (root.getLeft()==null && root.getRight()==null ))// if node has no kids print.(for lower level)
  {
    Sysout.print(root.data + " ");
  }
  printLeftNodes(n.getLeft(),print);// the left kid of  a left child should be printed
  printLeftNodes(n.getRight(),false); //* check followup
}

public void printRightNodes(Node n, boolean print)
{
  if(n==null)
    return;
    
  //post order traversal
  printRightNodes(n.getRight(),print);// right kid of a right child will be printed.
  printRightNodes(n.getLeft(),false);
  if(print || (n.getLeft()==null && n.getRight()==null))
  {
    Sysout.print (n.data+" ");
  }
}
/*
What happens when there is only one child , like
        __28_______________
  /                                \
  4____                        ____69
       \                      /
      __8__                __56__
     /     \              /      \
   __7     12__        __34    __27__
  /            \      /       /      \
  5_          _13    _2      _3      39
    \        /      /       /
     6      11     10       9


In above case :8,7,5 will not be printed as it is the right child of a left node.
So algo will need to be modified.
the left kid of  a left child should be printed but iff there is no left kid then print the right kid.
the right kid of  a right child should be printed but iff there is no right kid then print the left kid
*/
.
public void printLeftNodes(Node n,boolean print)// print variable decides whether the node is to be printed
{
  //Pre-rder traversal
  if(n==null)
    return;
  if(print || (root.getLeft()==null && root.getRight()==null ))// if node has no kids print.(for lower level)
  {
    Sysout.print(root.data + " ");
  }
  printLeftNodes(n.getLeft(),print);// the left kid of  a left child should be printed
  printLeftNodes(n.getRight(),print&&n.getLeft()== null?true:false); // if there is no left kid and only a right kid is present
}

public void printRightNodes(Node n, boolean print)
{
  if(n==null)
    return;
    
  //post order traversal
  printRightNodes(n.getRight(),print);// right kid of a right child will be printed.
  printRightNodes(n.getLeft(),print && (n.getRight()==null?true:false));// if the right kid is empty and there is a left kid is present 
  if(print || (n.getLeft()==null && n.getRight()==null))
  {
    Sysout.print (n.data+" ");
  }
}