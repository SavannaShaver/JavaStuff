/*
 * Savanna Shaver
 */
import java.util.Scanner;
//import java.util.Random;
public class MaxtrixSubtraction {

	//enum Spaces{Empty};
	//public static final char EMPTY = '_';
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner keyboard = new Scanner(System.in); 
	
	System.out.println("Welcome to the matrix subtracting program");
	
	
	System.out.println("Please enter the length of the first matrix");
	int lengthFirst = keyboard.nextInt();
	System.out.println("Please enter the height of the first matrix");
	int heightFirst = keyboard.nextInt();
	
	System.out.println("Please enter the length of the second matrix");
	int lengthSecond = keyboard.nextInt();
	System.out.println("Please enter the height of the second matrix");
	int heightSecond = keyboard.nextInt();
	
	
	int[][] board = new int[lengthFirst][heightFirst];
	int[][] secondBoard = new int[lengthSecond][heightSecond];
	
	
	System.out.println("");
	//System.out.println(board);
	System.out.println("");
	
	System.out.println("Please enter a value for matrix 1 space 1, 1");
	int firstValue = keyboard.nextInt();
	System.out.println("Please enter a value for matrix 1 space 1, 2");
	int secondValue = keyboard.nextInt();
	System.out.println("Please enter a value for matrix 1 space 2, 1");
	int thirdValue = keyboard.nextInt();
	System.out.println("Please enter a value for matrix 1 space 2, 2");
	int forthValue = keyboard.nextInt();
	
	
	System.out.println("");
	
	
	System.out.println("Please enter a value for matrix 2 space 1, 1");
	int fifthValue = keyboard.nextInt();
	System.out.println("Please enter a value for matrix 2 space 1, 2");
	int sixthValue = keyboard.nextInt();
	System.out.println("Please enter a value for matrix 2 space 2, 1");
	int seventhValue = keyboard.nextInt();
	System.out.println("Please enter a value for matrix 2 space 2, 2");
	int eighthValue = keyboard.nextInt();
	
	System.out.println("");
	
	
	for(int i = 0; i < board[i].length; i++)
	{
		//System.out.printlsn("_");
		for(int j = 0; j < board[i].length; j++)
		{
		  if(i == 0)
		  {
			board[i][j]= firstValue  ;
			 
		  }
		  else if(i == 1)
		  {
			board[i][j]=secondValue ;
		 
		  }		  
		 
		}
	}
	
	
	for(int i = 0; i < lengthFirst; i++)
	{
		for(int j = 0; j < heightFirst; j++)
		{
			System.out.println(board[i][j]);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
System.out.println("");
	
	
	for(int i = 0; i < lengthSecond; i++)
	{
		
		for(int j = 0; j < heightSecond; j++)
		{
		  if(i == 0)
		  {
			secondBoard[i][j]= fifthValue ;
				
			 
		  }
		  else if(i == 1)
		  {
			secondBoard[i][j]=sixthValue ;
			
		  }		  
		 
		}
	}
	
	
	for(int i = 0; i < lengthSecond; i++)
	{
		for(int j = 0; j < heightSecond; j++)
		{
			System.out.println(secondBoard[i][j] + " " );
		}
		
	}
	
	
	
	for(int i = 0; i < lengthFirst; i++)
	{
		for(int j = 0; j < heightFirst; j++)
		{
			
			//total[i][j] = board[i][j] - secondBoard[i][j];
			
		}
		
	}
	
	
	//for(int i = 0; i < lengthFirst; i++)
	//{
		//for(int j = 0; j < heightFirst; j++)
		//{
			
			//System.out.println(total[i][j] + "");
			
		//}
		//System.out.println();
		
	//}
	
	

	}

}
