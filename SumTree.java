package com.test;

public class SumTree {

	public static void main(String... args)
	{
		
	}
	
	static boolean isLeaf(TreeNode node)
	{
	  if((node.getLeft()== null && node.getRight()== null))
	  {
	    return true;
	   
	  }
	  return false;
	}
	
	static boolean isSumTree(TreeNode root)
	{
	
		if(root==null || isLeaf(root))
			return true;
		
		return false;
	}
}
