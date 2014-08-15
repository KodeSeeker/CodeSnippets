

public static boolean isIdenticalBST(int [] a, int [] b, int len, int m1, int m2, int min, int max)
{
  //1. Find the point in the BST that conforms to the BST criterion
  int i=0,j=0;
  for(;i<len<i++)
  {
    if(a[i]>min && a[i]< max)
      break;
  }
  
  for(;j<len<j++)
  {
    if(a[j]>min && a[j]< max)
      break;
  }
  
  // we found two spots that meet the BST criterion
  //if both  the elements are leaves, then we return true.
  if(i==n && j==n)
    return true;
  
  /*
  Return false if only one of them is the last element or if the values are not equal
  */
  
  if((i==n^j==n) &&(a[i] !=b[j]))
    return false;
  
    return isIdenticalBST(a,b,len,i+1,j+1,min,a[i]) &&  isIdenticalBST(a,b,len,i+1,j+1,a[i],max) ;
  
  
  
}


public void wrapperWithoutBuilding(int[] a,int [] b)
{
  if (a.length!=b.length)
    return;// not same length,so not BST's
  
  Sysout ("Are BST's identical"+isIdenticalBST(a,b,a.length,0,0,Integer.MIN_VALUE,Integer.MAX_VALUE,));
  

}


/*
Recursive function to check if two BT's are equal/
Building trees. 

Intuitive
*/

public boolean IsEqualBT(Node root1,Node root2)
{
  if(root1==null && root2 ==null)
    return true;
  return(root1.data== root2.data &&(IsEqualBT(root1.getRight(),root2.getRight())
                                    && IsEqualBT(root1.getLeft(),root2.getLeft())));
}
}