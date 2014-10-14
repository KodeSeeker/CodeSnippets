/**
Balance a Left Skewed BST by rotating it right.
Programmign Interviews Exposed
**/

//simple approach

public static Node rotateRight(Node oldRoot)
{
	Node newRoot= oldRoot.getLeft();
	oldRoot.setLeft(newRoot.getRight());
	newRoot.setRight(oldRoot);
	return newRoot;
}

