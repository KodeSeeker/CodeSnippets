package com.test;

public class RotateMatrix {

	public static void main(String... args){
		int[][] in = {{1,2},{3,4}};
		int[][] in3={{1,2,3},{4,5,6},{7,8,9}};
		int[][] in4={{1,2,3},{4,5,6}};

		printMatrix(in);
		rotate(in);
		System.out.println("Rotating!!");
		printMatrix(in);
		printMatrix(in3);
		rotate(in3);
		printMatrix(in3);
		rotate(in4);
		System.out.println("Rotating haphazard");

		printMatrix(in4);
	}
	
	public static int[] [] rotate (int[] [] in){
		
		int n= in.length;
		for (int i=0; i<in.length/2;i++){
			for(int j= 0; j<in.length-1-i/*Math.ceil(in[0].length/2)*/+1;j++){
				int tmp = in[i][j];
				in[i][j]=in[n-1-j][i];
				in[n-1-j][i]=in[n-1-i][n-1-j];
				in[n-1-i][n-1-j]=in[j][n-1-i];
				in[j][n-1-i]=tmp;
			}
		}
		
		return in;
	}
	
	 public static void printMatrix(int[][] in) {
		 
		 for(int i=0;i<in.length;i++){
			 for(int j=0;j<in[0].length;j++){
				 System.out.print(in[i][j]+ "  ");
			 }
			 System.out.println();
		 }
	 }
}
