import java.util.LinkedList;
import java.util.Queue;
public class BreadthFirst
{

public static  int[] rowIndices= new int[]{-1,-1,-1,0,0,1,1,1};
public static  int[] colIndices= new int[]{-1,0,1,-1,1,-1,0,1};
public static boolean[][] visited;

//x and y are the start coordinates
public boolean  BFS (int [] [] in, int x,int y, Coordinate target)
{
	Coordinate c= new Coordinate(x,y); //let c be the origin.
	visited= new boolean [in.length][in[0].length];
	
	Queue <Coordinate> q = new LinkedList<Coordinate>();
	
	q.add(c);
	
	while(!q.isEmpty())
	{
		Coordinate n= q.pop();
		visited[n.x][n.y]=true;
		if(n.equals(target))
		  return true;
		else
		{
		   for (int k=0;k<8;k++)
			{
				if(!visited[n.x+rowIndices[k]][n.y+colIndices[k]])
					q.add(new Coordinate( n.x+rowIndices[k],n.y+colIndices[k]]);
			}
		}
	}

	return false;
}


class Coordinate 
{
	int x;
	int y;
	
	Coordinate(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	@Override
	public boolean equals(Coordinate c)
	{
		if (!(c instanceof Coordinate))
			return false;
		if (c==this)
			return true;
		else
		{
			return (this.x==c.x) &&(this.y==c.y);
		}
	}
	
	@Override 
	public int hashCode()
	{
		return 17*this.x*this.y;
	}
}

}
