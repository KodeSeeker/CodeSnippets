
public int SqRoot(int num)
{
  if(num<0 || num>INTEGER.MAX_VALUE)
    throw new Exception();
  
  int high=num;
  int low=0;
  
  int mid =Math.floor((low+high)/2);
  
  while(low+1<high)
  {
    
    if(mid*mid==num)
      return mid;
    else if (mid>num)
      high=mid;
    else
      low=mid;
  }
  
  return low;// if mid*mid never becomes num.
}