/*
Finds all the shortest paths from a given node in a graph. Condition:

Graph should have only positive edges.
Approach:
1)Maintain an array of  (shortest) distances from one node to each node.
   - Initialize the array to MAX_VAL.
 2)Init Distance of Source from itself to 0.
 3) Find the nearest neighbor and mark it as visited.
 4) For each of its neighbors, find the shortest distance and update the distance matrix if the distance is lesser
    than the current minimum distance to that node.
5) Keep track of the preceding node in the path (in an array) to backtrack. 
**/

public  void  Djikstra(Graph  G)
{
    if (G==null )
        return ;
    int[] dist= new int[G.size()];
    int[] pred= new int [G.size()];
    //keep track of whether a node has been visited or not.
    boolean[]  vistited = new boolean[G.size()];
    int s= G.source;
    visitied[s]=true;
    dist[s]=0;// distance from source =0.
    //set all others to max_val
    for(int i=1;i<dist.length;i++)
    {
        dist[i]=INTEGER.MAX_VALUE;
    }
    
    for(int i=0;i<dist.length;i++)
    {
     Node nxt= nearestUnvisitedNode(dist,visited);
     //set this node also as visited.
     
     visited[nxt]=true;
     Node[] neighbors= nxt.getNeighbors();
     
     for (int i=0;i<neightbors.length;i++)
     {
         Node n = neighbors[i]; // get the neighbors node value. 
         int d =getDistance (nxt,n)+dist[next];// find distance to neighbor node through this node.
         if(dist[n]>d)
         {
             dist[n]=d;
             pred[n]=nxt;
         }
     }
     
     return pred;// this has the  shortest path ordering.
    }
    
    
    
    
    Node nearestUnivisitedNode(int[] dist, int [] visited)
    {
        int distance=INTEGER.MAX_VALUE;
        int n= -1;// node not found. or all nodes visited.
        for(int i=0;i<dist.length;i++)
     {
         if (dist[i]<distance  && !visited[i])
         {
             distance=dist[i];
             n=i;
         }
         
     }
     return n;
    }
    
    
}
    