/*key is to maintain a duplicate pointer of the parent string for every iteration, 
so that the index of match  can be returned!

*/

public int substring (String str, String target)
{
  if(target.trim.equals (""))
    return 0;// edge case
  
  int strLoc=0, targetLoc=0 strLocDup=0;// strLocDup is used to advancepointer in parent string.
  
  while(strLocDup>0)
  {
    strLoc=strLocDup;
    while(str.charAt(strLoc)!=null && target.charAt(targetLoc)!=null && target.charAt(targetLoc)==str.charAt(strLoc))
    {
      strLoc++;// we have a substring keep incrementing both
      targetLoc++;
    }
    if(target.charAt(targetLoc)==null)// target  has been traversed completely, so it is present in the string.
      return strLocDup;
    strLocDup++;// loop till we find the first match
  }
    return -1;// target not present in string.
}