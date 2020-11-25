/*
 * Savanna Shaver 
 */


import java.util.Scanner;
public class MorningRoutine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Are you wearing pants?");
		boolean isWearingPants = keyboard.nextBoolean();
		keyboard.hasNextLine(); //fix-up after nextInt nextDouble next Boolean
		if(isWearingPants == true)// no semicolon
		{
		 System.out.println("Nice pants!"); 
		 
		}
		else 
		{
			System.out.println("Try again");
		}
		
		
		
	}

}
