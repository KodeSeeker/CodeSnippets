/**
Serialize a BST to a file and reconstruct it.
Key: The best way to serialize a BST is by flattening it using a pre-order traversal. Which allows you to reconstruct it.
Deserializing : Similar to searching a BST>
http://leetcode.com/2010/09/saving-binary-search-tree-to-file.html
**/


public void serialize(Node root)
{
	// Basic Pre-order traversal.
	if(root== null)
		return;//base case.
	System.out.print(root.data+ "  ");
	serialize(root.left);	
	serialize(root.right);
}


//deserializing assumes that the tree is balanced and builds it in the most balanced possible way.

public Node deSerializeTree( Node root,FileStream fin)
{
	//val should be root when we start out. Assuming that we used pre-order traversal to store the tree.
	int val=fin.getNext();
	return deSerializeTree(root,val,INTEGER.MIN_VALUE,INTEGER.MAX_VALUE);

}


public void  deSerializeTree(Node root,int val, int min,int max)
{
	if(val>min && val<max)
	{
		root = new Node(val);
		if(fin.hasNext())
		{
			int nextVal=fin.getNext();
			deSerialize(root.getLeft(),nextVal,min,val);
			deSerialize(root.getRight(),nextVal,val,max);
		}
	}

}

//need to verify deserializing approach. 




