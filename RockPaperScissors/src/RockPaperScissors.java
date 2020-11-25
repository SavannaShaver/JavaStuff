/*
 * Savanna Shaver 
 */
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Welcome to Rock Paper Scissors!  Best 2 out of 3!");
	
	
	//String input = keyboard.nextLine();
	//System.out.println(input);
	
	int playerPoints = 0;
	int compPoints = 0;
	String c1 = "rock";
	String c2 = "paper"; 
	String c3= "scissors";
	String compAnswer;
	int copyInput;
	boolean restart; 
	
	Random rand = new Random(); //this is the random function
	while(restart = true)
	{
		for(int i = 0; i < 3; i++ )
		{
		
			System.out.println("Enter \"rock\", \"paper\", or \"scissors\"");
			String input = keyboard.nextLine();
						
			int randNum = rand.nextInt(3);
		
			
			if(randNum == 0)
			{
			  compAnswer = c1;
			}
			else if(randNum == 1)
			{
				compAnswer = c2;
			}
			else
			{
			    compAnswer = c3;
			}
			
			
			
			
			if(input.equals("rock"))
			{
				copyInput = 0;
				
				if(copyInput == randNum)
				{
				System.out.println(input+" vs " +compAnswer+ "! Tie!");
				System.out.println("Player has won " + playerPoints+ " times and the computer has won "+ compPoints+" times");
				}
				else if(copyInput == 0 && randNum == 2)
				{
				System.out.println(input+" vs " +compAnswer+ " ! Player Wins!");
				playerPoints ++;
				System.out.println("Player has won " + playerPoints+ " times and the computer has won "+ compPoints+" times");
				}
				else
				{
				System.out.println(input+" vs " +compAnswer+ " ! Computer Wins!");
				compPoints ++;
				System.out.println("Player has won " + playerPoints+ " times and the computer has won "+ compPoints+" times");
				}
				
				
				
				
				
				
				
			}
			else if(input.equals("paper"))
			{
				copyInput = 1;
				if(copyInput == randNum)
				{
				System.out.println(input+" vs " +compAnswer+ "! Tie!");
				System.out.println("Player has won " + playerPoints+ " times and the computer has won "+ compPoints+" times");
				}
				else if(copyInput == 1 && randNum == 0)
				{
				System.out.println(input+" vs " +compAnswer+ " ! Player Wins!");
				playerPoints ++;
				System.out.println("Player has won " + playerPoints+ " times and the computer has won "+ compPoints+" times");
				}
				else
				{
				System.out.println(input+" vs " +compAnswer+ " ! Computer Wins!");
				compPoints ++;
				System.out.println("Player has won " + playerPoints+ " times and the computer has won "+ compPoints+" times");
				}
				
			}
			else if(input.equals("scissors"))
			{
				copyInput = 2;
				if(copyInput == randNum)
				{
				System.out.println(input+" vs " +compAnswer+ "! Tie!");
				System.out.println("Player has won " + playerPoints+ " times and the computer has won "+ compPoints+" times");
				}
				else if(copyInput == 2 && randNum == 1)
				{
				System.out.println(input+" vs " +compAnswer+ " ! Player Wins!");
				playerPoints ++;
				System.out.println("Player has won " + playerPoints+ " times and the computer has won "+ compPoints+" times");
				}
				else
				{
				System.out.println(input+" vs " +compAnswer+ " ! Computer Wins!");
				compPoints ++;
				System.out.println("Player has won " + playerPoints+ " times and the computer has won "+ compPoints+" times");
				}
				
			}
			else
			{
				System.out.println("Not a valid input! Computer wins");
				compPoints ++;
				System.out.println("Player has won " + playerPoints+ " times and the computer has won "+ compPoints+" times");
			}
			
			
			System.out.println();
			//System.out.println("Player has won " + playerPoints+ " times and the computer has won "+ compPoints+" times");
		}
		
		
			if(compPoints > playerPoints)
			{
				System.out.println("The Computer Wins!");
			}
			else if(compPoints < playerPoints)
			{
				System.out.println("The Player Wins!");
			}
			else
			{
				System.out.println("Tied Game!");
			}
			
			
		int a = 0;
		if(a == 0)
		{
			System.out.println("Would you like to play again? Enter 'no' to quit");
			String answer = keyboard.nextLine();
			 
			if(answer.equals("no"))
			{
				
				System.out.println("Goodbye!");
				 System.exit(0);
			}
			else if(answer.equals("yes"))
			{
				restart = true;
				
			}
			
		}
					
	
	}
	
	}
	
}
