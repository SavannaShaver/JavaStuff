/*
 * Written by Savanna Shaver 
 */
import java.util.Scanner;
public class SquardAndRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter a 4-digit number");
	// regular print statement 
	Scanner keyboard = new Scanner(System.in);
	String digits = keyboard.nextLine();
	// added a variable to hold the users input
	
	Integer.parseInt(digits);
	// feel I didn't really need this because Im not adding for a sum. I did 
	// it anyways because doesn't really hurt my program
	System.out.println("The number squared is: ");
	System.out.println(digits);
	// printed out the users input

	
	char first = digits.charAt(0);
	// I assigned the first charater of the input to the name first
	char second = digits.charAt(1);
	//I assigned the 2nd charater of the input to the name secound
	char third = digits.charAt(2);
	char forth = digits.charAt(3);
	
	// plug in the numbers by the pattern, so no matter what input it will print the same pattern
	System.out.println(""+ second + "  " + third + "" );
	// Was avle to print multiple things on the same line, by creating spaces and using the string to help begin to create the box form
	System.out.println(""+third+ "  " + second + "");
	System.out.println("" +forth+""+third+""+second+"" +first+"");
	
	System.out.println("The number squared rotated clockwise one space is: ");
	// reprinted the input in clockwise order 
	System.out.println("" +second+""+first+""+second+"" +third+"");
	System.out.println(""+third+ "  " + forth + "");
	System.out.println(""+forth+ "  " + third + "");
	System.out.println("" +third+""+second+""+first+"" +second+"");
	
	
	System.out.println("The number squared rotated clockwise again is: ");
	// reprinted the input in clockwise once again 
	System.out.println("" +third+""+second+""+first+"" +second+"");
	System.out.println(""+forth+ "  " + third + "");
	System.out.println(""+third+ "  " + forth + "");
	System.out.println("" +second+""+first+""+second+"" +third+"");

	

	}

}
