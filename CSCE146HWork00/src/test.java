/*
 * Written By Savanna Shaver
 */
import java.util.Scanner;
import java.util.Random;
import java.util.*;
import java.io.*;

public class test {
	public static final String FILE_NAME = "./prizeList.txt"; 
	public static final int CONTENT = 50;
	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
	
		boolean playGame = true;
		while(playGame)
		{
			greeting();
			String[] words = readFile(FILE_NAME);
			GuessNum();
			youDone();
		}		
	    System.out.println("");
 		
	}
		public static String[] readFile(String fileName) {
			
			Random r = new Random();
			Prize prize02;
			int totalSum = 0;
			
			try
			{
			Scanner checkFiles = new Scanner(new File(fileName));
			
			for(int i= 0; i< 5; i++)
			{
				String pName = checkFiles.next();
				int pNum = checkFiles.nextInt();
				prize02 = new Prize(pName, pNum); //random r + new Random?
				System.out.println(prize02);
				totalSum += prize02.getPrice();
			}
			
			while(checkFiles.hasNextLine())
			{
				String line = checkFiles.nextLine();
			}
			checkFiles.close();
			
			}
			catch(Exception e)
			{
			//e.printStackTrace();
			}
			return null;
			
	}
	public static void greeting()
	{
		System.out.println("Welcome to the showcase show down!");
		System.out.println("Your prizes are:");
		System.out.println(" ");
		
	}
	
	public static void GuessNum()
	{
		int totalSum = 0;

		System.out.println("You must guess the total cost of all without going over");
		System.out.println("Enter your guess");
		int guessNumber = keyboard.nextInt();
	    keyboard.nextLine();
	    
	    System.out.println("You guessed " + guessNumber + " the actual price is " + totalSum + "");
	    
	    double diff = guessNumber - totalSum;
	    
	    if(Math.abs(diff) > 2000)
	    {
	    	System.out.println("I'm sorry but that guess was bad.  You lose for being bad.");
	   
	    }
	    else 
	    {
	    	System.out.println("Your guess was under!  You win!");
	    }
	}
	    
	   public static void youDone()
	   {
		   
		   boolean playGame;
		   System.out.println("Would you like to play again? Enter 'no' to quit");
		    
		    int a = 0;
			if(a == 0)
			{
			    String answer = keyboard.nextLine();
				if (answer.equals("yes"))
				{
					playGame = false;
					System.out.println("");
				}
				else if(answer.equals("no"))
				{
					System.out.println("Goodbye!");
					 System.exit(0);
				}
				else
				{
					System.out.println("Not a vaild answer");		
				}
			}
	   }
		
				

	
}
