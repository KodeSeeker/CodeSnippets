package com.test;

import java.util.Scanner;

public class SumElements {

	  public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner in = new Scanner(System.in);
	       
	        int idx=0;
	         
	        int numElements = in.nextInt();
	        int[] elements = new int[numElements];
	        long sum;
	        while(idx<=numElements){
	            elements[idx++]= in.nextInt();
	        }
	        sum = sumArrayElements(elements);
	        System.out.println(sum);
	    
	    }
	    
	    static long sumArrayElements( int[] num){
	        long sum =0;
	        for (int i : num){
	            sum+=i;
	        }
	        return sum;
	    }
}
