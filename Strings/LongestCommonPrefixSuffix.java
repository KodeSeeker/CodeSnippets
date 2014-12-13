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
                    max=i;
            }
    }
    
     return s1.substring(0,max);
    }



public String findLongestCommongPrefixSuffix(String s1,String s2)
{
	if( s1==null || s2==null)
		return null;
	char[] arr1= s1.tocharArray();
	char[] arr2= s2.tocharArray();

	char first = arr1[0]; 

	int len = Math.min(arr1.length,arr2.length);
	int j,k;
	int end=0;
	for(int i=0;i<len,i++)
	{
		if(first==arr2[i])
		{
			//possible match!
			j=i;
			while(arr1[k++]=arr[j++])
			{
				if(j+1==len)
				{
				 // we have inspected the entire second string.
				end=k;
				break;
				}
			}
		}
		if(end!=0)// we inspected a suffix in entireity.
			break;
	}
	StringBuilder ret = new StringBuilder();
	for(int i=0;i<=end;i++)
	{
		ret.append(arr1[i]);

	}
	
	return ret.toString();
}


