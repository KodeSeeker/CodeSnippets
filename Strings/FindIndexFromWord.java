
// call findIndex(str,0,dict.size(),dict)

public static int findIndex(String str,int begin, int end, String[] dict)// assume dict has alphabetic ordering!
{
  
  int mid =(begin+end)/2;
  String midString= dict[mid];

  if(str.equalsIgnoreCase(midString))
    return mid;// the index.
  else if(midString.compareToIgnoreCase(str)>0)
    return findIndex(str,0,mid,dict);
  else
    return findIndex(str,mid,end,dict);
}
