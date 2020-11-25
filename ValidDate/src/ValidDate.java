/*
 * Savanna Shaver
 */
import java.util.Scanner;
public class ValidDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Enter a date in the format month/day/year");
	String orginialInput = keyboard.nextLine();
	String input = orginialInput;
	String copyInput = input;
	

			
	//Finds the first / 
	int slash = input.indexOf("/");
	//gets every letter from the start to /
	String month = input.substring(0,slash);
	// turns month into a number
	int getMonth = Integer.parseInt(month);
	//re-defines the input so we can read till the next /  
	input = input.substring(slash+1);
	
	
	//Gets the day variable
	slash = input.indexOf("/");
	String getTheDay = input.substring(0,slash);
	int getDay = Integer.parseInt(getTheDay);
	input = input.substring(slash+1 );
	
	
	int year = Integer.parseInt(input);
	
	
	if((getMonth > 12 ) || (getMonth < 1)) //makes sure your month is between 1-12 and days between 1-31 
	{
	System.out.println("Invalid month ");  // what is printed if the day or month is over the restriction 
	}
	else if (getMonth == 2 )
	{
		if(getDay == 29)
		{
		   	
		   if ((year % 4 == 0 &&  year % 100 != 0 || year % 400 == 0)) // checks to make sure its a leap year
		   {
			   System.out.println(""+orginialInput+ " is a valid date!");
		   }
		   else
		   {
			   System.out.println(""+orginialInput+ " is invalid! The date given is not a leap year.");
		   }
		}
		else if( getDay <1 || getDay > 28)// checks to see if the day falls between 1 -28 or not
		{
			System.out.println(""+orginialInput+ "is a invalid date!"); 
		}
		else
		{
			System.out.println(""+orginialInput+"is a valid date!");
		}
	}
	else if ((getMonth ==  4) || (getMonth ==  6  ) || (getMonth == 9) || (getMonth ==  11 )) // makes sure the months with 1-30 are checked
	{
		if(getDay > 30|| getDay < 1)// checks to see if the day falls between 1 -30 or not
		{
			 System.out.println(""+orginialInput+ " is invalid! The day is wrong for this month. Must be between 1 and 30.");
		}
		else
		{
			System.out.println(""+orginialInput+ " is a valid date!");
		}
	
	}
	else 
	{
	 if (getDay >  31)
	 {
	   System.out.println(""+orginialInput+ " is a invalid date!");
	 }
	 else
	 {
		System.out.println(""+orginialInput+ " is a valid date!");
	 }
		 
	}
}
}
