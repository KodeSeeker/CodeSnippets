/**
Given a value N, if we want to make change for N cents, and we have infinite supply of each of S = { S1, S2, .. , Sm} valued coins, how many ways can we make the change? The order of coins doesn’t matter.
**/


//Two approaches.
//Recursive approach- Recursively check keeping current coin and excluding current coin

//S- set of denominations
//m- number of denominations - ie. length of S
//n- cents
public int countWays(int[] S, int m,int n)
{

    if(n==0)
        return 1;// you can return 0 cents in only one way.
    if(n<0||m<0)
        return 0;
    if(n>=1&& m<=0)
        return 0;
   //count ways keeping m-1th coin and ignoring m-1th coin.
   return countWays(S,m-1,n)+countWays(S,m,n-S[m-1]);
 }
 
 
 //Dynamic Programming approach
 
 public int countWays(int[] S, int m, int n)
 {
 
     int[] table= new int[n+1];
     //base case.
     table[0]=1;
     
     // now find the number of ways each of the m coins can be used to form n.
     
     for(int i=0;i<m;i++)
     {
         for(j=S[i];j<=n;j++)
         {
             table[j]+=table[j-S[i]];
         }
      }
      
      return table[n];
 }   
