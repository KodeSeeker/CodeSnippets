
// call findIndex(str,0,dict.size(),dict)

public static int findIndex(String str,int begin, int end, Map<Integer,String> dict)
{
  
  int mid =(begin+end)/2;
  
  String midString= dict.get(mid);
  
  if(str.equalsIgnoreCase(midString))
    return midString;
  else if(midString.compareToIgnoreCase(str)>0)
    return findIndex(str,0,mid,dict);
  else
    return findIndex(str,mid,end,dict);
}