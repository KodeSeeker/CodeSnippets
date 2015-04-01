/**
Sum of all the numbers that are formed from root to leaf paths

    					6
                                      /      \
                                    3          5
                                  /   \          \
                                 2     5          4  
                                      /   \
                                     7     4
  There are 4 leaves, hence 4 root to leaf paths:
   Path                    Number
  6->3->2                   632
  6->3->5->7               6357
  6->3->5->4               6354
  6->5>4                    654   
Answer = 632 + 6357 + 6354 + 654 = 13997

Original Link : http://www.geeksforgeeks.org/sum-numbers-formed-root-leaf-paths/

Key idea is to pass the sum downward as you move down from the root. At each level multiply sum so far by 10 as you move down .
**/
 
//call is (root,0).
int sumToRootPathNumbers(Node root, int sumSoFar) {

	if( root == null ) // base case. 
		return 0;
	
	sumSoFar = (sumSoFar *10) + root.data;// calculate sum at current level. 

	if(root.getLeft()== null && root.getRight() == null) // return sumSoFar if child node.
 		return sumSoFar;

	//calculate sum recursively for children and add them 
	return sumToRootPathNumbers(root.getLeft(),sumSoFar) + sumToRootPathNumbers(root.getRight(), sumSoFar);
}


