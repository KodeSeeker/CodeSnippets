/**
Given a histogram find the max volume of water accumulated in the histogram.

/*
Image URL for representation :http://www.darrensunny.me/wp-content/uploads/2014/04/Rain-Water-Trap.png

Algo: From  left  compute the max of the current element and the elements on the left. and store in array : maxLeft[]
From right move left and compute the max of current element and the element on right 
for each element and store in array: maxRight[].

The amount of water above each element is Min(maxleft[i],maxRight[i])-hist[i].

Assumption width of each histogram bar is 1.

Time complexity: O(n).
**/



int maxWaterHistogram(int[] hist) {


	if(arr == null)
		return -1;
	int volume=0;
	int[] maxFromLeft = new int[arr.length];
	int [] maxFromRight = new int [arr.length];
		
	for(int i=0; i<hist.length;i++) {
		maxFromLeft[i] = (i ==0? hist[i] : Math.max(hist[i], maxFromLeft[i-1]));
	}
	
	for(int i= hist.length-1; i>0; i--) {
		maxFromRight[i] = (i == hist.length -1 ? hist[i] : Math.max(hist[i], maxFromRight[i+1])); 

	//iterate over the entire array. 
	for(int i=0;i<arr.length;i++) {
		volume + =Math.abs( Math.min(maxFromRight[i], maxFromLeft[i]) - hist[i]);
	} 

	return volume;
}
