package com.test.linkedlist;

public class ReversePartOfLinkedList {

	/**
	 * @param args
	 */
	
	static LinkedListNode list;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		init();
		print(list);
	}

	static void init(){
		list= new LinkedListNode(1);
		list.next.value=1;
		list.next.next.value=2;
		list.next.next.next.value=3;
		list.next.next.next.next.value=4;
		list.next.next.next.next.next.value=5;
		list.next.next.next.next.next.next.value=6;
	}
	
	
	static void print(LinkedListNode a){
		
		while(a.next!=null){
			System.out.println(a.value +" ->");
		}
	}
}
