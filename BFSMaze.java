
public class BreadthFirst
{

public Queue<Coordinates> q = new LinkedList<Cooridnates>();

//x and y are the start coordinates
public boolean  BFS (int [] [] in, int x,int y)
{
	Coordinate c= new Coordinate(x,y); //let c be the origin.
	q.push(c);
  	int[] rowIndices= new int[]{-1,-1,-1,0,0,1,1,1};
        int[] colIndices= new int[]{-1,0,1,-1,1,-1,0,1};
	while(!q.isEmpty())
	{
		Node n = q.pop();
		n.visited =true;
		if (n==target)
			return true;
		else
		{
			for (int k=0;k<8;k++)
			{
				q.add( new Coordinate(x+rowIndex[k], y+colIndex[k]);
			}
		}
	}
}
