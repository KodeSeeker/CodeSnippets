

void nthLargest( Node root, int N)
{
    /*
    Idea : Do reverse in order traversal and keep checking for value of N
    against counter. If counter==N. Then print value. 
    */
    private static int counter=0;
    
    if (root==null)
        return;
    //go Right to get to the largest element.
    
    nthLargest(root.getRight(),N);
    
    // now in order check 
    if(++counter==N)
    {
        //print it!
        System.out.print(root.data);
    }
    
    // go Left.
    nthLargest(root.getLeft(),N);
}