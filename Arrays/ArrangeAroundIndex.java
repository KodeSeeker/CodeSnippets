

int[] arrangeAroundIndex(int idx,int[] arr) {

	int pivot = arr[idx]
	
	int start =0; 
	int equal =0;
	int larger=arr.length-1;

	while(equal<=larger) {

		if(arr[equal]<pivot) {
			int tmp= arr[equal];
			arr[equal]=arr[start];
			arr[start]=arr[equal];
			start++;
			equal++;
		}
		else if(arr[equal]== pivot){
			equal++;
		}
		else if (arr[equal]>pivot){
			int tmp=arr[equal];
			arr[equal]=arr[larger];
			arr[larger]=tmp;
			equal++;
			larger--;
		}
	}
}
