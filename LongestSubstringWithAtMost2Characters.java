/**
Find the longest substring in a string that has at most 2 different characters. -->Google.
cabanvnaaaabaa->aaaabaa

KEY approach: 
http://www.quora.com/How-can-we-find-the-longest-substring-with-at-most-two-different-characters-of-a-given-string-in-O-n
All that you need to solve this problem is to scan the string and keep track of:

1) Which are the two most recent characters
2) When was the last time the characters appeared in the string
3) The longest two-character substring ending at the current character

**/

public String longestWith2CharactersSubstring(String input)
{
    if(input.isEmpty()||input==null)
        throw new IllegalArgumentException();
     //bookkeeping variables,
     char charA='#'; //flag variable.
     char charB='#';
     int maxsubStringLength=-1,substringLength=-1;
     int lenA=0,lenB=0;// variables that keep track of the last time we saw A and B. ie. if 'a' is your current character 
                       //lenA=0 and lenB=1.
                
      int subStringStart,subStringEnd;          
                
     for(int i=0;i<input.length;i++)
     {
         //inspect each character.
         char currentChar=input.charAt(i);
         //check against current set of two characters.
         if  (currentChar==charA)
         {
             lastA=0;
             lastB++;
         }
         if(currentChar=charB)
         {
             lastB=0;
             lastA++;
         }
         
         
         //what if we see a new character?-- update variables accordingly.
         else if(lastA<lastB)// we saw 'a' after we saw b- so B should be removed -case.
         {
            subStringLength=lastB;
            lastA++;// we didnt see 'a' so we update a's counter.
            charB=currentChar;//assign 'c' to charB
            lastB=0;//set lastB to 0 as we just saw it.
          }
          //conversely if we saw 'b' after we saw'a' and we now have 'c', so 'a' should be removed case.
         else if(lastB<lastA)
         {
             substringLength=lastA;
             lastB++;
             charA=currentChar;
             lastA=0;
         }
          
	substringLength++;            
          //now check if the substring formed has greater length than any seen so far
          if(substringLength>maxSubstringLength)
          {
              maxLength=substringLength;
              subStringStart=maxLength-i+1;
              subStringEnd=i;
          }
       }           
      
      return (maxLength==-1?null: input.substring(subStringStart,subStringEnd));
      }
      
              
