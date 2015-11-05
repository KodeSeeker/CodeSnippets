package com.test;

public class ReverseBinary {

	public static void main (String... args){
		//reverseBinary(2);
		//System.out.println(Integer.parseInt(Integer.toBinaryString(2)));
		reverseObv(3);
		System.out.println(Integer.toBinaryString(swapBits(9, 0, 1)));
		//System.out.println(2 |1);
	}
	
	static void reverseBinary(int num){
		
		int rev=num;
		int i=0;
		int bitsInNumber=31;
		while(i<(bitsInNumber/2)+1){
			int onlyIthBit= (num>>i) &1;
			//System.out.println("Ith bit"+ onlyIthBit);
			int onlyMaxLessIthBit= (num>>(bitsInNumber-i))&1;
			//System.out.println("Max-Ith bit"+ onlyMaxLessIthBit);
			if(onlyIthBit != onlyMaxLessIthBit){//different.. toggle ith and 32-ith bit
				System.out.println("here");
				rev ^= 1<<i; 
				rev^=1<<(bitsInNumber-i);
			}
			i++;
			System.out.println("Rev in each iteration"+rev);
		}
		System.out.println("Reversed "+ rev);
		/// System.out.println("In Binary"+Integer.parseInt(Integer.toBinaryString(rev)));
	}
	
	static void reverseObv(int num){
		
		int rev = 0;
		for( ;num>0;num>>=1){
			rev<<=1;
			rev|=num&1;	
		}
		//rev<<=size;
		System.out.println(Integer.toBinaryString(rev));
	}
	
	 static int swapBits(int num, int i, int j) {

        //validate num,i,j

        //swap the bits at i and j IFF they are different.

        if(((num >>i)&1) != ((num >>j) &1)){
                //they are diff.
        num ^= (1<<i) |(1<<j); //toggle the bits at the ith and jth position.
        }

        return num;
}
	}

