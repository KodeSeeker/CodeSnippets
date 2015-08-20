/**
Given an integer in the form of an array. Perform an increment operation
e.g. [1,2,9] => [1,3,0]


**/

static int[] integerIncrement(int[] num) {

		  int i=num.length-1;
		  int[]res = new int[num.length];
		  boolean overflow=true;
		  while(i>=0){
		        if(num[i]!=9) {
		                overflow=false;
		                break;
		        }
		        i--;
		  }
		  if(overflow){
		        res = new int[num.length+1];
		  }

		   int j=num.length-1;
		   int carry=0;
		   while(j>0){
		        if(num[j] == 9){
		           res[j]=0;
		           carry=1;
		           j--;
		        }
		        else{
		          res[j]=num[j]+1;
		          carry=0;
		          j--;
		          break;
		        }
		   
		  }


		  if(carry!=0) {
		        res[j]=1;//999 case.
		  }
		  else {
		   while(j>=0){
		    res[j] =num[j];
		    j--;
		   }
		}

		 return res;

		}

}
