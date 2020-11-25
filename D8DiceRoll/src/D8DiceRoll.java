/*
 * Savanna Shaver 
 */
import java.util.Scanner;
import java.util.Random;// important random function, java needs to use random() methods
public class D8DiceRoll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random(); //this is the random function
		
		
		System.out.println("Enter the number of times an 8-sided die should be rolled");
		int input = keyboard.nextInt();
		//System.out.println(input);
		
		int one = 0;// starts the var one off at zero, so i can add to it later
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		
		
		for(int i = 0; i<= input-1; i++ )// this is a for loop so the num the user enters in the console, the function 
										//will happen that many times. 
		{
		int randNum = rand.nextInt(8);// gives a random num from 0 - 8. only when rand num var is called 
		randNum +=1;// makes the min move up to 1 so its 1-8
		System.out.println("" + randNum +" was rolled");// tells the random num with a print statement
		
		if(randNum == 1)// bc the if statement is inside the for loop, every new random num will go through this if statement
		{
			one +=1;// this will add one to the variable one 
		}
		
		if(randNum == 2)// bc the if statement is inside the for loop, every new random num will go through this if statement if true the statement below happens 
		{
			two +=1;// this will add one to the variable two, this pattern cont. with the rest of the if statement
		}
		
		if(randNum == 3)  
		{
			three +=1;
		}
		
		if(randNum == 4)
		{
			four +=1;
		}
		
		if(randNum == 5)
		{
			five +=1;
		}
		
		if(randNum == 6)
		{
			six +=1;
		}
		
		if(randNum == 7)
		{
			seven +=1;
		}
		
		if(randNum == 8)
		{
			eight +=1;
		}
		}
		
		

		System.out.println("One:"+one+"");// prints the amount of ones that were randomly picked out of the user entered num. 
		System.out.println("Two:"+two+"");//prints the amount of two
		System.out.println("Three:"+three+"");
		System.out.println("Four:"+four+"");
		System.out.println("Five"+five+"");
		System.out.println("Six:"+six+"");
		System.out.println("Seven:"+seven+"");
		System.out.println("Eight:"+eight+"");
		
	}

}
