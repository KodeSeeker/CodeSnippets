

public Node treeMaker(int[] pre, int[] in, int preStart, int inStart, int inEnd)
{
    if(inStart>=inEnd)
        return null;
    int offSetPos= getInOrderIndex(pre[preStart],in,inStart,inEnd);
    Node root = new Node(pre[preStart++]);
    
    root.setLeft(treeMaker(pre,in,preStart,inStart,offSetPos-1);
    root.setRight(treeMaker(pre,in,preStart,offSetPos+1,inEnd);
        
    return root;
 }
 

public int getInOrderIndex(int target, int [] arr,int start,int end)
{
    for(int i=start;i<end;i++)
    {
        if(target==arr[i])
            return i;
    }
    // need to return here// maybe -1 and check ?
    
}
