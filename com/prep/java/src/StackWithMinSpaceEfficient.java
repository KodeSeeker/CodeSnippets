/*The previous implementation stores the minimum element seen so far at each node. The new approach reduces duplication.
It does not store duplicate minimums, and as we are looking only for the lowest minimum, this approach should suffice. */

  public class StackWithMin2 extends Stack<Integer> {
    Stack<Integer> min;
    public StackWithMin2() {
      min = new Stack<Integer>();
    }
    
    /* Push function checks if the value being pushed is lower than current min, if yes, then it is pushed to the min stack
    as well. Else its pushed only to the main stack and not to the min stack*/
    public void push(int value){
      if (value <= min()) {
        min.push(value);
      }
    super.push(value);// main stack.
    }
    
    /* Pop from the main stack, and if the popped value is equal to the minimum value, then pop from the min stack as well.
    */
      public Integer pop() {
        int value = super.pop();// pop from the main stack
        if (value == min()) {
         min.pop();// pop from the min stack.
        }
        return value;
       }
    
    // min function checks the min stack, if empty, then prints out an Error value. 
    //else returns the top of min stack using peek().
    public int min() {
      if (min.isEmpty()) {
       return Integer.MAX_VALUE;
      }
      else {
        return min.peek();
      }
    }
}