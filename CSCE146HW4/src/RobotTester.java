/*
 * Written by Savanna Shaver
 */
//import java.io.File;
import java.util.*;
import java.io.*;//Used for file input and output
public class RobotTester { //extends Canvas
	//public static final String FILE_NAME = "./board.txt"; 
	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		
		boolean playGame = true;
		while(playGame)
			
		{
				
				System.out.println("Welcome to the Robot Simulator");
				System.out.println("Enter file for the Board");
				String fileName = keyboard.nextLine();
				
				
				System.out.println("Enter file for the Robot Commands");
				String roboCommands = keyboard.nextLine();
				
				System.out.println(" ");
				System.out.println("Simulation begin");
				
			
				for(int i = 0; i < roboCommands.length() ; i++)
				{
					System.out.println(" ");
					System.out.println("Command "+ i);
					String[] words = readFile(fileName);
				}
				
				
			
				System.out.println("Simulation end");
				
				String[] moves = readFileRobo(roboCommands);
				//System.out.println(moves[]);
			
				//q.print(); 
				
				youDone();
		}		
	   
	}
	
	public static String[] readFile(String fileName) {
		QueueI<String> q; 
		q = new LLQueue();
		
		try
		{
		Scanner checkFiles = new Scanner(new File(fileName)); 
		while(checkFiles.hasNextLine())
		{
			String line = checkFiles.nextLine();
			//System.out.println(line);
			q.enqueue(line);
			
			
		}
		q.print();
		checkFiles.close();
		
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}
	
public static String[] readFileRobo(String fileName) {		
		try
		{
		Scanner checkFiles = new Scanner(new File(fileName)); 
		while(checkFiles.hasNextLine())
		{
			String line = checkFiles.nextLine();
			//for(int i =0; i<line.length();i++)
			{
				//System.out.println("O");
			}
			//System.out.println(line);
			//System.out.println(line.substring(5));
			
		}
		checkFiles.close();
		
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}
	
	 public static void youDone()
	   {
		   
		   boolean playGame;
		   System.out.println("Quit? Enter \"true\" to quit or hit enter to run another simulation");
		    
		    int a = 0;
			if(a == 0)
			{
			    String answer = keyboard.nextLine();
				if(answer.equals("true"))
				{
					System.out.println("Goodbye!");
					 System.exit(0);
				}
				else
				{
					//System.out.println("Not a vaild answer");		
				}
			}
	   }

}
