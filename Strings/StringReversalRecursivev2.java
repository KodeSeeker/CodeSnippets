	/**
	 * 
	 * @param String
	 */
	
	public static void reverseStringRecursively(String a)
	{
		
		if(a.length()==1)
		{
			System.out.print(a);
			return; 
		}
		
		reverseStringRecursively(a.substring(1));
		System.out.print(a.charAt(0));
	}
