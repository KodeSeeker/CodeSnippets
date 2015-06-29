public class QueueWithTwoStacks {

	/**
	 * @param args
	 */
	
	Stack<Integer> s1= new Stack<Integer>();
	Stack<Integer> s2= new Stack<Integer>();
	
	//add to queue
	public  void add (Integer a)
	{
		s1.push(a);
	}
	
	
	//remove from queue and return an integer in FIFO order.
	
	public int remove() throws IllegalArgumentException
	{
		if(s1.isEmpty() && s2.isEmpty())
			throw new IllegalArgumentException();
		if(!s2.isEmpty())// this ensures that order is maintained even if an add is executed betweeen removes.
			return s2.pop();
		
		while(s1.isEmpty())
		{
			s2.push(s1.pop());
		}		
		return s2.pop();
	}
}

/**
1-2-3-4

push twice
s1-  2-1

pop once 
s2 -1-2.

return 1
s1 - empty s2 2

push 3 
s1 -3
s2 -2 
 pop
s2 - empty
s1 -3
pop
s2-3 return 3

s1 empty s2 empty
