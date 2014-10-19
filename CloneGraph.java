/**
Clone a given graph and return the clone. 
Approach : Somewhat similar to the clone linked list with arbitary pointer approach.
Using BFS.->Queue
**/


public Graph clone(Node root)
{

	if(G==null)
		return null;
	Queue<Node> queue= new Queue<Node>();
	queue.add(root);
	Map<Node,List<Node>> map= new HashMap<Node,List<Node>>();//to store the node and its neighbors.
	map.put(root,new ArrayList<Node>());
	
	while(!q.isEmpty())
	{
		Node n= q.pop();
		List<Node> neighbors= n.getNeghbors();
	
		for(Node neigh:neighbors)
		{
			List<Node> nList;
			if(!map.containsKey(neigh))//this node hasnt been seen yet. So create a new list of neighbors and make associations
			{
				nList=new ArrayList<Node>();
			}
			else
			{// the node has already been seen-- just update associations.
				nList=map.get(neigh);
			}
			 nList.add(n);
                         map.put(neigh,nList);//add the association for the neighbor node
 			 List<Node> oldList=map.get(n);
			 oldList.add(neigh);
			 map.put(n,oldList);	//update the association for n.

		} 
	}

//Now we need to iterate through the map to recreate the clone

	List<Node> keys=map.keySet();

	for(Node key:keys)
	{
		List<Node> neighbors:map.get(key)
		for(Node neighbor:neighbors)
			key.next=neighbor;
	}
	//search for root in keys and return it
	for(Node key:keys)
	{
		if(key.data==root)
			return key;	

	}
}
	
		

