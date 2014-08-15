public static boolean IsRotatePalindrome(String in)
	{
		for(int i=0; i<in.length();i++)
		{
			String left = in.substring(0, i);//the first substring method accepts 2 values, 1st is index, 2nd is length
			String right = in.substring(i);//the overloaded substring method accepts the starting index as the only argument
			//now use our palindrome method to check right+left
			if(IsPalindrome(right+left))
				return true;//immediate return as a true rotated palindrome when we find one
		}
		return false;//do not forget to return a default false value if no true signal is returned
	}


public static boolean IsPalindrome(String in)
  {
		char[] ins = in.toCharArray();
    		for(int i=0; i<=ins.length/2;i++)
		{
				if(ins[i]!=ins[ins.length-1-i])
				return false;//any mismatch will cause an immediate false signal return
		}
		//if we come here that means the string passed all check for pairs, so it is a palindrome
		return true;
  }