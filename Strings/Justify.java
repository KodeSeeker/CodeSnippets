
public class Justify {

	
	public void justifyText(String[] lines, int width)
	{
		if(lines== null || width <0)
		{
			System.out.println("Incorrect Input parameter");
			return;
		}
			
		for(String line:lines)
		{	//line length has to be less than width.
			if(line.isEmpty())
			{
				System.out.println("Skipping Empty Line!");
				continue;
			}
			int len = line.length();
			if(len >width)
			{
				System.out.println("Indent width is too small");
				return;
			}
			//width<=len.
			int numOfSpacesToBeAdded=width-len;
			//finding the number of "gaps"
			int gapCount=0;
			for (char c:line.toCharArray())
			{
				if(c==' ')
					gapCount++;
			}
			
			//how many spaces to each gap? gapCount/numofSpacestobeAdded
			int numofSpacesToEachGap=gapCount/numOfSpacesToBeAdded;
			//leftoverspaces 
			numOfSpacesToEachGap+=gapCount%numOfSpacesToBeAdded;
			//add the extra spaces after each word
			String[] words= line.split("//s+");
			StringBuilder justifiedText= new StringBuilder();
			
			for(int i=0;i<words.length-1;i++)
			{
				int tmp=numofSpacesToEachGap;
				justifiedText.append(words[i]);
				while(tmp>0)
					{
						justifiedText.append(" ");
						tmp--;
					}
			}
			System.out.println(justifiedText);
		}
			
	}
}
