package com.test;

import java.util.Stack;

public class LongestBalancedSubstringParens {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(longestBalancedParenSubstring("((())))"));
		System.out.println(longestBalancedParenSubstring("((()((()))))))"));

	}

	static  int longestBalancedParenSubstring(String parens){

		int maxLen = Integer.MIN_VALUE;
		//validate input. 
		Stack<Integer> leftParens= new Stack<Integer>();

		int last_end_pos=0;//keeps track of where the last balanced substring was completed.

		for (int i=0;i <parens.length();i++){

		        char bracket= parens.charAt(i);

		        if(bracket =='(')
		                leftParens.push(i);
		        else {
		                if(leftParens.isEmpty())// fully balanced substring
		                        last_end_pos=i+1;
		                else {
		                        leftParens.pop();// pop off equivalent left paren for right paren.

		                        //update max len
		                        int start = leftParens.isEmpty()? last_end_pos-1:leftParens.peek();

		                        maxLen = Math.max(maxLen, i - start);
		                }
		        }
		}


		return maxLen;

		}



}
