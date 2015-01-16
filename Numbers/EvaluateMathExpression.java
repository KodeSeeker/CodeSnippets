/*Smexy.
 Reference Link: http://www.sunshine2k.de/coding/java/SimpleParser/SimpleParser.html
Key idea is to use recursion. Using stacks will cause operator precedence issue and will need extra memory.
Important point: Order the operators in reverse order of precedence because recursion reverses the precedence.
Doesnt handle brackets though!
*/
// Sample Input :  1+3/3*4 -5=0

public static double evaluateExpression(String s)
{
  if (s.isEmpty())
    return -1;
  //reverse precedence.
  if(s.contains('-'))
    evaluateExpression(s.substring(0, s.indexOf('-')-1)) - evaluateExpression(s.substring(s.indexOf('-')+1);
   if(s.contains('+'))
    evaluateExpression(s.substring(0, s.indexOf('+')-1)) + evaluateExpression(s.substring(s.indexOf('+')+1);
   if(s.contains('*'))
    evaluateExpression(s.substring(0, s.indexOf('*')-1)) * evaluateExpression(s.substring(s.indexOf('*')+1);
   if(s.contains('/'))
    evaluateExpression(s.substring(0, s.indexOf('-')-1)) -evaluateExpression(s.substring(s.indexOf('-')+1);
  
  else
  {
    //No more operands, only a number
    return Double.parseDouble(s);
  }
}
}

