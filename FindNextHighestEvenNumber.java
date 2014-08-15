/*Given a number N, find the smallest even number E such that E > N and digits in N and E are same.
Print NONE otherwise.
Sample:
Input
N = 34722641
Output
E = 34724126
Input
N = 8234961
Output
E = 8236194 (instead of 8236149)
Java solution*/
/*
Constraints: Input Integer.MAX_VALUE and 0.

Algo(BAd Time complexity because we are  looking at every number after N till we reach E):
1. Validate input.
2.Compute a numberMap(cheat for hash) array that holds what digits are presentin array.
3. If (input- even increment by 2, check if number  has same number Map)
4 If (input odd , increement by 1, check if same numMap)


Better Algo:
1. Validate Input.
2. Generate all permutations of the input . Store in Hash
3. E= get from Hash , check if e%2 ==0 && e>N
    return E.
  4. Return none.
  
  */
  
StringBuffer sb= new StringBuffer(); //global
Set<String> set= new HashSet<String>();
boolean [] used;
private String permuteString;

public void printNextgreatestEven(int num)
{
  if(num<0)
    print "Error";
 
  Set <String> s= getPermutations(num);
  Iterator it = s.iterator();
  boolean hasPrined=false;
  while(it.hasNext())
    {
      
      int E=it.getValue();// permutation of N
      if(N>E && E%2==0 && !hasPrinted)
        {print(E);
         hasPrinted=true;
         return;
        }
    }
  if(!hasPrinted)
    {
        print ("None");
        return;
    }
  
}


 Set<String> getPermutations (int in)
 {
   String s=""+in;/// convert to String;
     Set<String> set= new HashSet<String>();
   if( s.length==1)
    {
      set.add(s);
      return set;
    }
    permuteString=s;   
    used= new boolean[s.length];// set globals for perumutation.
    set= Permutations();
    return set;
 }
 
 Set<String> Permutations();
 { // base case
    
   if(in.length==sb.length)
    {
      set.add(in);
    }
    
    for(int i=0;i<in.length;i++)
    {
      if(used[i])
        continue;
      sb.append(in[i]);
      Permutations();
      used[i]= false; // to reuse the character for next permutation.
    }
   
   
 }
 
 
 
 
 
 
 /** Best Algo:
  * Assume input is in the form of a string. 
  * Treat each character separately as a digit.
  * 1.Look at all the digits left to right.
  *     If the order is strictly increasing. Then the next highest number is not possible 
  * with the the current digits e.g. 4321
  *  Else find the number which decreases. E.g  329754. Here 2  is smaller than 9 on its right . 
  *     Swap 2 and the next smallest number on its right. 
  *     
  *     Sort the numbers on the right in increasing order. -> 349752 -> sort the part after the swap so it becomes 342579
  * /
  *     