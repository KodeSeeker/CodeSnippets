package com.test;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
        int cols;
        cols = 5;//in.nextInt();
        
        char[] [] stairs = prepareStairCase(cols);
        
        for (int i=0;i <cols;i++){
            for(int j=0;j<cols;j++){
                System.out.print(stairs[i][j]); 
            }
            System.out.println();
        }
       
        
    }
    
    
   static char[] [] prepareStairCase(int cols){
       
        int idx=0;
        char[] [] mat = new char[cols][cols];
        for(int j=cols-1;j>=0;j--){
            for(int i=idx; i<cols;i++){
                mat[i][j]= '#';
            }
            idx++;
        }
       
         for(int i= 0;i<cols;i++){
            for(int j=0; j<cols;j++){
                if(mat[i][j]!= '#'){
                    mat[i][j]=' ';
                }
            }
        }
       
       return mat;
   }
}
