/**
Print a tree in vertical strips as shown below

For example : 

       8
     /   \
    6     10
   / \   /  \
  4   7 9    12
 / \
3   5

Should print  as :

3
4
6 5
8 7 9
10
12

Approach : Create a mapping based on distance of node from root and store all the nodes at the same distance in a single list,
using preorder traversal(recursively). 


**/


void printStripsVertically(Node root, Map<Integer,List<Node>> countMap, int dist) {

	if( root == null )
		return ;

	List<Node> nodeList = countMap.get(dist);// get list at current distance.


	if(nodeList ==null) { // this dist  hasnt been inspected yet, so create new list here. 
		nodeList= new ArrayList<Node>();
	}

	nodeList.add(root);// add current node to list. 
	countMap.put(dist,nodeList);// create mapping for current dist
	//recurse left and right.

	printStripsVertically(root.getLeft(),countMap,dist-1);
	printStripsVertically(root.getRight(),countMap,dist+1);

}
