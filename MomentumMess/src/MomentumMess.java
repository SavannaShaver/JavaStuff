/*
* Written by Savanna Shaver 
*/
import java.util.Scanner;
public class MomentumMess {
	
	public static final double POUNDS2KG = 0.453592;
	public static final double MILES2METERS = 0.44704;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("We are going to convert and calculate momentum and kinetic energy!");
		// the above statement is a print line
		System.out.println("First enter the mass of the object(lbs)");
		//setting up scanner to get user info
		Scanner keyboard = new Scanner(System.in);
		double mass = keyboard.nextDouble();
		// using the double gives us decimals with the users input
		keyboard.nextLine();
		
		// something you have to have after using the double and keyboard together
		System.out.println("First enter the velocity of the object(mph)");
		double velocity = keyboard.nextDouble();
		// another statement to accept user data 
		double kg = (mass * POUNDS2KG); 
		// What I printed to help me figure out my math errors - System.out.println(kg); 
		double meters = (velocity * MILES2METERS); 
		// Using the constant and manipulated it by multiplying it ( so its doing 0.44704 * velocity)
		//What I printed to help me figure out my math errors- System.out.println(meters);
		double momentum =(kg * meters);
		double kineticEnergy = (momentum * momentum )/(2 * kg );
		// formula for kinetic energy
		System.out.println("The momentum and potential energy for an object whose mass is " +mass+ " lbs and is moving at "+velocity+" mph is");
		System.out.println(""+momentum+" kgm/s and " +kineticEnergy+ " J");
		// created another print statement with variables for a cleaner output message.

		
	}

}
