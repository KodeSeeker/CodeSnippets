/**
Implement a stack using queues.

Real naive appraoch : Use a queue to enqueue stuff . Use an array to read out stuff  in the opposite  order


Using two queues . Make the push easy . and pop harder.
**/

package com.test.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackWith2Queues {

	Queue<Integer> q1;
	Queue<Integer> q2;

	public StackWith2Queues(){
		q1 = new LinkedList<>();
		q2 = new LinkedList<>();
	}
	
	void push(int x){
			q1.add(x);
		
	}
	//pop is more expensive.
	int pop() {
		if(q1.isEmpty())
			throw new IllegalArgumentException("Stack Underflow!");
		while(q1.size()!=1){
			q2.add(q1.poll());
		}
		int ret =q1.poll();
		//swap q1 and q2.
		Queue<Integer> tmp;
		tmp=q1;
		q1=q2;
		q2=tmp;
		
		return ret;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackWith2Queues st= new StackWith2Queues();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		System.out.println(st.pop());
		st.push(5);
		st.push(6);
		System.out.println(st.pop());

	}

}

