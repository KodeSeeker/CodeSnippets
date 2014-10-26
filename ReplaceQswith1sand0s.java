/*
Input: String of randomly placed 0,1,?. For example "10?", "001", "1?000"
Output to be all Strings where ? is replaced with 0 and 1.
**/

/**
 ie. 10?->100,101.
     10??->101?,100?,1000,1001,1010,1011.
 **/

 
 
 //key is in the ability to see the subproblem AND that there will be a choice (we will be  replacing the ? with either a 1 OR a 0
 // so you need to break the problem down.
 
 
 public static ArrayList<String>    replaceQs(String expression) throws IllegalArgumentException
 {
    // now assume you need to return a list of these substitutions.
    if(expression.isEmpty())
        throw new IllegalArgumentException("Expression cannot be null");
      
     List<String> results = new ArrayList<String>();
     
     generatePermutations(results,"",expression);
     return results;
  }
  
  public void generatePermutations(ArrayList<String> result, String prefix, String suffix)
  {
      // need to split it into 2 parts.- how? - Find the index of the ?
       int idx= suffix.indexOf("?");
       if(idx<0)
        {
           result.add(prefix+suffix);// add it to the result list.
           return;
         }
       // now exclude the ? from the prefix and suffix.
       String newPrefix=prefix +suffix.substring(0,idx);
       String newSuffix= suffix.substring(idx+1);
       
       //now work on the subproblem
       
       generatePermutations(result,newPrefix+"0",newSuffix);
       generatePermutations(result,newPrefix+"1",newSuffix);
  }
       
       
