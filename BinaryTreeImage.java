package com.test;

public class BinaryTreeImage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	TreeNode rootA= new TreeNode(4);
	rootA.setLeft(new TreeNode(5));
	rootA.setRight(new TreeNode(7));
	TreeNode rootB= new TreeNode(4);
	rootB.setLeft(new TreeNode(5));
	rootB.setRight(new TreeNode(7));
	
	System.out.println("Validate 1"+checkImage(rootA, rootB));

	
	
	
	TreeNode rootLeft=new TreeNode(7);
	TreeNode rootRight=new TreeNode(7);
	TreeNode rootLeftLeft=new TreeNode(8);
	TreeNode rootRightRight=new TreeNode(8);

	
	rootA.setLeft(rootLeft);
	rootLeft.setLeft(rootLeftLeft);
	
	rootA.setRight(rootRight);
	rootRight.setRight(rootRightRight);
	
	rootB.setLeft(rootLeft);
	rootB.setRight(rootRight);

	System.out.println("Validate 2 "+checkImage(rootA, rootB));
	}

	
	static boolean checkImage(TreeNode a, TreeNode b)
	{
		if(a==null && b==null)
			return true;
		if(a==null ||  b==null)
			return false;
		if( (a.data ==b.data ) &&(checkImage(a.getLeft(),b.getLeft()) &&checkImage(a.getRight(),b.getRight()) ))
			return true;
		return false;
	}
}
