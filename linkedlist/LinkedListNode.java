package com.test.linkedlist;

public class LinkedListNode<T> {

	
	Integer value;
	LinkedListNode<Integer> next;

	
	public LinkedListNode(Integer value) {	
		this(value,null);
	}

	public  LinkedListNode(Integer value, LinkedListNode<Integer> next){
		this.value=value;
		this.next=next;
	}
	public String toString(){
		return this.value.toString();
	}
}
