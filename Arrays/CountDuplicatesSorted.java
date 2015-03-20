// Input is sorted.
public void countOccurancesWrapper(int key,int[] input){
    
    System.out.println("The occurances are"+countOccurances(key,input,0,input.length-1));
}

public int countOccurances(int key,int[] input, int startIndex,int endIndex){
    
    if(key<input[startIndex])
        return 0;// the key is smaller than the smallest element
    if(key>input[endIndex])
        return 0;// the key is greater than the largest element        
    // core exit condition 
    if(key==input[startIndex]&&key==input[endIndex])// all the elements in this sub array are =k
        return endIndex-startIndex+1;
    
    
    //binary search approach
  int  mid =(startIndex+endIndex)>>>1;

    if( input[mid]==key)// middle element is = k
        return 1+countOccurances(key,input,startIndex, mid-1)+countOccurances(key,input,mid+1,endIndex);
    // all key elements are greater than the mid, so eliminate lower half
    else if(key>input[mid])
        return countOccurances(key,input,mid+1,endIndex);
    // all key elements are less than the mid, so eliminate the upper half
    else if(key<input[mid])
        return countOccurances(key,input,startIndex,mid-1);
           
}
