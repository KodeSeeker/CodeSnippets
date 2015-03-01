/**

Either make root static or make root and fin members of same class and manipulate it using the object. 

Extension of BT serialization Approach
-> Assume N is globally defined

**/

 void serialize (Node root, FileStream fin) {

	if(root ==null) {
		fin.write("#");
		return;
	}
		
	fin.write(root.data);//assume fin appends to the stream and does  not overwrite. 
	//serialize the n kids.
	for( int i=0;i< N && (root.getChild[i]!=null) ;i++) {
		serialize(root.children[i],fin);
	}
	
}

/**
Deserialize for N ary tree -> Assume N is globally defined
**/
void   deserialize(FileStream fout,Node root) {

	if(fout.getNext()=="#"|| fout== null )
		return;
	root = new Node (fout.getNext().data);
	
	// deserialize all the children recursively.
	for(int i=0; i< N ; i++) {
		deserialize(fout, root.getChild(i));
	}
 
}


							
