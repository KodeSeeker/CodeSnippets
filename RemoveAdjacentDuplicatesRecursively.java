


/**

Simple process.
1 . IF String is of length<=1. Then no dups -> base case.

2. Iterate through remaining string. In form of character array
If chars[i] == chars[i+1];
	char[] before = value  chars(0 to i );
	char[] after = value chars(i+2 to  chars end);
	combine before and after and recurse on it. till you hit the end .

3. Return chars ( all adjacent duplicates should have been removed at this point).
  
**/
public static String removeDuplicate(String string) {
    if(string == null) return null;
    return String.copyValueOf(removeDuplicate(string.toCharArray()));
}

public static char[] removeDuplicate(char[] chars) {
    if(chars.length < 1) return new char[0];
    else if(chars.length == 1) return chars;

    for(int i=0; i<chars.length-1; i++) {
        if(chars[i] == chars[i+1]) {
            char[] before = Arrays.copyOfRange(chars, 0, i);
            char[] after = Arrays.copyOfRange(chars, i+2, chars.length);
            char[] combined = new char[before.length + after.length];
            System.arraycopy(before, 0, combined, 0, before.length);
            System.arraycopy(after, 0, combined, before.length, after.length);
            chars = removeDuplicate(combined);
            break;
        }
    }
    return chars;
}

