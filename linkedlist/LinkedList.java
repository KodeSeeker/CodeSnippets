package com.test.linkedlist;


public class LinkedList {
	
	int size;
	LinkedListNode<Integer> head;
	
	
	

	public void add(Integer val){
		LinkedListNode<Integer> temp =new LinkedListNode<Integer>(val);
		if(head == null){
			head = temp;
			this.size++;
			return;
	}else{
			LinkedListNode<Integer> tmp=head;
			while(tmp.next!=null){
				tmp= tmp.next;
			}
			tmp.next =temp;
			this.size++;
		}
		
	}
	
	public void addAtIndex(Integer val, int idx){
		
		if(idx<0 || idx >this.size)
			throw new IllegalArgumentException("Invalid index provided");
		
		LinkedListNode<Integer> temp= new LinkedListNode<>(val);
		if (idx==0){
	//		LinkedListNode<Integer> tmp = head;
			temp.next=head;
			head=temp;
		}
		else{
			LinkedListNode<Integer> tmp = head;
			while(idx >0){
				idx--;
				tmp=tmp.next;
			}
			temp.next= tmp.next.next;
			tmp.next=temp;
		}
		
	}
	
	public void removeAtIndex(int idx){
		
		if(idx<0 || idx >this.size)
			throw new IllegalArgumentException("Invalid index provided");
		if(idx ==0){
			LinkedListNode<Integer> tmp = head;
			head = tmp.next;
			head.next= tmp.next.next;
			this.size--;
		}
		else{
			LinkedListNode<Integer> tmp = head;
			while(idx>0){
				idx--;
				tmp= tmp.next;
			}
			tmp.next= (tmp.next==null?null:tmp.next.next);
			this.size--;
			tmp =tmp.next;
		}
		
			
	}

	public void reverse(){
		LinkedListNode<Integer>prev=null;
		LinkedListNode<Integer>nxt=null;
		
		while(true){
			nxt=head.next;
			head.next=prev;
			prev=head;
			if(nxt ==null)
				return;
			head=nxt;
		
		}
	}
	
	public void reversePart(int start, int end){
		
		if(start > end || end >size || start <0)
			throw new IllegalArgumentException("Invalid indices provided!");
		
		int count = end-start;
		LinkedListNode<Integer> tmp = head;
		LinkedListNode<Integer> reversalEnd = head;

		//skip start nodes;
		while(start>0){
			tmp=tmp.next;
			start--;
		}
	//point where we need to reconnect the list.
		while(end>0){
			end--;
			reversalEnd=reversalEnd.next;//prepare end node to connect to reversalEnd .
		}
		reversalEnd= reversalEnd.next;
		LinkedListNode<Integer> startRev= tmp;
		//tmp.next=null;//
		LinkedListNode<Integer> prev= null;
		LinkedListNode<Integer> nxt= null;
		//reverseSubList
		while(count>0){
			count--;
			nxt= startRev.next;
			startRev.next=prev;
			prev = startRev;
			if(count ==0)
				break;
			startRev=nxt;
		}
		tmp.next=startRev;
		nxt.next=reversalEnd;
		
		
	}
	
	 @Override
	public String toString(){
		 LinkedListNode<Integer> tmp = head;
		StringBuilder sb = new StringBuilder();
		sb.append("Total size " +this.size +"\n");
		while(tmp!=null){
		sb.append(tmp.value+ "->");
		tmp= tmp.next;
		}
		return sb.toString();
	 }
}