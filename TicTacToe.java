package com.gist;

import java.util.Scanner;

public class TicTacToe  
{

     public static    Player p1;//x
        public static Player p2;//0
       public static  char[][] board ;//the board can be abtracted away to a new Object if needed.

        Player currentPlayer;

        //default constructor
       
        //initialize the board.
        public static void  InitializeBoard()
        {
                board = new char[3][3];// 3x3 board.
                for(int i=0;i<3;i++)
                {
                        for(int j=0;j<3;j++)
                        {
                                board[i][j]='-';
                        }
                }
        }


        // returns true if move was successful . Returns false if it was invalid.
        public static  boolean makeMove(Player p, int row, int col)
        {
                if(row >=0 && row <=3 && col>=0 && col<=3)// boundary checking
                {
                        if(board[row][col]=='-')
                        {
                                board[row][col]= p.value;
                                return true;
                        }
                }
                return false; // invalid move attempted.        
        }
        public static boolean checkVictory()
        {
                return (checkColumnVictory()||checkRowVictory()||checkDiagsForVictory());
        }

        //check if all in the same row are equal.
        public static boolean checkRowVictory()
        {
                boolean victory =false;
                for(int i=0;i <3 ;i++)
                {

                                if ((board[i][0]!='-') && (board[i][0]==board[i][1]) && (board[i][1]==board[i][2]))
                                {
                                        victory=true;
                                }
                }

        return victory;
        }


        public static boolean checkColumnVictory()
        {

                  boolean victory =false;
                   for(int j=0;j <3 ;j++)
                        {


                                if ((board[0][j]!='-') && (board[0][j]==board[1][j]) && (board[1][j]==board[2][j]))
                                {
                                        victory=true;
                                }
                        }
                return victory;
        }
        public static boolean checkDiagsForVictory()
        {
                // There are two diags.

                //Diag 1
                return (((board[0][0]!='-') && (board[0][0]==board[1][1]) && (board[1][1]==board[2][2] )) || ((board[0][2]!='-') && (board[0][2]==board[1][1]) && (board[1][1]==board[2][0])));
                //Diag 2.

        }


        //Is the Board already full?

        public static  boolean IsFull()
        {
                boolean is_Full=true;

                
                        for (int i=0;i<3;i++)
                        {
                                for(int j=0;j<3;j++)
                                {
                                        if (board[i][j]=='-')
                                                {
                                                        is_Full=false; //there are unplayed positions!

                                                }
                                }
                        }
                

                return is_Full;
        }
        public TicTacToe()
        {
                p1=new Player();
                p2=new Player();
                currentPlayer=p1;
                InitializeBoard();

        }
        public static void gamePlay()
        {
                //Initialize the board.
                TicTacToe();
                // the game starts with Player 1.
                System.out.print("Enter symbol for player 1 - X or 0");
                Scanner sc = new Scanner(System.in);
                char c = sc.next().charAt(0);
                if (c=='X')
                {
                        p1.value ='X';
                        p2.value='0';
                }
                else
                {
                        p1.value='0';
                        p2.value='X';
                }

                while (true)
                {       boolean invalidMove1=true;
                        while(invalidMove1)
                        {
                                System.out.println("Enter row  for Player 1");
                                int row = sc.nextInt();
                                System.out.println("Enter col  for Player 1");
                                int col= sc.nextInt();
                                invalidMove1= !makeMove(p1, row, col);
                        }
                                if( checkVictory())
                                {
                                        System.out.println("Player 1 won the match!");
                                        break;

                                }
                                if (IsFull())
                                {
                                        System.out.println("Match Drawn!!");
                                        break;
                                }
                         boolean invalidMove2=true;
                        while(invalidMove2)
                        {
                                System.out.println("Enter row  for Player 2");
                                int row = sc.nextInt();
                                System.out.println("Enter col  for Player 2");
                                int col= sc.nextInt();
                                invalidMove2= !makeMove(p2, row, col);
                        }
                                if( checkVictory())
                                {
                                        System.out.println("Player 2 won the match!");
                                        break;

                                }
                                if (IsFull())
                                {
                                        System.out.println("Match Drawn!!");
                                        break;
                                }


                }
}
		
		
} 



