
/**
Print the path from the root to a node in a binary tree.
**/
/**
Approach: Recursively search  and add to path string
**/

public List<Node> pathToTarget(Node root, Node target, ArrayList<Node> path)
{
    if(root==null)
        return null; // basic edge case.
    if(root.equals(target))//found the target so add it to the list and return.
        {
            path.add(target);
            return path;
        }
    // apply logic recursively.
    //check left. if left returns null then its not in the left subtree.
   //  pass the right subtree after adding current node to list.
   //else pass the left subtree after adding node to list.
   
  path.add(root);
List<Node> left= pathToTarget(root.getLeft(),target, path);
List<Node> right= pathToTarget(root.getRight(),target, path);

	if(left==null)? return left:return right;
}


