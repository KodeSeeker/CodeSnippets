package com.test;

/***
 * The problem can be modeled as a variant of the Josephus problem with K=2. 
 * With the difference that in the josephus problem we spare the first K-1 cups 
 * and remove the Kth cup.However, here we remove the first cup and skip K-1 cups.
 * This leads to an off-by one difference in the last standing cup.
 * 
 * @author vmahadevanveeramani
 *
 */
public class FindCupCircle {

	
	public static void main(String[] args){
		System.out.println(findLastStandinCupinCircle(100));
	}
	/**
	 * Wrapper to return the last standing cup.
	 * @param N number of cups
	 * @return last standing cup.
	 */
	static int findLastStandinCupinCircle(int N){
		return (josephus(N, 2)-1)%N;
	}
	/**
	 * Takes in N the number of people in the circle as an argument 
	 * and returns the last person standing.
	 * @param N
	 * @return
	 */
	
	static int josephus (int n, int k){
        if (n==1)
                return 1;
        else
                return ((josephus(n-1,k) + k-1) %n) +1;

}
	
	
}