// Find if there is a path from the root to the leaf of a tree that sums up to a given parameter.
// Idea - Recursive. At each level subtract sum from node value to see if sum==0 and there are no children.

public void boolean SumFromRootToLeaf(Node root, int sum)
{
    if(root == null)
        sum==0? return true: return false;// sum ==0 and root = null-> exit condition.
        
    else
    {
        bool flag= false;
        int subSum=root.data - sum;
        if(subsum ==0 && root.getLeft()== null && root.getRight()==null)
            return true; // we have a path with the sum-> exit condition.
        if(root.getLeft()!=null)
            flag=flag || SumFromRootToLeaf(root.getLeft(),subSum);
        if(root.getRight()!=null)
            flag = flag||SumFromRootToLeaf(root.getRight(),subSum);
        return flag;
    }
    
}