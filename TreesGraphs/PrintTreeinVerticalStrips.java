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

Map<Integer,Set<Integer>>  printStripsVertically(TreeNode root, Map<Integer,Set<Integer>> countMap, int dist) {

        if( root == null )
                return countMap;

        Set<Integer> nodeSet = countMap.get(dist);// get list at current distance.


        if(nodeSet ==null) { // this dist  hasnt been inspected yet, so create new list here. 
                nodeSet= new HashSet<Integer>();
        }

        nodeSet.add(root.data);// add current node to list. 
        countMap.put(dist,nodeSet);// create mapping for current dist
        //recurse left and right.

        Map<Integer,Set<Integer>> leftMap = printStripsVertically(root.getLeft(),countMap,dist-1);
        Map<Integer,Set<Integer>> rightMap = printStripsVertically(root.getRight(),countMap,dist+1);
        Map<Integer,Set<Integer>> mergedMap= new HashMap<Integer,Set<Integer>>();
        Iterator<Integer> itLeft = leftMap.keySet().iterator();
        while(itLeft.hasNext()){
        	mergedMap.put(itLeft.next(),leftMap.get(itLeft.next()));
        }
        Iterator<Integer> itRight = rightMap.keySet().iterator();
        while(itRight.hasNext()){
        	mergedMap.put(itRight.next(),rightMap.get(itRight.next()));
        }
        
        return mergedMap;
}

