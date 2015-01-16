/**
http://codereview.stackexchange.com/questions/13255/deleting-a-node-from-a-binary-search-tree
Deleting a node from a BST has 3 specific conditions. Can be combined with search in order to find the node to be deleted.
**/
public class  BST
{


public boolean deleteNodeBST(Node root, int target,Node parent)//initially parent is null
{

    if(root ==null)
        return false;
     //combines search with delete.
    if(root.data==target)
      {
          //if target is a leaf node
          if(root.left==null && root.right==null)
            {// delete the node by assigning it null
                root=null;
                return true;
            }
          //if target has both left and right subtrees.
          if(root.right !=null && root.left!=null)
          {    //find the largest item in the left side OR the smallest item on right side and assign it to targets position
               root=getMaxValueLeftSideAndDelete(root.left);
               return true;
           }
           // only right subtree
           if(root.right!=null)
           {
                if (parent.right==root)
                    parent.setRight(root.right);
                else if (parent.left==root)
                    parent.setLeft(root.right);
                return true;
            }
             // only left subtree
               if(root.left!=null)
           {
                if (parent.right==root)
                    parent.setRight(root.left);
                else if (parent.left==root)
                    parent.setLeft(root.left);
                return true;
            }         
         }   
            
            if(target<root.data)
                return deleteNodeBST(root.left,target,root);
            if(target>root.data)
                deleteNodeBST(root.right,target,root);
    }  
    
    
    public Node getMaxValueLeftSideAndDelete(Node n)
    {
        while(n.right!=null)
        {
            n=n.getRight();
        }
        Node tmp=n;
        n=null;// delete node here in order to move it up 
        return tmp;
 }
}
