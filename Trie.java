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
				
			
