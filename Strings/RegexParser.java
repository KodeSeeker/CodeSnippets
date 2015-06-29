/**
Greedy algorithm to implement a regex parser.

First checks ^ and then checks regex against each part of the text.

**/
/**
Design a regex parser.
**/


public boolean regexMatcher(String regex,String input)
{
    if(regex==null||input==null)
        throw new IllegalArgumentException();
    
    //case- starts with-^
    if (regex.charAt(0)=='^' && regex.length()>0)
       return regexPrefixMatch(regex.substring(1),input);
    
    
    //else match regex to each character in input string.
    
    StrinngBuilder in = new StringBuilder(input);
    for(int i=0;i<input.length;i++)
    {
        if ( regexPrefixMatch(regex,input.delete(0,i)))
		return true;
    }
}
  
  
public boolean regexPrefixMatch(String regex,String input)
{
     int regLength= regex.length();
     int inlength=input.length();
     StringBuilder reg= new StringBuilder(regex);
     StringBuilder in= new StringBuilder(input);
     
     char regexFirst=regex.charAt(0);
     
     if(inLength==0)// expression has been compltely parsed
         return true;
      
     if(regexLength==1 && regexFirst=='$')// case- $ - ends with.
         return (inLength==0);
     
     //case *
     if(regexLength>=2 &&reg.charAt(1)=='*')
     {
         for(int i=0;i<in.length();i++)
            {
                if(reg.charAt(i)!=in.charAt(i)|| reg.charAt(i)!='.')
                    break;
            
                 //assume you match i characters through the *-- now check  the i+1 characters
                 if( regexPrefixMatch(reg.delete(0,2),in.delete(0,i+1))
			return true;
            }
                 
          // the * matched 0 characters.
          return regexPrefixMatch(reg.delete(0,2),in);
    }
    
    //finallly match a single character.
    return ( in.length()!=0 && (in.charAt(i)==reg.charAt(i)||reg.charAt(i)=='.' ) && regexPrefixMatch(reg.delete(0,1),in.delete(0,1));
 }
