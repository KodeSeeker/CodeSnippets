/**
We need to bother only about insert and remove method, while ensuring we maintain the heaporder.

Insert method
//insert new node to the first open position in the heap
//while the new node is greater than its parent
//  swap the new node with its parent. ie. trickleup


**/

/**
                Assume heap is backed by an array and a size parameter. We have a method to get the parent, left child and right child.
**/
public void insert (int value)
{
	// check if the element into current array. 
	//else grow
	if(this.size== this.arr.length)
		grow();// aux function that grows the array by copying over the elements over to another bigger array.
	this.array[this.size]=value; // put the value in the last unfilled position.
	trickleUp(size++);// restore heap property by shifting last element to the right place.
}

public void trickleUp(int index)
{
	int tmpData= this.arr[index];
	int parentIndex= getParent(index);
	
	//move up values at index to parent until the heap property is satisfied.
	while(index >0 && this.arr[parentIndex] <tmpData)
	{
		this.arr[index]= this.arr[parentIndex];
		index=parentIndex;
		parentIndex=getParent(parentIndex);
	}

	// at the end of above loop the heap property should be reestablished and the index should point
	// to the right location for tmpData.
	this.arr[index]=tmpData;
}





/**
Delete operation : //remove the root of the heap
//move the last node in the heap to the root
//while the relocated node having a child greater than itself
//  swap the relocated node with it's larger child
**/
//always the top node gets removed.!

public int remove ()
{
	if(this.size==0)
		return -1;// array already empty . cannot remove!
	int result= this.arr[0];
	//replace the last element to the top of the heap to rebalance.
	this.arr[0]=this.arr[size--];
	trickleDown(0);// trickle down the new element to the right place!
	
	return result;		
}



public void trickleDown(int index)
{
	int tmpData= this.arr[index];
	
	while(index<size/2)
	{
		
		int leftChildIndex =getleftChild(index);
		int rightChildIndex= getRightChild(index);
		int biggerChildIndex;
		if(arr[leftChildIndex]>arr[rightChildIndex])
			biggerChildIndex=leftChildIndex;
		else
			biggerChildIndex=rightChildIndex;
		
		if(arr[biggerChildIndex] < tempData)
			break;// stop .. heap is balanced!
		//else swap positions.
	 	this.arr[index]= this.arr[biggerChildIndex];
		index=biggerChildIndex;
	}
	
	this.arr[index]=tmpData;
}



