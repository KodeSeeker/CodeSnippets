/*
Basic Algo: In order traversal (Iterative)

Go left to the smallest element. 
Then keep popping and reducing k, 
Ifk ==0
 popped node is the kthsmallest node.
else
{
if node has a right child. Copy its left subtree completely to the stack!
}

  

Point where k==0, the node returned will be kth smallest element

NOTE: Algo same for kth largest Element, invert left and right.

*/

// Kth Smallest element BST. Simplified Approach.
public void  findKthSmallestElementBST(Node root)
{
	
	if(root == null)
		return;
	Node curr= root;
	Stack<Node> st = new Stack<Node>():
	while((curr !=null)|| !(st.isEmpty())
	{
		if(curr!=null)
		{
			//keep going left.
			st.push(curr);
			curr= curr.getLeft();
		}
		
		else
		{
			
			curr= st.pop();
			if(k==0){
				System.out.print(" Kth largest node is "+curr.data);
				return;
			}
			k--;
			curr= curr.getRight();
		}
	}
}



//Recursive In order approach -- Find the Kth Smallest element. 

void findKThSmallestBSTRecursive(Node root,int index,int k){

	if(root == null && k !=0)
		throw new IllegalArgumentException();
	//left
	findKThSmallestBSTRecursive(root.getLeft(),index,k+1);
	//child.
	index++;
	if(index ==k){
		System.out.print("Kth smallest " +root.data);
		return;
	}
	//right. 
	findKThSmallestBSTRecursive(root.getRight(),index,k+1);
}



