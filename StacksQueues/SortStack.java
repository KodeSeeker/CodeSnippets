 public static Stack<Integer> sort(Stack<Integer> s) {

        if (s.isEmpty()) {
         return s;
       }
      //pick random picot
	 int pivot = s.pop();

       // partition
       Stack<Integer> left  = new Stack<Integer>();
       Stack<Integer> right = new Stack<Integer>();
       while(!s.isEmpty()) {
         int y = s.pop();
         if (y < pivot) {
           left.push(y);
         } else {
           right.push(y);
         }
       }
       sort(left);
       sort(right);

       // merge
       Stack<Integer> tmp = new Stack<Integer>();
     //push  right first and then left for descending! 
      while(!left.isEmpty()) {
         tmp.push(left.pop());
       }
       tmp.push(pivot);
       while(!right.isEmpty()) {
         tmp.push(right.pop());
       }
       while(!tmp.isEmpty()) {
        // System.out.println(tmp.pop());
    	   s.push(tmp.pop());
       } 
       return s;
     }
