public class BFS{
  

public  static Node[] prev;
public static Graph G;
public  static void BFSWithBackTracking( )
{
  if(G==null)
    return;
  
  //classic BFS with an array to store the predecessor of each node
  Node[] prev = new Node[G.size()];
  //Queue for BFS
  Queue<Node> q= new LinkedList<Node>();
  
  Node root = G.root;
  
  if(root!=null)
    {  
      q.push(root);
      prev[root]=-1;
      root.visited=true;
    }
  while(!q.isEmpty())
  {
    Node child = q.poll();
    for(Node n:child.getNeighbors())
    {
      if(!n.isVisited())
      {
        n.visited=true;
        prev[n]=child;
        q.push(n);
      }
    }
  }
}

//Method to find shortest path
//Assume pred[] is populated with the right node information.

public int shortestPath(Node v)// v is the destination vertex
{
  if(pred.length==0)
    return -1; // pred hasnt been populated correctly.
  int dist=0;
  if(G.root==v)
    return 0;
  while(pred[v]!=-1)
  {
    dist++;
    v=pred[v];
  }
  
  
  return dist;
}
}