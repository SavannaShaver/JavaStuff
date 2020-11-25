/*
 * Written by Savanna Shaver 
 */
import java.util.Scanner;
public class CoinMachine {
	
	public static final int QUARTERS = 25;
	public static final int DIMES = 10;
	public static final int NICKELS = 5;
	public static final int PENNIES = 1;
	// all the above are the constants, because there values dont change
	public static void main(String[] args) {
	System.out.println("Enter a whole number from 1 to 99. The machine will determine a combination of coins.");
	Scanner keyboard = new Scanner(System.in);
	int totalValue = keyboard.nextInt();
	// will accept the users input value 
	System.out.println(""+ totalValue + " cents in coins:");
	
	int numQuarters = (int)( totalValue / QUARTERS); 
	// formula that gives the total amount of quarters in a value
	System.out.println("" +numQuarters+ " Quarters");
	int rmQuarter = (int)( totalValue % QUARTERS); 
	//^gave me the left over value of cents after taking quarters out
	//System.out.println("" +rmQuarter+ "");
	
	int numDimes = (int)(rmQuarter/DIMES);
	System.out.println("" +numDimes+ " Dimes");
	int rmDimes = (int)(rmQuarter % DIMES);
	//^ gave me the left over value of cents after taking quarters and dimes 
	//System.out.println(rmDimes);
	
	int numNickles = (int)(rmDimes / NICKELS);
	System.out.println(""+numNickles+" Nickles");
	int rmNickles = (int)(rmDimes % NICKELS);
	//System.out.println(rmNickles);
	
	int numPennies = (int)(rmNickles / PENNIES);
	// tells how many 1s(pennies) can fit in the value left
	System.out.println(""+numPennies+" Pennies");

	}
}
