

public class Point {

   int x;
   int y;
   
   public int getDistance()
   {
    return Math.pow(x,2)+ Math.pow(y,2);
    }
     public int compare(Point a,Point b)
   {
       int distancePt1=  Math.pow(a.x,2)+Math.pow(a.y,2);
       int distancePt2=Math.pow(b.x,2)+Math.pow(b.y,2);
       
        return distancePt1-distancePt1;
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
    else if(p.getDistance<pq.peek().getDistance())
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
