/**
Find the longest common subsequence between 2 sequences
LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.

Uses Dynamic Programming to find the length of the  Longest Common Subsequence.

1) Consider the input strings “AGGTAB” and “GXTXAYB”. Last characters match for the strings. So length of LCS can be written as:
L(“AGGTAB”, “GXTXAYB”) = 1 + L(“AGGTA”, “GXTXAY”)

2) Consider the input strings “ABCDGH” and “AEDFHR. Last characters do not match for the strings. So length of LCS can be written as:
L(“ABCDGH”, “AEDFHR”) = MAX ( L(“ABCDG”, “AEDFHR”), L(“ABCDGH”, “AEDFH”) )
**/


public  static int LCS(char[] X , char [] Y, int m, int n)// m is the length of X  and n is the length of Y.
{

    if(m==0 && n==0)
        return 0;
    int[][] LCS= new int [m+1][n+1];
     
    for(int i=0;i<=m;i++)
    {
        for(int j=0;j<=n;j++)
        {
            if(i==0||j==0)
                LCS[i][[j]=0;
            if(X[i-1]==Y[j-1])
                LCS[i][j]=LCS[i-1][j-1]+1;
            else
                LCS[i][j]=Math.max(LCS[i-1][j],LCS[i][j-1]);           
        
        }
    }
    
    return LCS[m][n];
}
