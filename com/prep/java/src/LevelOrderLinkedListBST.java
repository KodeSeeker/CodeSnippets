


ArrayList<LinkedList<TreeNode>> findLevelLinkList(TreeNode root) {
    int level = 0;
    ArrayList<LinkedList<TreeNode>> result =  new ArrayList<LinkedList<TreeNode>>();  // ArrayList to return the final set of lists arranged according to level
    LinkedList<TreeNode> list = new LinkedList<TreeNode>();// list to store the individual lists at each level.
    list.add(root);//// first place the root., into the array list.
    result.add(level, list);// plae the root and level into the final arraylist
    while (true) {// create and store lists into the final arraylist for each level.
      list = new LinkedList<TreeNode>();// create a new list for each level
      for (int i = 0; i < result.get(level).size(); i++) {// loop through each node at that level
        TreeNode n = (TreeNode) result.get(level).get(i);// extract node from list which is in arraylist.
        if (n != null) {
            if(n.left != null) list.add(n.left);
            if(n.right!= null) list.add(n.right);
        }
      }
      if (list.size() > 0) {
         result.add(level + 1, list);// if the resulting list>0, then place it in the final arraylist and repeat procedure
      } else { 
          break;// this is reached when the entire tree has been explored.
      }
      level++;
    }
    return result;
 }