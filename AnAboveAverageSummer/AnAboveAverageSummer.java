/*
 * Savanna Shaver
 */

import java.util.Random;
import java.util.Scanner;
public class AnAboveAverageSummer {

	public static final double TOTAL_DAYS = 10;// using because their is a fixed number of days
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		double[] temps = new double[10]; 
		System.out.println("Welcome to the above average temperature tester program.");
		System.out.println();
		
		double avgTemp = 0;
		
		int a = 0;
		double j = 0;
		
		
		for(int i = 0; i < temps.length  ; i++) //keeps happening till i is greater then the length of temps
		{
			
			System.out.println("Please enter the temperature for day "+(i + 1 )+""); 
			temps[i] = keyboard.nextDouble();
			keyboard.nextLine();
			
			a = i ;
			j = temps[i];
		
			avgTemp += temps[i];
			
			
		}
		
		
		double totalAvg = (avgTemp / TOTAL_DAYS);// gives the total avg
		System.out.println("The average temperature was "+totalAvg+"");
		System.out.println("The days that were above average were");
		
		
		
		for(int i = 0; i < temps.length  ; i++)// 
		{
			if(temps[i] > totalAvg)// if the temp is greater than the avg then something will happen
			{
				System.out.println("Days "+(i +1)+" with "+temps[i]+"");// prints the changing values
			}
			
			//System.out.println("Days "+a+ " with "+j+"");
			
	    }
		System.out.println();
		System.out.println("Done!");
		
		
		
		
		
		
		
 		
	}

}
