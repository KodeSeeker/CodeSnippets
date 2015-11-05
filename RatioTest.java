package com.test;

import java.util.Scanner;

public class RatioTest {

	public static void main(String[] args) {
	    
	       Scanner in = new Scanner(System.in);
	        int total;
	        total = in.nextInt();    
	        
	        int idx=0;
	        int pCount =0;
	        int negCount =0;
	        int zerCount=0;
	        while (idx<total){
	            int val = in.nextInt();
	            if(val >0)
	                pCount++;
	            else if (val <0)
	                negCount++;
	            else 
	                zerCount++;
	            idx++;
	        }
	        
	        double posRatio= (double) (pCount/total);
	        double negRatio= (double) (negCount/total);
	        double zeroRatio = (double)(zerCount/total);
	        
	        System.out.println(posRatio);
	        System.out.println(negRatio);
	        System.out.println(zeroRatio);
	    }
}
