public static boolean isAnagram(String s1, String s2)
    {
        boolean result = false;
        //Basic check for the length
        if(s1.length()!=s2.length())
            return result;
            
        char c1[]= s1.toLowerCase().toCharArray();
        char c2[]= s2.toLowerCase().toCharArray();
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();

        //Put chars from c1 in hashmap one by one. First with value as 1; then if the same letter is present as key then increment the value
        for (int counter = 0; counter<c1.length; counter++)
        {
            if(h.containsKey(c1[counter]))
            {
                int val = h.get(c1[counter]);
                h.put(c1[counter], ++val);
            }
            else
                h.put(c1[counter], 1);
        }

        //Remove chars from hashmap one by one as and when you encounter the chars in c2.
        for (int counter = 0; counter<c2.length; counter++)
        {
            if(h.containsKey(c2[counter]))
            {
                int val = h.get(c2[counter]);
                if(val==1)
                    h.remove(c2[counter]);
                else
                    h.put(c2[counter], --val);
            }
            else
                return result;
        }

        if(h.isEmpty())
            result = true;

        return result;
    }