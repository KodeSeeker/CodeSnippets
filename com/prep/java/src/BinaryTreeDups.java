/*Considering a binary search tree, 

            5

       3       6

    2      4          6

        2
        */
/*
Approach is to do in order traversal and check if each node matches its previous  node

*/

// global variable to count duplicates

int duplicates=0; 
public Node countDuplicates(Node root, Node prev)
{

  if(root==null)
    return duplicates;
    
  if(root.getLeft()!=null)  
            duplicates+= countDuplicates(root,root.getLeft();
  
  if(root!=prev && root.getValue()==prev.getValue())
            duplicates+=1;
  if(root.getRight()!=null)
            duplicates+=countDuplicates(root.getRight(),root);
  return duplicates;
}  


//Recursion based Generic
public int  countDuplicates (Node root, Node prev)
{
            //Basic edge case .. root==null
            if(root==null)
              return 0;
            //else
            int count=0;
            if (root.data==prev.data)
                count++;
            return count+countDuplicates(root.getLeft(),root)+countDuplicates(root.getRight(),root);
}
  