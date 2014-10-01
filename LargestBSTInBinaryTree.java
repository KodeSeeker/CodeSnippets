/**
http://leetcode.com/2010/11/largest-binary-search-tree-bst-in_22.html
e.g.
___________________15___________________
              /                                        \ 
  ___________10___________                             20
 /                        \ 
 5                   _____7____
                    /          \
                  __2__       __5
                 /     \     / 
                 0      8    3 

Largest BST 

   	  ____15____
        /          \
      _10          20 
     /                 
     5

**/
//at the end of the function the largestBST is pointed to by largestParent

//incomplete!
Node largestBST;
Node child;
int maxNodes;
public int largestBST(Node p,int min, int max)
{
	if(p==null )
		return 0;
	if (p.data>min  && p.data>max)
	{
		int leftNodes= largestBST(p.getLeft(),min,p.data);
		//pass the value of the child up
		Node LeftChild=( leftNodes==0)?null:this.child;
		int rightNodes= largestBST(p.getRight(),p.data,max);
		Node rightChild= (rightNodes==0)?null: this.child;
		//create a copy of the current node
		Node parent = new Node(p.data);
		parent.left= leftChild;
		parent.right = rightChild;
		//pass value of child up.
		this.child=parent;
		int totalNodes= leftNodes+rightNodes+1;
		if(totalNodes>maxNodes)
		{
			this.largestBST= parent;
			maxNodes=totalNodes;
		}
		return totalNodes;
	}
	else
	{
		//exclude this Node and look down
		return Math.max(largestBST(p.getLeft(),INTEGER.MIN_VALUE,p.data), largestBST(p.getRight(),p.data,INTEGER.MAX_VALUE));
	}
}


