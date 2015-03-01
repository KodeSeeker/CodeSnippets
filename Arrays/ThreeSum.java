/**
When supplied a target Efficiently check whether there are three values that sum up to the target in the input sorted array.
Three sum problem
**/

public boolean threeSum(int[] arr, int target)
{

	if(target > arr[length-1])
		return false;
	int len = arr.length;
	for(int i=0;i <=len-2;i++) {{
		
		int start =i+1;
		int end = len-1;
		while(start <end ) {

			int tempSum= arr[i]+arr[start]+arr[end];
			if(tempSum == target) {
				return true;// we found the target return true.
			}
			else if (tempSum < target){
				start++;
			}
			else if (tempSum >target){
				end--;
			}
		}
	}			
	return false;// no 3 values sum up to target :-(.
}
