import java.io.File;
import java.util.Random;
import java.util.Scanner;
/*
 * Written by Savanna Shaver 
 */
public class ShowcaseGame {
	public static final String FILE_NAME = "./prizeList.txt"; 
	public static final int CONTENT = 50;
	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		 
		Random r = new Random();
		//int gettingRandom = r.nextInt(1000);
		int n = 0;
		int k = 0;
		int count = 0;
		String result = null;
		boolean playGame = true;
		while(playGame)
		{
			greeting();
		try
		{
			Scanner fileScanner = new Scanner(new File(FILE_NAME));
			while(fileScanner.hasNextLine())
			{
				String currLine = fileScanner.nextLine();
				String[] splitLine = currLine.split("\t");
				
					if(splitLine.length == 2 )
					{	
						if(k <= 4)
						{
						
						//System.out.println(r.nextInt(51));
						
						k++;
						}
						//System.out.println();
							n++;
							if(r.nextInt(n) == 0)
							{
								result = currLine;
									
								System.out.println(currLine);								//}
							}
					}
					//System.out.println(count);
			}
		fileScanner.close();
		}
		catch(Exception e)
		{
		}
		
		GuessNum();
		youDone();
		}
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
	
		

