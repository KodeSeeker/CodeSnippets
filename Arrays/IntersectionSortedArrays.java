


/**
Find the intersection of two sorted arrays. 

Trivial approach : Use a hashset, and place element from each array into the set. Eliminate duplicates.O(n) extra memory .

Better approach : Modified merge.  Move pointer with lower value forward. 

**/

package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] b= {9,12,5,4};
		int[] a={3,4,5,33,27,78,9};
		List<Integer> c=intersect(a, b);
		for(int i:c){
			System.out.print(i + " ");
		}
	}
	
	static List<Integer> intersect(int[] a, int[] b) {

        if( a== null || b == null)
                throw new IllegalArgumentException();
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0, j=0;
        List<Integer> intersect= new ArrayList<Integer>();
        while(i<a.length && j<b.length) {

                        if(a[i]<b[j]){
                                i++;
                        }
                        else  if(b[j]<a[i]) {
                                j++;
                        }
                        else {//a[i] == b[j]
                                intersect.add(a[i]);
                        	    i++;
                                j++;
                        }
        }
        

        return intersect;
}


}



		 
	


