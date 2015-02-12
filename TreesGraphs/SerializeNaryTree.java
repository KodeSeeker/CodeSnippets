/**
Extension of BT serialization Approach

**/

public void serialize (Node root, FileStream fin) {

	if(root ==null) {
		fin.write("#");
		return;
	}
		
	fin.write(root.data);
	//serialize the n kids.
	for( int i=0;i< root.children().length;i++) {
		serialize(root.children[i]);
	}
	
}

/**
Deserialize
**/
public Node  deserialize(FileStream fout) {

	if(fout.getNext()=="#")
		return null;
	Node root = new Node (fout.data);
	root.left= deserialize(fout.getLeft());
	root.right= deserialize(fout.getRight());
}


							
