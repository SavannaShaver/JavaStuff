/*
 * Savanna Shaver 
 */
import java.util.Scanner;
import java.util.Random;
public class NumberGuesser {
	
	public static final int MAX_VAL = 100; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner keyboard = new Scanner(System.in);
	int secretNumber; 
	Random r = new Random();
	secretNumber = r.nextInt(MAX_VAL);
	boolean correctGuess = false;
	System.out.println("Enter a value between 0 and "+(MAX_VAL-1));
	while(!correctGuess)
	{
      int guessNumber = keyboard.nextInt();
      keyboard.nextLine();
      // 4 [Enter] => "4\n"
      //nextInt takes the 4 but not the "\n"
      //nextLine takes care of the "\n"
      if(guessNumber > secretNumber)
      {
    	 System.out.println("That's to high");
      }
      else if(guessNumber < secretNumber)
      {
    	 System.out.println("Thats too low!"); 
      }
      else 
      {
    	  correctGuess = true;
    	  System.out.println("Game over a winner is you"); 
      } 
     
      
	}
	}

}
