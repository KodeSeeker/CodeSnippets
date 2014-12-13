/**
Use Moore's  counting algorithm to find a candidate.
Then check if the  candidate occurs more than 50% of the time.
**/

public int findCandidate(int[] in)
{
  if(in==null)
    return -1;
  
  // keep a variable to track the majority index.
  int maj_index=0;
  int count =1;
  
  for(int i=0;i<in.length;i++)
  {
    if(in[maj_index]==in[i])
    {
      count++;
    }
    
    else
    {
      count--;
    }
    //count dropped to zero! So new maj_index.
    if (count==0)
    {
      maj_index=i;
      count=1;
    }
    return in [maj_index];
  }
}
public int checkCandidate(int [] arr)
{

  int cand=  findCandidate(arr);
  int count=0;
  for(int i=0;i<arr.length;i++)
  {
    if (arr[i]== cand)
    {
      count++;
    }
  }
  
  if(count>=(arr.length/2))
    return cand;
  else
    return -1;// no majority element :(
}
