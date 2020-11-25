package whatZodicSign;
/*
 * Savanna Shaver 
 */
import java.util.Scanner;
public class whatZodicSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your zodiac?  Enter your birthday! Month followed by Day!");
		String input = keyboard.nextLine();
		
		Scanner stringScanner = new Scanner(input);
		int month = stringScanner.nextInt(); // takes the first number in the string input
		int day = stringScanner.nextInt(); // takes the second number in the string input 
			
		if((month > 12 ) || (month < 1) || (day < 1) || (day > 31 ))	
			// this if statement is checking to make sure that the month entered is between 1 - 12 
			// and the day is kept between 1 -31 
		{
		System.out.println("Invalid month or day!");  // what is printed if the day or month is over the restriction 
		}
		else 
		{
		
		// the else statement is what will happen if the month and day or range 
		
		
		if(month == 1 && day >= 20 || month == 2 && day <= 18 )// || the bars are stating this or this other statement needs to be true
		// checks to see if the inputed data fits in the criteria for a aquarius
		{
		System.out.println("You are a aquarius!"); 
		}
		
		if(month == 2 && day >= 18 || month == 3 && day <= 20 )
		// checks to see if the inputed data fits in the criteria for a pisces
		{
		System.out.println("You are a pisces!"); 
		}
		
		if(month == 3 && day >= 21 || month == 4 && day <= 19  )
		// checks to see if the inputed data fits in the criteria for a aries this pattern contiunes for the rest of the if statements 
		{
		System.out.println("You are a aries!"); 
		}
		
		
		if(month == 4 && day >= 20 || month == 5 && day <= 20  )	
		{
		System.out.println("You are a taurus!"); 
		}
		
		if(month == 5 && day >= 21 || month == 6 && day <= 20  )	
		{
		System.out.println("You are a gemini!"); 
		}
		
		if(month == 6 && day >= 21 || month == 7 && day <= 22  )	
		{
		System.out.println("You are a cancer!"); 
		}
		
		if(month == 7 && day >= 23 || month == 8 && day <= 22  )	
		{
		System.out.println("You are a leo!"); 
		}
		
		if(month == 8 && day >= 23 || month == 9 && day <= 22  )	
		{
		System.out.println("You are a virgo!"); 
		}
		
		if(month == 9 && day >= 23 || month == 10 && day <= 22  )	
		{
		System.out.println("You are a libra!"); 
		}
		
		if(month == 10 && day >= 23 || month == 11 && day <= 21  )	
		{
		System.out.println("You are a scorpio!"); 
		}
		
		if(month == 11 && day >= 22 || month == 12 && day <= 21  )	
		{
		System.out.println("You are a sagittarius!"); 
		}
		
		if(month == 12 && day >= 22 || month == 1 && day <= 19  )	
		{
		System.out.println("You are a capricorn!"); 
		}
			
		
		}
		
		
		
			
		
	
	}

}
