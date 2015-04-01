/**
The strstr function locates a specified substring within a source string.
 Strstr returns a pointer to the first occurrence of the substring in the source. 
If the substring is not found, strstr returns a null pointer.
**/


int substringIndex(String source, String pattern) {
	
		if((source == null && pattern == null) || (source.length() ==0 && pattern.length() ==0))
			return 0;
	
		char[] sourceArr= source.toCharArray();
		char[] pArr= pattern.toCharArray();
	
		int i =0,j=0,tmpStartIndex =-1;

		while(i <sourceArr.length) {
			//skip all characters that are in source that are not needed!
			int j=0;// so that we start from the beginning of pArr for each index in source. 
			int tmpStartIndex =i;// prospective startIndex
			if(sourceArr[i] != pArr[0]) {
				i++;
				continue;
			}	
			
			while(sourceArr[i] == pArr[j] & j < pArr.length ) {// keep checking till end of pattern.

				i++;
				j++;
			}

			if( j==pArr.length -1) { // we got to the end of the pattern for this value of tmpStartIndex. So return it!

				return tmpStartIndex;
			}
		}
			
		
		return -1;// pattern was not found in source!

}

