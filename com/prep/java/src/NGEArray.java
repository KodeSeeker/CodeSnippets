// Core idea is to use space to improve over the brute force appraoch

// Use a stack to store elements < current.

public void printNGE(int [] arr)
{
    
    int len= arr.length;
    Stack<Integer> nums= new Stack<Integer>();
    if len==0
        return;
    nums.push(arr[0]);// store arr[0] in the array.
    // look at the rest of the array.
    int element,next;
    for (int i=1;i<len;i++)
    {
        
        next= arr[i];
        
        element =nums.pop(); // get top from stack
        while (element< next)
        {
            System.out.print(" Pair" element+ " "+next);
            //check if the stack is empty. if yes: break else set elem for next iteration
            if (nums.isEmpty())
                break;
            element=nums.pop();
        }
        if (element> next)
        {
            nums.push(element);//push back element if it is less than the next!
        }
        
        nums.push(next); //push next on to stack for future inspection.
        
    }
    
    
  // If stack is still not empty-- then these elements dont have a next greater value!
  while(!nums.isEmpty())
    {
        System.out.print("Pair" + nums.pop()+ "  -1");
    }
} 