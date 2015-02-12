/**
Find the largest rectangle area in  histogram .
Simply use a stack to persist the index of all the heights in the stack in descending order .Calc max height
whenever you need to push a index with lesser height on the stack. 
**/


int findMaxAreaHistogram(int[] hists) {

	if(hists == null)
		return -1;

	Stack<Integer> indexes = new Stack<Integer>();

	//inspect every integer of hist.
	for( int i=0;i<hists.length; i++) {
		
		 if(indexes.isEmpty() || hist[i] >hists[indexes.peek()] {
			indexes.push(i);
		}
		else { // this means we encountered a value that has lesser value than the peek.
			// need to calculate max area.
		int tmpIndex = indexes.pop();
		int tmpArea=hists[tmpIndex] * (indexes.isEmpty() ? i :i-indexes.peek()-1);
		
		if(tmpArea>maxArea)
			maxArea=tmpArea;
		}
	}

	//inspect area with respect to left over indexes  in stack to see if we can maximize the area more,

	while(!indexes.isEmpty())
	{
		          // need to calculate max area.
                int tmpIndex = indexes.pop();
                int tmpArea=hists[tmpIndex] * (indexes.isEmpty() ? i :i-indexes.peek()-1);
                
                if(tmpArea>maxArea)
                        maxArea=tmpArea;
                
	}


	return maxArea;
}




