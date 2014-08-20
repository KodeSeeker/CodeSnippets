public String findLongestCommonPrefixSuffix(String s1, String s2) {
     
     //Updated with simpler logic.
    if (s1.equals(s2))
    {
            return s1; //or s2
    }
    int minLen=Math.min(s1.length(),s2.length())
    
    int max=0;
    for(int i=0;i<minLen;i++)
    {
            if(s2.endsWith(s1.substring(0,i)))
            {
                    equals=true;
                    max=i;
            }
    }
    
     return s1.substring(0,max);
    }
