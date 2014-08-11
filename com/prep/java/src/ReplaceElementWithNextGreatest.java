/*
Given an array of integers, replace every element with the next greatest element (greatest element on the right side) in the array. 
Since there is no element next to the last element, replace it with -1. For example, if the array is {16, 17, 4, 3, 5, 2}, 
then it should be modified to {17, 5, 5, 5, 2, -1}.
*/

// O(n) run time 
int[] replaceNextGreaterElement(int[] in){
    if(in==null)
        return null;
    //the last element in the array will always be -1 as there is no element to the right of it.
    // the last element is the greatest from the right at this point.
    int max_from_right=in[in.length-1];
    in[in.length-1]=-1;
    
    //now walk from right to left.
    for(int i =in.length-2;i>=0;i--)
    {
        //store current element in temp.
        int temp=in[i];
        in[i]=max_from_right;
        
        //update max if needed 
        if(temp>max_from_right)
        {
            max_from_right=temp;
        }
    }
    
    return in;
}

//adapted from geeksforgeeks
