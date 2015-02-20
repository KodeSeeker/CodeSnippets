/**
Clone an undirected graph. Each node in the graph contains a label and a list of its neighbors.
Each node has a value and List of neighbors
**/

/**
Approach to use a map thatmaps original node to clone. 

**/
UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {

	if(root ==null)
		return null;
	Map<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
	
	Queue<UndirectedGraphNode> queue= new LinkedList<UndirectedGraphNode>();

	UndirectedGraphNode rootClone= new UndirectedGraphNode(root.data);
	queue.add(root);
	
	map.put(root,rootClone);
	
	while(!queue.isEmpty()) {
		
		UndirectedGraphNode  current = queue.poll();
		 ArrayList<UndirectedGraphNode> neighbors = current.neighbors;
		
		for(UndirectedGraphNode neigh: neighbors) {
		
			if(!map.containsKey(neigh))
			{ // new node need to make the association
				UndirectedGraphNode cl = new UndirectedGraphNode(neigh.data);
				map.put(neigh,cl); // map for neigh.
				map.get(current).neighbors.add(cl);// add the cl to the neighbors of its clone. 
				queue.add(neigh);// to inspect rest of the tree.
			}
			else// node already seen just need to add to neighbors of its clone.
				map.get(current).neighbors.add(map.get(neigh));
		
		}

	}


	return rootClone;
}
	
