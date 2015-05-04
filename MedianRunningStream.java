/*
 Find median of a stream of running integers.
*/

 // maintain heaps according two rules
  // size of max heap can be 1 or more than size of min heap.
  // max heap = contains the ** smallest** elements in the stream so far.
  // min heap = contains the **largest** elements seen so far.
  /*
  If number of elements seen so far is odd. then the median is the root of the max heap. 
  If the number of elements seen so far is even , then the median is the avg of the max root and the min root.
  
  
  **/

public class RunningMedian
{

public PriorityQueue<Integer> min= new PriorityQueue<Integer>();
public PriorityQueue<Integer> max= new PriorityQueue<Integer>(10, new Comparator()

public int compare (int o1, int o2)
  {
    return o2-o1;
  });
  
   public int count =0;
  
  
public void insertIntoMinMaxHeap(Instream in)
{
  if(in==null|| in.isEmpty())
    return;
  //min-max heap approach. 
  try
  {  
      for(Integer in: inStream )
      {
     	 count++;
    	 maxHeap.add(in);// by default add to max Heap.
      	if(maxHeap.size()>minHeap.size()+1)  {
        // rebalance  required. 
            	int tmp= maxHeap.poll();
            	minHeap.add(tmp);
          }
          else if(maxHeap.peek()>minHeap.peek()){
        	//swap the elements.
            	int tmp=maxHeap.poll();
           	 maxHeap.add(minHeap.poll());
            	minHeap.add(tmp);
         }
        
      }
    
  }
  
  
  catch(Exception e)
  {
      e.printStackTrace();
  }
  
 
 private int getMedian()
 {
  if (count%2==0)
     
     // return (maxHeap.peek()+minHeap.peek())/2;// Prone to overflow!
     return (minHeap.peek()+maxHeap.peek())>>>1;// zero-fill right shift. 
     
     
  else
      return maxHeap.peek();
 }
}
