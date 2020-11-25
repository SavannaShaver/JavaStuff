/*
 * Written by Savanna Shaver
 */
import java.util.Scanner;
public class HotPotatoGameFE {
	public static Scanner keyboard = new Scanner(System.in); // made this so you can always have them input the same you dont have to keep calling it 
	public static HotPotatoGame hpg = new HotPotatoGame();
	public static final int MIN_TIME = 1; 
	public static final int MAX_TIME = 10;
	public static void main(String[] args) {
		greeting(); // calls the method i wrote down below
		boolean playGame = true;
		while(playGame)
		{
			hpg.resetTime();
			int numPlayers = getNumberOfPlayers();
			addPlayers(numPlayers);
			
			boolean gameOver = false;
			while(!gameOver)
			{
				String player = hpg.getCurrentPlayer();
				System.out.println(player+", enter a time to hold the potato from " +MIN_TIME+ " to " +MAX_TIME);
				int time = keyboard.nextInt();
				keyboard.nextLine();
				if(time < MIN_TIME || time > MAX_TIME);
				{
					System.out.println("Incorrect value. Assuming time is " + MAX_TIME);
					time = MAX_TIME;
					
				}
				if(hpg.hasLost(time))
				{
					System.out.println("Player" +player+ "has been eliminated!");
				}
				else
				{
					hpg.addPlayer(player); // this is some how enqueuning our dequeued player from getCurrentplayer
					
				}
				gameOver = hpg.getWin();
			}
			System.out.println("The winner is " + hpg.getCurrentPlayer()+ "!");
			System.out.println("Enter\"yes\" to play again");
			String input = keyboard.nextLine();
			playGame = input !=null && input.equalsIgnoreCase("yes");
		}
		System.out.println("Goodbye");
	}
	public static void greeting() // allows me to write my greeting not in the main method 
	{
		System.out.println("Welcome to the Hot Potato Game!");
	}
	public static int getNumberOfPlayers()
	{
		int num = 0;
		while(num <=1)
		{
			System.out.println("Enter the Number of Players. Must be greater than 1");
			num = keyboard.nextInt();
			keyboard.nextLine();
		}
		return num;
	}
	public static void addPlayers(int num)
	{
		int i=0;
		while(i<num)
		{
			System.out.println("Enter your name player " +i);
			String input = keyboard.nextLine();
			if(input == null || input.isEmpty()) // making sure the players name is valid
			{
				System.out.println("Invalid Input");
				continue; // if this statement is reached the program will jump back to assking the players name again
			}
			else
			{
				hpg.addPlayer(input);
			}
			i++;
		}
	}

}
