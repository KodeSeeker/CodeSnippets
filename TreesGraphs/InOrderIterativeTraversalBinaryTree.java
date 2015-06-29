
/**
In order iterative traversal Binary tree. 

LeetCode approach.
**/


void iterativeTraversal(Node root) {

	if(root == null)
		return;

	Stack<Node> st= new Stack<Node>();
	
	Node current = root;
	
	while(!st.isEmpty() || current!=null) {
		//if left is not null go left.
		if(current!=null){
			st.push(current);
			current= current.getLeft();
		}
		
		else {
			current = st.pop();
			System.out.println(current);//print.
			if(current.getRight()!=null)//address right branch of node 
				current = current.getRight();
		}

	}
}

		

