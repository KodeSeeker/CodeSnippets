//My version of the solution is to count the no. of zeroes(say x) and ones(say y).
//Once you do that, place x zeroes in the array followed by y 1s. This makes it O(n).

int[] performSort(int[] inputArr){
	int[] outArr=new int[inputArr.length];
	int zeroCount=0;
	for(int i=0;i<inputArr.length-1,i++){
		if(inputArr[i]==0)
			zeroCount++;
			
	}
	for(int i=0;i<outArr.length;i++){
		if(zeroCount>0){
			outArr[i]=0;
			zeroCount--;
		}
		else{
			outArr[i]=1;
		}
	}
	
	return outArr;
}