/*
 * Savanna Shaver 
 */
import java.util.Scanner;
public class OctalCalculator {

	
	public static final int OCTAL = 8 ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter a 4 digit octal number");
	String firstInput = keyboard.nextLine();
	//System.out.println(firstInput);
	
	System.out.println("Enter another 4 digit octal number");
	String nextInput = keyboard.nextLine();
	//System.out.println(nextInput);
	
	Integer.parseInt(firstInput);
	
	// converts the string to int (ascii value)
	char first = firstInput.charAt(0);
	//reads the first digit of the binary number
	char second = firstInput.charAt(1);
	char third = firstInput.charAt(2);
	char forth = firstInput.charAt(3);
	
	Integer.parseInt(firstInput);
	// converts the string to int (ascii value)
	char nextFirst = nextInput.charAt(0);
	//reads the first digit of the binary number
	char nextSecond = nextInput.charAt(1);
	char nextThird = nextInput.charAt(2);
	char nextForth = nextInput.charAt(3);
	
	
	
	int firstValue = ((first - 48) * 512); //gets the first letter value from the first number input and multiples it by 8 to the 4th 
	int secondValue= ((second - 48) * (64)); // gets the second and multi. by 8 to the 3rd
	int thirdValue= ((third - 48)*(8)); 
	int forthValue= ((forth - 48)*(1));
	
	
	int nextfirstValue = ((nextFirst - 48) * 512); //gets the first letter value from the second number input and multiples it by 8 to the 4th
	int nextsecondValue= ((nextSecond - 48) * (64));
	int nextthirdValue= ((nextThird - 48)*(8));
	int nextforthValue= ((nextForth - 48)*(1));
	
	int firstDecimal = (firstValue + secondValue + thirdValue + forthValue); //gives the total for the first 
	int nextDecimal = (nextfirstValue + nextsecondValue + nextthirdValue + nextforthValue);
	
	int totalDecimal = (firstDecimal + nextDecimal); // gives the total decimal of both added together.
	System.out.println("The first number is " + firstDecimal + "");
	System.out.println("The second number is " + nextDecimal + "");
	
	System.out.println("Added together is " +  totalDecimal + "");
	
	int newVal = (int)(totalDecimal / OCTAL ); 
	// formula that takes the total decimal amount / 8 

	int lastDig = (int)( totalDecimal % OCTAL); //gives me the last dig when you convert the decimal to octal 
	int thirdDig = (int)(newVal % OCTAL);//gives me the 3rd dig when you convert the decimal to octal
	int v = (int)(newVal / OCTAL ); 
	int secDig = (int)( v % OCTAL); //gives me the 2nd dig when you convert the decimal to octal
	int va = (int)(v / OCTAL ); 
	int firstDig = (int)( va % OCTAL); //gives me the first dig when you convert the decimal to octal
	
	System.out.println("Which is " +firstDig+"" +secDig+"" +thirdDig+"" +lastDig+ " in octal");
	

	
	
	
	}

}
