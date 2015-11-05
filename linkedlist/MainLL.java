package com.test.linkedlist;


public class MainLL {

	public static void main (String...args){
		
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		list.add(5);
		list.add(6);
		list.addAtIndex(34, 0);
		list.addAtIndex(22, 2);
		
	
		System.out.println(list.toString());
		
		list.reversePart(1, 4);
		System.out.println(list);
		list.reverse();
	//	System.out.println(list);
		list.removeAtIndex(0);
		//System.out.println(list);
		list.removeAtIndex(2);
		//System.out.println(list);
		
	}
}
