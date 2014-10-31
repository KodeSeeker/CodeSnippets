/**
Given an array containing only stars '*' and hashes '#' . Find longest contiguous sub array that will contain equal no. of stars '*' and hashes '#'. 
**/
	

public int longestLength(String in)
{
  
  char[] chars = in.tocharArray();
  int [] aux= new int[chars.length];
  
  
  //create aux array
  aux[0]=(chars[0]=='*'?+1:-1); //+1 for * and -1 for #.
  int val=aux[0];
  
  for (int i=1;i<chars.length;i++)
  {
    if(chars[i]=="*")
    {
      aux[i]=aux[i-1]+1;
    }
    if(chars[i]=="#")
    {
      aux[i]=aux[i-1]-1;
    }
  }
  
  // now we have to find the longest sequence so far. 
  //Using a map to find the 'remember ' the longest sequence so far. 
  
  HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();//aux[i],i

  int max_dist=-1;;  
  for (int i=0;i<aux.length;i++)
  {
    if(aux[i]==0)
      max_dist=i;
    if(map.contains(aux[i]))
      max_dist=Math.max(max_dist,i- map.get(aux[i])-1);
    else
      map.put(aux[i],i);
  }
  
}
