/*
 * Written by Savanna Shaver 
 */
import java.util.Scanner;
public class ByteConverter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an 8 bit binary number and I will convert it to a decimal");
		Scanner keyboard = new Scanner(System.in);
		String digits = keyboard.nextLine();
		
		Integer.parseInt(digits);
		// converts the string to int (ascii value)
		char first = digits.charAt(0);
		//reads the first digit of the binary number
		char second = digits.charAt(1);
		char third = digits.charAt(2);
		char forth = digits.charAt(3);
		char fifth = digits.charAt(4);
		char sixth = digits.charAt(5);
		char seventh = digits.charAt(6);
		char eigth = digits.charAt(7);
		//reads the eigth digit of the binary number
		
		int firstValue = ((first - 48)*2*2*2*2*2*2*2 );
		//reads the charater and tells if its a 0 or 1 and puts it 2^7
		int secondValue= ((second - 48)*2*2*2*2*2*2 );
		//gives the 0 or 1 to the 6th 
		int thirdValue= ((third - 48)*2*2*2*2*2 );
		//gives the 0 or 1 to the 5th and the pattern continues 
		int forthValue= ((forth - 48)*2*2*2*2);
		int fifthValue= ((fifth - 48)*2*2*2 );
		int sixthValue= ((sixth - 48)*2*2 );
		int seventhValue= ((seventh - 48)*2);
		int eigthValue= ((eigth - 48));


		int decimal = (firstValue + secondValue + thirdValue + forthValue + fifthValue + sixthValue + seventhValue + eigthValue);
		//gives the total sum of all the outputs	
		System.out.println("" +digits+ " in decimal form is " +decimal+ "");
		// prints the users binary input and the final sum of the values 
	}

};
