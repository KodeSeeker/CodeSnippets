/**   1
    /   \
  2      3
 / \    / \
4   5  6   7

Vertical-Line-1 has only one node 4 => vertical sum is 4
Vertical-Line-2: has only one node 2=> vertical sum is 2
Vertical-Line-3: has three nodes: 1,5,6 => vertical sum is 1+5+6 = 12
Vertical-Line-4: has only one node 3 => vertical sum is 3
Vertical-Line-5: has only one node 7 => vertical sum is 7

**/
/*
Approach: is to do in order traversal. 
and pass level -1 for left and +1 for right. 
*/

public void  verticalSumBinaryTree(Node root)
{
	if( root == null)
	 return;
	Map<Integer,Integer> map= HashMap<Integer, Integer>();
	// pass hd as 0 . 		
	map.put(0,root.value);
	verticalSumBinaryTree(root, 0, map)

}

public void verticalSumBinaryTree(Node root, int horizontalDistance, HashMap<Integer,Integer> map)
{
	if(root == null)
		return;
	//go left and pass hd-1

	verticalSumBinaryTree(root.getLeft(),horizontalDistance-1, map);
	//process current node by getting all the nodes at current horizontal distance.
	int prevSum= map.get(horizontalDistance)==null?0: map.get(horizontalDistance);
	sum= prevSum+root.data;
	map.put(horizontalDistance,sum);
	verticalSumBinaryTree(root.getRight(),horizontalDistance+1, map);

}

