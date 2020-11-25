import java.util.Scanner;
/*
 * Written by Savanna Shaver
 */
public class MovieDatabaseFrontEnd {

	public static void main(String[] args) {
		//String endGame = "";
		boolean run = true;
		System.out.println("Welcome to the Movie Database");
		GenLL<String> strLL = new GenLL <String>();
		while (run) { 
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Enter 1 : to Add a Movie");
			System.out.println("Enter 2: to Remove a Movie by Title ");
			System.out.println("Enter 3 : Search for Movies by Title");
			System.out.println("Enter 4 : Print All Movies");
			System.out.println("Enter 9 : to Quit");
			
		
			for(int i=4; i>=0; i--)
			{
				//strLL.add("str:" + i);
			}
			String answer = keyboard.nextLine();
			if(answer.equals("1"))
			{
				
				System.out.println("Enter a movie name");
				String movie = keyboard.nextLine();
				
				strLL.add(movie);
				
			}
			
			else if(answer.equals("2"))    //strLL.cotains(input);
			{
				System.out.println("Enter the movie's name to remove");
				String rmMovie = keyboard.nextLine();
				
				//strLL.setCurrent(rmMovie);
				
				//boolean remove;
				strLL.reset();
				
				while(strLL.hasMore())
				{
					
				    if(strLL.getCurrent().equals(rmMovie)) 
					{
				    		
						strLL.removeCurrent();
					
					}
					else
					{
						strLL.gotoNext();
					}
					
				}
				
				
			}
			else if(answer.equals("3"))    //strLL.cotains(input);
			{
				System.out.println("Enter the movie's name to check if it is in the list");
				String input = keyboard.nextLine();
				if(strLL.contains(input))
				{
					System.out.println("true");
				}
				else
				{
					System.out.println("false");
				}
			}
			else if(answer.equals("4"))
			{
				 strLL.print();
			}
			else if(answer.equals("9"))
			{
				 run = false;//System.exit(0); 
				 System.out.println("Goodbye");
			}
			else
			{
			  System.out.println("Invalid Input");
			}
			
			
					
		}
		
		

	}
	

}
