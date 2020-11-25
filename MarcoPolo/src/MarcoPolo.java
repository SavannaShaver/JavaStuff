/*
 * Savanna Shaver
 */
import java.util.Scanner; // called a java packet uses code from far away 
import java.util.Random;
public class MarcoPolo {
	public static final int BOARD_SIZE = 10;
	public static final int COLD_DIST = (BOARD_SIZE/2)*(BOARD_SIZE/2);
	public static final int WARM_DIST = (BOARD_SIZE/4)*(BOARD_SIZE/4);
	public static final char PLAYER = 'X';
	public static final char EMPTY = '_';
	public static final char WALKED_PATH = '#';
	public static final char GOAL = '_';
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	char[][] board = new char[BOARD_SIZE][BOARD_SIZE];
	int pX = 0; 
	int pY = 0; 
	Random r = new Random();
	int gX = r.nextInt(BOARD_SIZE);
	int gY = r.nextInt(BOARD_SIZE);
	Scanner keyboard = new Scanner(System.in);
	for(int i = 0; i<board.length; i++)// Outside part 
	{
		for(int j = 0; j<board[i].length; j++)//Inside part
		{
			board[i][j] = EMPTY;
			
		}
		
	}
		board[pY][pX] = PLAYER;
		board[gY][gX] = GOAL; 
		System.out.println("Sup");
		boolean gameOver = false; 
	
		while(!gameOver)
		{
				
			for(int  i= 0; i<board.length; i++)
			{
				for(int j = 0; j<board[i].length; j++)//vertical
				{
					System.out.println(board[i][j]);
				}
				System.out.println();
			}
			int dist = (pX-gX)*(pX-gX)+(pY-gY)*(pY-gY);
			if(dist> COLD_DIST)
			{
				System.out.println("You are cold");
			}
			else if(dist> WARM_DIST)
			{
				System.out.println("You are warm");
			}
			else
			{
				System.out.println("You are hot");
			}
			System.out.println("Enter - 1 0 or 1 to move in the x");
			int dX = keyboard.nextInt();
			if(dX>1 || dX<-1)
			{
				dX= 0; 
			}
			int dY = keyboard.nextInt();
			if(dY>1 || dY<-1)
			{
				dY= 0; 
			}
			
			
			pX +=dX; 
			pY += dY;
			
		}
		
	
  }

}
