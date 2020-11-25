/*
 * Savanna Shaver
 */
import java.util.Scanner;
import java.util.Random;
public class ChooseAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner keyboard = new Scanner(System.in);
	Random rand = new Random(); 

	
	System.out.println("Welcome to the Lost Island !  Will you go into the woods, try to start ");
	System.out.println(	"a fire, or follow the feet prints in the sand");
	System.out.println("Enter “woods”, “fire”, or “follow”.");
	String answer = keyboard.nextLine();
	
	if(answer.equals("woods"))
	{
			System.out.println("You enter the woods and see a chest");
			System.out.println(" Do you open the chest, Yes or No?.");
			String newAnswer = keyboard.nextLine();
	
			if(newAnswer.equals("yes"))
			{
				System.out.println("AHH POISONOUS SNAKES, are inside the chest, but at last"
						+ " their is a box inside the chest do you try to grab the box, Yes or No?.");	
				String finalAnswer = keyboard.nextLine();
				
				if(finalAnswer.equals("yes"))
				{
						 System.out.println("Guess a number from 1 to 5, think wisely your life depends on it.");
						 int guessNum = keyboard.nextInt();
						 int randNum = rand.nextInt(5);
						 randNum +=1;
					
					if(randNum == guessNum)// num expression
					{
						System.out.println("WOW! Your real lucky these snakes are defanged, so they cant hurt you."
								+ "Inside the box is a walkie talkie, you call for help and are rescued from the island. THE END");
					}
					else
					{
						System.out.println("Oh no, while you were guessing the box disappered! Leaving you lost in the woods with a bunch of poisonous snakes. "
								+ "THE END");
					}
				}
			
				else if(finalAnswer.equals("no"))
				{
					System.out.println("Okay, odd choice. Well do you keep walking further into the woods or do you try to "
							+ "go back to the shore where you first started. Enter “forward” or “return”.");
					String whereToGo = keyboard.nextLine();
					
					if(whereToGo.contentEquals("forward"))
					{
						System.out.println("As you walk deeper in the woods, you get sucked into a black hole. The End");
					}
					else if(whereToGo.contentEquals("return"))
					{
						System.out.println("As you begin to walk back you grab materials for a shelter. As you know this is "
								+ "your new home. The End");
					}
				}
				else
				{
				System.out.println("Insufficant Answer");	
				}
			}
			
			else if(newAnswer.equals("no"))
			{
				System.out.println("Why not? To scared, you start to walk past the chest and see a bridge"
						+ "do you head towards it");
				System.out.println("Enter “cross” or “stop”");
				String givenAnswer = keyboard.nextLine();
					if(givenAnswer.equals("cross"))
					{
						System.out.println("You head to cross the bridge, but accidently step on "
								+ "a trip wire. Oops. THE END");
					}
					else if(givenAnswer.equals("stop"))
					{
					    System.out.println("Good choice to stop. You were about to step on a trip wire"
					    		+ " your still stuck on the island but at least your alive!! THE END ");
					}
				
			}
			else
			{
				System.out.println("Insufficent Answer");	
			}
		}
	
	
	else if(answer.equals("fire"))
	{
		System.out.println("You decide you want to make a fire for warmth."
				+ " You check your pockets to see what materials you have to work with. Pick a number 1 to 100 "
				+ "to see if you can start a fire");
		System.out.println("Pick a number from 1 to 100");
		String fuel = keyboard.nextLine();
		int fuelAmount = Integer.parseInt(fuel);
		System.out.println("Pick a number from 1 to 100");
		String oxygen = keyboard.nextLine();
		int oxygenAmount = Integer.parseInt(oxygen);
		

		if(fuelAmount > 100 || fuelAmount < 1 || oxygenAmount > 100 || oxygenAmount < 1)
		{
		 System.out.println("Insufficent Answer");
		}
		else if(fuelAmount >= 50 && oxygenAmount <= 25)//the compound
		{
			 System.out.println("You have all the materials to make a fire, actually you have to much. You actually started "
			 		+ "a massive fire on the island. What are you going to do? Try to run away or put the fire out");
			 	System.out.println(	"Enter “run” or “stay”");
			 String givenAnswer = keyboard.nextLine();
			if (givenAnswer.equals("run"))
			{
			 System.out.println("It worked you got away from the fire,but missed the life boat that saw the fire"
			 		+ "and stopped to check out the fire.The END");
			}
			else if (givenAnswer.equals("stay"))
			{
			System.out.println("You chose to stay, good for you the fire attracted a life boat and your Saved. THE END.");
			}
		}
		else 
		{
			System.out.println("You were stranded with to little fire making materials. This means tonight you have no fire "
				 		+ "which means its a fight to see if you die from hypotherma or wild animals first. Plot twist! Before night"
				 		+ "falls a ship passes by the island and the flashlight and flare gun in your pockets come in handy. Do you"
				 		+ "signal the ship."); 
			System.out.println("Enter “signal” or “dont”");
			
					
			String yourAnswer = keyboard.nextLine();
					
			if(yourAnswer.equals("signal"))
			{
			System.out.println("You are able to signal the ship, and leave the island alive. THE END");
			}
			else if(yourAnswer.equals("dont"))
			{
			System.out.println("Why the heck didnt you signal? You try to survive the night on the island and lose. THE END");
			}	
			
		 
		 
		
	}
		
	}
	
	else if(answer.equals("follow"))
	{
		System.out.println("You choose to follow the foot prints, and find another person stranded as well."
				+ "Do you talk to them? Yes or No?");
		
		String aAnswer = keyboard.nextLine();
		
		if(aAnswer.equals("yes"))
		{
			System.out.println("You talk to the stranger and they tell you the location "
					+ "of a chest with walkie talkies. You find the chest and are able to "
					+ "get off the island ");	
			
		}
		
		else if(aAnswer.equals("no"))
			{
				System.out.println("You are a coward and dont speak to the stranger.");
				System.out.println("She says she will give you some info if you can guess a word that is the same length as the one she is thinking of"
						+ "letter they are thinking of");
				System.out.println("Enter any length word");
				
				String anotherAnswer = keyboard.nextLine(); 
				String herWord = ("Cupcake");
				int base = herWord.length();
		        int var = anotherAnswer.length();
		        
				if(base ==var)// string comparsion
				{
					System.out.println("You guessed a word the same length as her. She will tell"
							+ "you were a raft is hidden on the island."
							+ "You find the raft and leave the island. You are then rescued");
				}
				else
				{
					System.out.println(" Welp you guessed wrong, and for that it looks like your "
							+ "forever stranded on the island");
				}
			
				
			}
		else
		{
			System.out.println("Insufficant Answer");	
		}
	}
		
		
		
		

	else
	{
		System.out.println("Insufficent answer");
	}
	
	}
}
