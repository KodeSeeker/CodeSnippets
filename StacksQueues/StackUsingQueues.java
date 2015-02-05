/**
http://stackoverflow.com/questions/688276/implement-stack-using-two-queues

Given two queues with their standard operations (enqueue, dequeue, isempty, size), implement a stack with its standard operations (pop, push, isempty, size).

There should be TWO versions of the solution.

Version A: The stack should be efficient when pushing an item.
Version B: The stack should be efficient when popping an item.
I am interested in the algorithm more than any specific language implementations. However, I welcome solutions expressed in languages which I am familiar (Java, C#, Python, VB, Javascript, Php). Thanks in advance.


Algo:
1. ,Pop from queue 1 all the time. 
2. Everytime a number is pushed , push it to queue 1 if its empty. Else, move all of its contents from q1 to q2. Add the element to q1
And then copy over remaining stuff from q2 to q1.

**/
//O(1)
public int pop()
{
	if(q1.isEmpty())
		return -1;
	return q1.remove();
}
//O(n)
public void  push(int n)
{
	if(q1.isEmpty())
	{
		q1.add(n);
		return;
	}
	//remove all from q1.
	while(!q1.isEmpty())
	{
		q2.add(q1.remove());
	}
	//add neve element to q1.
		q1.add(n);
	
	//transfer back elems from q2 to q1.
	while(!q2.isEmpty())
	{
		q1.add(q2.remove());
	}

}

