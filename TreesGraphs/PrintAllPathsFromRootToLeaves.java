/**
Print All the paths from root to leaf for a given binary tree.
**/


//printPathsToLeaf(root,"");
void printPathsToLeaf(Node root, String currPath) {
	
	
	
	currPath+ = root.data;

	//base case. 
	if(root.getLeft()==null && root.getRight() == null){
		System.out.print(currPath);
		return;
	}
	
	if(root.getLeft()!=null)
		printPathsToLeaf(root.getLeft(),currPath);
	
	if(root.getRight()!=null) 
		printPathsToLeaf(root.getRight(),currPath);
}
	
