/**
Create a queue with  constant time push_rear, pop_front and getMin operations.

Direct application of the sliding window program.
Use 2 queues - A main queue and a queue for mins.

**/

public class AdvancedQueue
{
    public List<Integer> main= new ArrayList<Integer>();
    public List<Integer> min= new ArrayList<Integer>();// because queue in Java doesnt allow to remove at an index
    
    
    public void push_rear( int n)
    {
        main.add(main.size()-1,n);//add to the end of the arraylist.
        while(!min.isEmpty() &&  n<min.get(min.size()-1)
            min.remove(min.size()-1);
        min.add(min.size()-1,n);
    }
     
    public int pop_front()
    {
        int ret= main.get(0);
        main.remove(0);
        if(ret==min.get(0))
           min.remove(0);
        return ret;
    }
    
    public int getMin()
    {
        int ret= min.get(0);
        min.remove(0);
        return ret;
    }
}
          
