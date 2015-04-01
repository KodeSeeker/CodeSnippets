/**
Simple Trie Implementation . 
https://github.com/phishman3579/java-algorithms-implementation/blob/master/src/com/jwetherell/algorithms/data_structures/Trie.java
**/
/***
contains method 
**/


public boolean contains (String s ) {

		Node n = this.getNode(s);
		
		if( n==null || !n.isWord)
			return false;
	
		return n.isWord;// isWord is a flag indicating we've seen the last node on the word aka the character last seen is indeed the last and a leaf!
}


Node  getNode(String s) {


	if ( root == null ) 
		return null ; // if root is null . trie was not created . so return null !

	Node n = root;

	char[] chars = s.tocharArray();
	
	for ( int i =0;i <chars.length; i++) {
			
			//check if the child of current index is within the trie.
			int index = n.getChildIndex(chars[i]);
			// if character exists within trie. -Reassign index to its child to continue process!
			if (index >=0) {
				index = n.getChildIndex(index);
			}
			else// chars is not over and word is not in trie!
				return null;
	}
		
	return n;// we return n - the last node and check if its a leaf or not in the caller!
}
				
		


/**
Add method implementation :  Walk through the input string, handle case of the last character separately in the string. 

**/

// Returns reference to last node in the added string. 

Node addString( String s ){

	if( s== null )
		return null; 
	if(root == null) { // we need to create a new root. 
		root =createNewNode( null, Node.SENTINAL, false);// Sentinal is a special character to represent the root.  
	}
	
	int len = s.length()-1;
	Node n =null;
	Node prev=root;
	for( int i=0;i< len;i++) {// inspect and move pointers for  all but last character
			
			char c = s.charAt(i);
			int index = prev.childIndex(c);// find current index wrt to the child.
			
			if(index >=0) {// c is present in trie. 
				n= prev.getChild(index);	
			}
			else {// create new node and add it as a valid child.  
			 	n = createNewNode(prev,c, false);
				prev.addChild(n);
			}
			prev =n;// update value of prev as you walk the string. 
	}
	
	// handle the last character case. 

	char lastChar = s.charAt(len);
	int index = prev.childIndex(lastChar);
	
	if(index >=0) { // char is present in trie. need to change its attribute
		n = prev.getChild(index);
		
		//change the attribute. 
		if(n.isWord ==false) {
			n.isWord =true;
			n.character =c;
			size++;
			return n;
		}
		return null;//string already in trie.// n .isWord has already been marked! 

	}
	// else if index < 0. Create this node. 

	n = createNewNode(prev, lastChar,true);
	size++;
	return n;	
}
		
