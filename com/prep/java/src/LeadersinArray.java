/*
Write a program to print all the LEADERS in the array. An element is leader if it is greater than all the elements to 
its right side. And the rightmost element is always a leader. For example int the array {16, 17, 4, 3, 5, 2}, 
leaders are 17, 5 and 2.
*/
//Approach- Scan from Right to Left . last element is always leader.

void printLeaeders(int[]  iinput){
  
  if (input== null)
    return ;
  int len=input.length;
  Sysout.print(input[len-1]);// last element is always a leader.
  // now walk from right to left.
  //store max from right . 
  int max_from_right=input[len-1];
  
  
  for(int i=len-2;i>=0;i++)
  {
    if (input[i]>max_from_right)
     {
       Sysout.print(input[i]);
      max_from_right=input[i];//update max
       
     }
  }
}