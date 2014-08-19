/**
 * Sorting approach
 * Sort each letter from the input.Keep sorted word as the key with a list of strings that are anagrams.
 **/

public void groupAnagrams( String in)
{
    if (str==null)
        return;
    HashMap<String,List<String>> map = new HashMap<String,List<String>>();
    
    String [] str= in.split(,);
    
    for (String s : str)
    {
        String tmp=s;
        char[] schars= s.tocharArray();
        
        Arrays.sort(schars);// sorted each string. 
        String newStr=new String(schars);
        List<String> strList= new ArrayList<String>();
        if(map.contains(newStr))
        {
            strList= map.get(newStr);
            
        }
       strList.append(tmp);
       map.put(newStr,strList);
        
    }
    
    // so now map has the following entries
    // {"aab",["aab","baa","aba"])
    for(Map.Entry<String,List<String> entry: map.entrySet())
    {
        List <String> entryList= entry.getValue();
        for(String s: entryList)
        {
            System.out.print(s);
        }
        System.out.println();
    }
}

    /**
     * One other approach to avoid sorting would be to create a charMap. to acheive the effect of a sorted key
     * */

public groupAnagrams(String str)
{
    char[] strArray= str.split(",");
    
    Map<List<Integer>, List<String>> map = new HashMap<List<Integer,List<String>>();
    for (String s: strArray)
    {
        int[] charMap= getCharMap(s);
        List<Integer> charList= Arrays.asList(charMap);
        List<String> strList= new ArrayList<String>();
        if(map.contains(newStr))
        {
            strList= map.get(charList);
            
        }
       strList.append(tmp);
       map.put(charList,strList);
    }
}
//abba returns [a-2,b-2]
public int[] getCharMap(String s)
{
    int[] map= new int[26];
    for (char c: str.tocharArray())
    {
        map[(int)c]++;// updates the count of the character 
    }
    
    return map;
}