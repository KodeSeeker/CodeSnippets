public enum State {
     Unvisited, Visited, Visiting;
   } 
// let the start node and the end node be both the nodes.

// Implementation using  DFS.
     public static boolean search(Graph g, Node start, Node end) { 
           LinkedList<Node> stack = new LinkedList<Node>(); // operates as Stack
            for (Node u : g.getNodes()) {
             u.state = State.Unvisited;
            }
            start.state = State.Visiting;
            stack.add(start);
            Node u;
            while(!stack.isEmpty()) 
            {
                  u = stack.removeFirst(); // i.e., pop()
                  if (u != null) {
                    for (Node v : u.getAdjacent()) {
                      if (v.state == State.Unvisited) {
                           if (v == end) {
                                return true;
                            } 
                            else {
                              v.state = State.Visiting;
                              stack.add(v);
                            }
                       }
                    }
               u.state = State.Visited;
                  }
            }
    return false;
    }