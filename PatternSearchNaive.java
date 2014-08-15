/**
 * Given a text txt[0..n-1] and a pattern pat[0..m-1], write a function search(char pat[], char txt[]) 
 * that prints all occurrences of pat[] in txt[]. You may assume that n > m. 
 * E.g.
 * txt=  "THIS IS A TEST TEXT"
  *  pat = "TEST"
  Output : Pattern found at index 10
  */
  public int findPattern(String txt, String pat)
  {
   if (txt== null )
    return -1;
    if (pat==null)
    return -1;
   char[] txtChar = txt.tocharArray();
   char[] patchar=pat.tocharArray();
   
 
   //Algo: move pattern over the search text in a  window.
   for(int i=0;i< txtChar.length-patChar.length; )
   {
        int j=0;
        for(j<patChar.length;j++)
        {
            if(txtChar[i+j]!=patChar[i+j])
                break;
        }
        if(j==patChar.length)
        {
            Sytem.out.println("MAtch found at"+i );
            break;
        }
        
   }
   
   
   
  }