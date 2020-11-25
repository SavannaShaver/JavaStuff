/*
 * Savanna Shaver
 */
import java.util.Scanner;

public class DateAndTimeTester {
	
	
	public void run()
	{
		
		boolean playing = true;
		while(playing!= false)
		{
			System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is vaild");
			
	
			Scanner keyboard = new Scanner(System.in);
			
			String input = keyboard.nextLine();
			//int month = keyboard.nextInt();
			int m = getMonth(input);
			//System.out.println(m);
			int d = getDay(input);
			//System.out.println(d);
			int h = getHour(input);
			//System.out.println(h);
			int mintunes = getMins(input);
			//System.out.println(mintunes);
			isValid(m,d,h,mintunes);
			
			System.out.println("Would you like to exit? Type \"quit\" to exit or type ENTER to continue");
			String done = keyboard.nextLine();
			if(done.contentEquals("quit"))
			{
				
				System.out.println("Program Done");
				System.exit(0);
				
			}
			if(done.equals("ENTER"))
			{
				playing = true; // the program only happens again if the var done equals ENTER
			}
		}
		
		
		
		
	
	}
	
		
	
	public int getMonth(String input)
	{
		int slash = input.indexOf("/");
		//gets every letter from the start to /	
		String monthString = input.substring(0,slash);
		int month = Integer.parseInt(monthString);
		input = input.substring(slash+1);
		
		return month;
		
	}
	
	public int getDay(String input)
	{
		int slash = input.indexOf("/");
		int space = input.indexOf(" ");
		String dayString = input.substring(slash+1,space);
		int day = Integer.parseInt(dayString);
		
		
		return day;
		
	}
	
	public int getHour(String input)
	{
		int space = input.indexOf(" ");
		int dots = input.indexOf(":");
		String hourString = input.substring(space+1,dots);
		int hour = Integer.parseInt(hourString);
		
		return hour;
		
	}
	
	public int getMins(String input)
	{
		//int space = input.indexOf(" ");
		int dots = input.indexOf(":");
		String minsString = input.substring(dots+1,input.length());// gives the nums for the mins : to end
		int mins = Integer.parseInt(minsString);
		
		return mins;
		
	}
	
	public void isValid(int m, int d, int h,int mintunes)// im calling the variables that have already been called like python
	{
		if(m > 12 || m  < 1 || d > 31 || d < 1 || h > 12 || h < 1 || mintunes > 60 || mintunes < 0)
		{
			System.out.println("The date and time is not valid");
		}
		else if(m == 2)
		{
			if(d > 28)
			{
				System.out.println("The date and time is not valid");
			}
			else
			{
				System.out.println("The date and time is valid!");
			}
		}
		else
		{
			System.out.println("The date and time is valid!");
		}
		
		
		
	}
	

}

