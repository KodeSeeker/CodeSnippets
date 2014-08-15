/**
 * Convert standard infix to postfix for example a +b*c -d. =>abc*+d-
 * 
 * Assume every operator has  a standard value and a priority (based on BODMAS).
 * Keep a stack for operators and as you walk through the input expression and see an operator
 *  If opStack is empty add to it. If operator seen has greater priority than top(opStack) push op to stack.
 * 
 * If you see an operator with lower precendence then pop contents from stack and add to output string. and push new op to stack.
 * If end of string has been reached append contents of stack to output string.
 * 
 * */
 
 
 
 public String infixToPostfix(String in )
 {
     StringBuilder out= new StringBuilder();
     Stack<Operator> ops = new Stack <Operator>();
     
     //walk through input .
     char [] chars = in.tocharArray();
     for (char c: chars)
     {
         if (!c.isOperator())
         {
             out.append(c);
         }
         else
         {
             if (ops.isEmpty())
                ops.push(c);
             else
             {
                 Operator top= ops.peek();
                 Operator tmp= new Operator(c);
                 if (tmp.priority>=top.priority)
                    ops.push(tmp);
                 else
                 {
                     while(tmp.priority<top.priority)
                     {
                         ops.pop();
                         out.append(tmp);
                         tmp=ops.peek();
                     }
                 }
             }
             
           
         }
         
     
       while(!ops.isEmpty())// left over operators!!
            {
                out.append(ops.pop());
            }
            
            return out.toString();
 }