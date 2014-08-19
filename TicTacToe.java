
/**
This is more of a design question. The key is in understanding the requirements and making sure all the rules are met.
The concept can be extended to simple chess. et .al.

**/

public class TicTacToe	
{

	Player p1;//x
	Player p2;//0
	char[][] board ;//the board can be abtracted away to a new Object if needed.
	
	Player currentPlayer;
	
	//default constructor
	public TicTacToe()
	{
		currentPlayer=p1;
		InitializeBoard();
		
	}
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


	public static Player changePlayer(Player p)
	{
		if(p==null)
			return null;
		if(p.value=='x')
			return p2;
		else
			return p1;
	}
	
	//GamePlay rules
	//check for victory
	/* Victory possibilities:
	1.  Same rows
	2. Same columns
	3. Same diag.
	**/
	public static boolean checkVictory()
	{
		return (checkColumnVictory()||checkRowVictory()||checkDiagVictory())
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
		return (((board[0][0]!='-') && (board[0][0]==board[1][1]) && (board[1][1]==board[2][2] ) || ((board[0][2]!='-') && (board[0][[2]==board[1][1]) && (board[1][1]==board[2][0]))) ;
		//Diag 2.
			
	}


	//Is the Board already full?

	public static  boolean IsFull()
	{
		public boolean isFull=true;
		
		{
			for (int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if (board[i][j]=='-')
						{
							isFull=false; //there are unplayed positions!
							
						}
				}
			}
		}
		
		return isFull;
	}

// Driver method.
// method invoked from main caller
	public static void gamePlay()
	{
		//Initialize the board.
		TicTacToe();
		// the game starts with Player 1.
		System.out.print("Enter symbol for player 1 - X or 0");
		Scanner sc = new Scanner(System.in);
		char c = sc.next.charAt(0);
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
		{	invalidMove1=true;
			while(invalidMove1)
			{
				System.out.println("Enter row  for Player 1");
				int row = sc.nextInt();
				System.out.println("Enter col  for Player 1");
				int col= sc.nextInt();
				invalidMove= !makeMove(p1, row, col);
			}
				if( checkVictory())
				{
					System.out.println("Player 1 won the match!")
                                        break;

				}
				if (isFull())
				{
					System.out.println("Match Drawn!!")
					break;
				}
			 invalidMove2=true;
                        while(invalidMove2)
                        {
                                System.out.println("Enter row  for Player 2");
                                int row = sc.nextInt();
                                System.out.println("Enter col  for Player 2");
                                int col= sc.nextInt();
                                invalidMove= !makeMove(p2, row, col);
                        }       
                                if( checkVictory())
                                {
                                        System.out.println("Player 2 won the match!")
                                        break;

                                }
                                if (isFull())
                                {
                                        System.out.println("Match Drawn!!")
                                        break;
                                }

			
		}	
}

