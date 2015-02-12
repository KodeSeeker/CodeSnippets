/**
Convert a sorted array to BST .
Similar approach as converting a linked list to a BST.
Pre -order traversal.
O(n) complexity.
**/

public Node arr2BST(int[] arr)
{
	return(arr,0,arr.length-1);
}


public Node arr2BST(int[] arr, int start,int end )
{
	int mid= (start+end) >>>1;
	Node root= new Node(arr[mid]);
	root.left= arr2BST(arr,start,mid-1);
	root.right=arr2BST(arr,mid+1,end);
	
	return root;
}

