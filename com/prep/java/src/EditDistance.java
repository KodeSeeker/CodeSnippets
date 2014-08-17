/**
 * Find the minimum edit distance required to convert a string  s1 to string s2.
 **/
 
 //Approach -dynamic programming. 
 //Complexity O (n^2)
 
public class EditDistance{
 
 public static int[] [] memo;// to track the edit distance so far.
 
 public static int getEditDistance (String s1, String s2)
 {
  if(a==null || b==null)
   return 0;
  int len1 = s1.length();
  int len2 =s2.length();
  memo = new int[len1][len2];
  int sol1,sol2,sol3;
  //Base case.
  for(int i=0; i <len1;i++)
  {
      memo[i][0]=s1.charAt(i);// build the matrix for len2=0 ie. len1 deletions.
  }
  
  for(int j=0;j <len2;j++)
  {
      memo[0][j]=s2.chartAt(j);// build the matrix for len1 =0 ie. len2 insertions.
  }
  
  for(int i=1;i< =len1;i++)
  {
      for(int j=1;j< =len2;j++)
      {
           if (s1.charAt(i-1)== s2.charAt(j-1))// if the last character seen so far matches 
           {
               sol1=memo[i-1][j-1];
               memo[i][j]=sol1;
           }
           
           else
           {
              sol1= memo[i][j-1];// insert  the last element from s2 to s1
              sol2= memo[i-1][j];// delete the last element in s1
              sol3= memo[i-1][j-1];// replace the last element in s1 with last element in s2.
              
              //update the costs to reflect current operation.
              
              sol1++;
              sol2++;
              sol3++;
              //populate value for current cell.
              memo[i][j]= Math.min(sol1, Math.min(sol2,sol3));
           }
      }
  }
 
 return memo[len1][len2];// the values should have been built up.
  }
 }
 
}

