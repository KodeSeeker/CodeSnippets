// print all valid combinations of a set of paranthesis provided a input number.

public void printCombinationsWrapper(int num){

    System.out.println("Combinations"+printParanthesis(num,num," "));
    
}

    public string printParanthesis(int leftRem,int rightRem, StringBuilder current{
    
    //edge cases
    if (rightRem<=0)// no more paranthesis to be printed out
        return current.toString();
        
    if(leftRem>0)
      { 
          printParanthesis(leftRem-1,rightRem,current.append("("));
          if(rightRem>leftRem)// imbalance between the right and leftrem so print Right
                printParanthesis(leftRem,rightRem-1,current.append(")"));
      }
    if(rightRem>0)//print out all the remaining right paranthesis
        printParanthesis(leftRem,rightRem-1,current.append(")");
      
      }
