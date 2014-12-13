/**
Given two strings check if they are isomorphic.
Example:
Given "foo", "app"; returns true
   we can map 'f' -> 'a' and 'o' -> 'p'
Given "bar", "foo"; returns false
   we can't map both 'a' and 'r' to 'o'

Given "turtle", "tletur"; returns true
   we can map 't' -> 't', 'u' -> 'l', 'r' -> 'e', 'l' -> 'u', 'e' -'r'

Given "ab", "ca"; returns true
   we can map 'a' -> 'c', 'b
**/

// Approach is to use two hashmaps

public boolean isIsoMorphic(String a, String b)
{
    if(a==null && b==null || (a.isEmpty() && b.isEmpty())
        return true;
     if(a.isEmpty() ||b.isEmpty())
         return false;
      if(a.length()!=b.length())
          return false;
      Map<Character,Character> mapAtoB= new HashMap<Character,Character>();
      
      int i=0,j=0;
      
      while(i < a.length() && j<b.length())
      {
          charA =  a.charAt(i);
          charB=  b.charAt(j);
          
         if(mapAtoB.containsKey(charA))//mapping already exsists.
         {
             if(charB!=mapAtoB.get(charA))//is mapping valid?
                 return false;
                         
         }
         
         else //no mapping yet.
         {
              mapAtoB.put(charA,charB);
         }
         
       }
       
       return true;
}
