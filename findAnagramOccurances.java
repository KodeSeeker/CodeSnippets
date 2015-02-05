public static int findOccurances(String word, String text)
{
  //basic error checking steps.
  if(word.length()>text.length())
    return -1;
  int count=0;
  Map<Character,Integer> wordMap=createMap(word);
   
  int i,j;
  j=word.length()-1;
  Map<Character,Integer> txtMap=createMap(tx.substring(0,j));// substring is exclusive of endIndex and inclusive of startIndex!
  //i=0 here 
  while(j<text.length())
  {
    char c=text.charAt(j);
    if(txtMap.containsKey(c))
      txtMap.put((c), map.get(c)+1);
    else
       txtMap.put((c),1);
    
    //compare the maps
    if(Map.equals(txtMap,wordMap))
      count++;
    
    // after comparison we need to remove the first character!(marked by i)
    txtMap.put(text.charAt(i),map.get(text.charAt(i))-1);
    //increment counters!
    i++;
    j++;
    
  }
  
  return count;
  
}
  /**
 	Method that creates a word map for a given word.
**/
   static Map<Character,Integer> createMap(String in)
  {
    Map<Character,Integer> map=new HashMap<Character,Integer>();
    char[] chars= in.tocharArray();
    for( Character c:chars)
    {
      if (map.containsKey(c))
        map.put(c,map.get(c)+1);
      else
        map.put(c,1);
    }
    
    return map;
  }
