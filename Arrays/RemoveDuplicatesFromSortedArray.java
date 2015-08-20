/**
EPI 6.6
**/

sckage com.test;

public class RemoveDuplicates {

	public static void main(String... args){
		
		int[]num = {1,1,1,2,2,2,3};
		int[]num2 = {1,1,2,2,2};
		int[]num3 = {1,1,2,2,7,8,9};
		int[]cpy= removeDuplicates(num3);
		for(int i : cpy){
			System.out.print(i+ ", ");
		}
	}
	
	
	static int[] removeDuplicates (int[] num){//num is sorted .

        if (num == null)
                throw new IllegalArgumentException();

        if(num.length ==0)
                return num;

         int[] cpy =  new int[num.length];

       
        int idx=0;
        int prev =0;
        int i;
        for(i=1;i<num.length;i++,prev++) {

          if(num[prev] != num[i])
                cpy[idx++] =num[prev];
        }
        if (prev!=i){
        	cpy[idx++]=num[num.length-1];
        }
        System.out.println("Num of unique elements" +idx);
        //idx is now the count of duplicates. 

        int[] noDup= new int[idx];
        for(int j=0;j<idx;j++) {
                noDup[j]= cpy[j];
        }

        return noDup;
       
}

}
