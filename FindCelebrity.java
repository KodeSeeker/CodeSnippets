/*
In a party of N people, only one person is known to everyone. Such a person **may** be present in the party, if yes, (s)he doesn’t know anyone in the party. We can only ask questions like “does A know B? “. 
Find the stranger (celebrity) in minimum number of questions.

We can describe the problem input as an array of numbers/characters representing persons
in the party. We also have a hypothetical function HaveAcquaintance(A, B) which returns true if A knows B, 
false otherwise. 
How can we solve the problem, try yourself first.

We measure the complexity in terms of calls made to bool HaveAcquaintance(int, int).
Algorithm
1. Push all the values onto a stack
2.Repeat
 Pop2 values from the stack and check if each one is acquaintace of the other
 Remove the one that has an acquaintce
Till stack has only 1 element(probable candidate)

3. Check that C doesnt know anyone 
  if anyone doesnt know c exit
*/

public int findCelebrity (int[] arr)
{
  
  Stack<Integer> st= new Stack<Integer>();
  for(int i=0;i<arr.length;i++)
  {
    st.push(arr[i]);
  }
  // all celebs in stack!
  
  
  while(st.size()!=1){
    
    int a= st.pop();
    int b=st.pop();
    if (HaveAcquaintance(a,b) && HaveAcquaintance(b,a))
	{
		continue; // a and b know each other . - they cannot be celebrities
	}
    if(HaveAcquaintance(a,b)
    {
      // a knows b.  a is not celebrirty
      st.push(b);
    }
    else if (HaveAcquaintance(b,a))
    // b knows a- b cannot be a celebrity.
      st.push(a);
  }
  // program finishes here if we know for sure there is a celebirity --> return st.pop.
  //at the end of this loop st will have only 1 element!
  int C= st.pop();
  for(int i=0;i<in.length;i++){// check if C is really the celebrity
    
    if(HaveAcquaintance(C,in[i]))
    {
      return -1; // C knows someone! No celebrity :(
    }
    if(!HaveAcquaintance(in[i],C))
    {
      return -1;// someone doesnt know C, thats bad. :(
    }
  }
  
  return C;
}
