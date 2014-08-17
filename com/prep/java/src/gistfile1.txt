import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main (String[] args) throws java.lang.Exception
	  {
		
		try{
	
	    ArrayList<Integer> list= new ArrayList<Integer>();
	    Scanner input =new Scanner(System.in);
	    int numLines= input.nextInt();
	    int i=0;
	    while(i<numLines){
	    	int num1=input.nextInt();
	    	
	    	for (int j=num1+1;;j++){
	    		if(isPalindrome(j)){
	    			list.add(j);
	    		break;
	    		}
	    	}
	    		
	    		
	    	++i;
	    }
	   for(int k :list){
	   System.out.println(k);
	   }
	   
	   input.close();
		}
	   catch(Exception e){
			return;
		}
	     
	  }
	
	 
	 public static boolean isPalindrome(int n){
		 
		 int palindrome=n;
		 int rev=0;
		 int d=0;
		 while(palindrome!=0){
			d=palindrome%10;
			rev=rev*10+d;
			palindrome=palindrome/10;
			
		 }
		 if(rev==n){
			 return true;
		 }
		 else{
			 return false;
		 }
	 }
	  }
	
	
		
	 
	







