

public class Point implements Comparable<Point> {

   int x;
   int y;
   
   public int getDistance()
   {
    return Math.pow(x,2)+ Math.pow(y,2);
    }
     public int compareTo(Point a)
   {
       int thisDistance=  Math.pow(this.x,2)+Math.pow(this.y,2);
       int distancePtA=Math.pow(a.x,2)+Math.pow(a.y,2);
       
        return thisDistance-distancePtA;
  }
}


public class KClosest
{
  int k=50;
  PriorityQueue<Point> pq = new PriorityQueue<K, new Comparator()>;
  
  public void addPointsToKCLosest(Point p)
  {
    if(pq.size()<K)
    {
      pq.offer(p);
      return;
    }
    else if(p.getDistance()<pq.peek().getDistance())
    {
      pq.poll();
      pq.add(p);
    }
  }
   //driver function  to add the points to heap.
   
   public void addtoHeap(List<Points> list)
   {
    for(Point p: list)
    {
      addPointsToKCLosest(p);
    }
  }
  
 }
