import java.util.Scanner;
import java.util.Random;
import java.util.*;
import java.io.*;
/*
 * 	Written by Savanna Shaver
 * I messed this up i am sorry, I didnt budget my time well. I couldn't figure out the random function. On the test file I was able to do more
 I am planning to have it done for the next optional lab. sorry.
 */
public class ShowcaseGame {
	public static final String FILE_NAME = "./prizeList.txt"; 
	public static String[] readFile(String fileName) {
		// TODO Auto-generated method stub
		Random r = new Random();
		// TODO Auto-generated method stub
		try
		{
		Scanner checkFiles = new Scanner(new File(fileName));
		
		
		for(int i= 0; i<= 5; i++)
		{
		
		String pName = checkFiles.next();
		int pNum = checkFiles.nextInt();
		System.out.println(pName);
		
		}
		
		while(checkFiles.hasNextLine())
		{
			
			String line = checkFiles.nextLine();
			System.out.println(line);
			
		}
		
		
		checkFiles.close();
		
		}
		catch(Exception e)
		{
		//e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args) {
			//String[] words = readFile(FILE_NAME);
			Scanner keyboard = new Scanner(System.in);
			boolean restart;
			//System.out.println(FILE_NAME);
			
			while(restart = true)
			{   
					//try
					//{
					//Scanner fileScanner = new Scanner(new File(FILE_NAME));
					//String[] retArr = new String[size];
					//int count = 0;
					//fileScanner = new Scanner(new File(FILE_NAME));
					//System.out.println(fileScanner);
					//Random r = new Random();
				    
					//while (fileScanner.hasNextLine())
					//{	
					//String line = fileScanner.nextLine();
					//System.out.println(line);
					//Random r = new Rando
					//}
					
					//}
					//catch(Exception e)
					//{
					//System.out.println(e);
					//}
					//String randomLine = r.line();
					//System.out.println(randomLine + "!!!!!!!!!!!!");
			//}
				
				double totalSum = 0.0; // fix this 
				System.out.println("Welcome to the showcase show down!");
				System.out.println("Your prizes are:");
				System.out.println(" ");
				
				
			//System.out.print(" ");
			Prize prize01;
			
			
			for(int i = 0; i<5; i++)
			{
			 prize01 = new Prize("Car",1000); //random r + new Random?
			 System.out.println(prize01);
			 totalSum += prize01.getPrice();
			 //String line = fileScanner.nextLine();
			// System.out.println(line);
			 
			}
		
							//return retArr;
							//Random r = new Random(5);
							//String prizes = fileScanner.next(FILE_NAME);
							//String secretNumber = r.prizes;
							//System.out.println(secretNumber);
							
					
			
				System.out.println("You must guess the total cost of all without going over");
				System.out.println("Enter your guess");
				double guessNumber = keyboard.nextDouble();
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
			   // System.out.println("You need to add the win/or lose thing here Savanna");
			    System.out.println("");
			    
			    System.out.println("Would you like to play again? Enter 'no' to quit");
			    
			    int a = 0;
				if(a == 0)
				{
				    String answer = keyboard.nextLine();
					if (answer.equals("yes"))
					{
						restart = true;
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
	

}





