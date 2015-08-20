/**
EPI 6.8

**/

static int findMinBatteryCapacity (int[] heights){

	int capacity= INTEGER.MIN_VALUE;
	int minHeight=0;

	for (int i=0;i<heights.length;i++){
		int capacity= Math.max(capacity, heights[i] -minHeight);
		int minHeight = Math.min(heights[i],minHeight);
	}
	
	return capacity; 

}

