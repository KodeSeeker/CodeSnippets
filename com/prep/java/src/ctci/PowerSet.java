/** 
Prints the power set of a given set.
**/

public class powerSet{
	
	Set<Character> s= new HashSet<Character>();
	

	public void printPowerSet(Set<Character> s)
	{
		int size = s.size();
		
		int combs= Math.pow(2,size);
		Set <Character> pow= new HashSet<Character>();

		// to  get an element from the set . dump it to an array.
		char[] chars = new chars [s.size()];
		int mark=0;
		Iterator< Character> iter = s.iterator();
		while(iter.hasNext())
		{
			chars[mark++]=iter.next();
		}

		// now check which one of the combinations belongs to the power set.
		for (int count=0;count<combs;count++)
		{
			for(int j=0;j<size;j++)
			{
				if(count && (1<<j))
					{	
						pow.add(chars[count]);

					}
			}
		}
	} 


}
