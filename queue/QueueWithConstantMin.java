package com.test.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueWithConstantMin {
	
	
	private Queue<Integer> mains;
	private Deque<Integer> mins;
	
	public QueueWithConstantMin() {
		mains= new LinkedList<Integer>();
		mins= new ArrayDeque<Integer>();
	}
	public void add(Integer a)
	{
		//add to main queue
		mains.add(a);
		//remove all elements from back of mins that are less than a
		while(!mins.isEmpty() && a<mins.getLast())
			mins.removeLast();
		mins.add(a);
	}

	public int remove()
	{
		if(mains.isEmpty())
			throw new IllegalArgumentException();
		int ret= mains.remove();
		if(ret==mins.getFirst())
			mins.removeFirst();
		return ret;
	}
	
	public int getMin()
	{
		if(mins.isEmpty())
			throw new IllegalArgumentException();
		return mins.getFirst();
	}
}
