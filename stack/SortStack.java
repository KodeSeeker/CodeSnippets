package com.test.stack;

import java.util.Stack;

public class SortStack {

	/**
	 * @param args
	 */
	
    public static Stack<Integer> sort(Stack<Integer> s) {

        if (s.isEmpty()) {
         return s;
       }
       int pivot = s.pop();

       // partition
       Stack<Integer> left  = new Stack<Integer>();
       Stack<Integer> right = new Stack<Integer>();
       while(!s.isEmpty()) {
         int y = s.pop();
         if (y < pivot) {
           left.push(y);
         } else {
           right.push(y);
         }
       }
       sort(left);
       sort(right);

       // merge
       Stack<Integer> tmp = new Stack<Integer>();
       while(!left.isEmpty()) {
         tmp.push(left.pop());
       }
       tmp.push(pivot);
       while(!right.isEmpty()) {
         tmp.push(right.pop());
       }
       while(!tmp.isEmpty()) {
        // System.out.println(tmp.pop());
    	   s.push(tmp.pop());
       }
      
       
       
       return s;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> a = new Stack<Integer>();
		a.push(5);
		a.push(1);
		a.push(25);
		a.push(30);
		a.push(0);
		Stack<Integer> b= sort(a);
		while(!b.isEmpty())
		{
			System.out.println(b.pop());
		}

		System.out.println("----");
		char c='4';
		int d=c;
		System.out.println(d);
	}

}
