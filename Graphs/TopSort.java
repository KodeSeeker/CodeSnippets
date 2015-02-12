/**
 *  Input is a directed Acyclic graph. Output is a list containing a topological ordering of
 * of the input graph.
 * */
 
public List<Node>  topSort(Graph  G)
{
    if (G==null)
        return null;
    //basis of top sort 
    // 1. Find a node with indegree zero. 
    //2. Add this node to a hashset of nodes that contain nodes of indegree=0
    //4. for each of the nodes retreive all the connections (by iterating through them)
    //5.Reduce their indegree and the node's indegree. 
    //6. if their indegree reaches 0 then add them to the set and repeat.
    
    //.Check if the there are any nodes remaining with indegree !=0. => Graph contains a cycle . Throw exception.
    
    
    Set<Node> set = HashSet<Node>();
    List<Node> list= new List<Node>();
    List<Node> allNodes=G.getNodes();
    // add all nodes of indegree 0 to the set
    for (Node n: allNodes)
    {
        if(n.indegree.size()==0)
        {
            set.add(n);
        }
    }
    
   while(!set.isEmpty())
   {
       //you cannot remove from a set arbitarily , you need access to the object!
       //use iterator.
       Iterator<Node> it = set.iterator();
       Node n= it.next();
       //remove from set.
       set.remove(n);
       //add to sorted list 
       list.add (n);
       // check all the outEdges of n.
       for(Edge e: n.OutEdges)
       {
           Node m= e.to;
           n.remove(e);
           m.remove(e);//remove the edege for n and m.
           if(m.indegree().size()==0)
            set.add(m)// add to the set.
       }

   }
 }
 return list;
}
