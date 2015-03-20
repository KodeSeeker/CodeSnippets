//Basic idea: the index of the smallest element is the indicator of the number of rotations in the rotated sorted
//array.
//return -1 for error condition

int findNumRotations(int input[]){

 int high =input.length-1;
 int low =0;
 //exit condition for binary search.
  while(low<=high){
  int mid=(low+high)>>>1;
  int prev=(mid-1)%len;
  int next=(mid+1)%len;
  if (input[low]<input[high])
    return low;
    
    // this is the exit condition-> only the smallest element will have
    //a greater element both before and after it.
  else if(input[mid]<input[prev] &&input[mid]<input[next])
    return mid;
  // eliminate the upper half if its sorted.Because if sorted it cannot contain the lowest element in a sorted position
  else if (input[mid]<input[high])
    high=mid-1;
  // eliminate the lower half if its sorted.Because if sorted it cannot contain the lowest element in a sorted position
  else if(input[low]<input[mid])
    low =mid+1;
  }
  
  return -1;// this will be reached only in case of bad input.
}
