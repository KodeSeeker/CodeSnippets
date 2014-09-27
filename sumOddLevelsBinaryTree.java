/**
Find the sum of nodes at odd levels of a binary tree.
Approach: Simple. 
1) Pre order traversal. Pass a boolean variable along and toggle it for odd and even levels.
**/

public static int sumAtOddLevels( Node root, boolean isOddLevel)
{
	if(root == null)
		return 0;
	int childSum=sumAtOddLevels(root.getLeft(),!isOddLevel)+sumAtOddLevels(root.getRight(),!isOddLevel)
	if(isOddLevel)
		return root.data+childSum;
	else
		return childSum;

}

