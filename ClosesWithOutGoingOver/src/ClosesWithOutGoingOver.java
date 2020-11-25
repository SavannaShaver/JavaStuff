import java.util.Scanner;
public class ClosesWithOutGoingOver {

	
	public static final double ACTUAL_PRICE = 12.21;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		double[] prices = new double[10]; 
		System.out.println("Enter some prices without going over");
		//Populating
		for(int i = 0; i < prices.length; i++)
		{
			System.out.println("Contestant number "+i+" Enter a value");
			prices[i] = keyboard.nextDouble();
			keyboard.nextLine();
		}
		int winIndex = -1;
		double winPrice = 0.0;
		for(int i = 0; i <prices.length; i++)
		
		{
			if(prices[i] <= ACTUAL_PRICE && prices[i] > winPrice);
			{
				winPrice = prices[i];
				winIndex = i;
			}
		}
		
		if(winIndex ==-1)
		{
			System.out.println("No one wins");
			
		}
		else
		{
			System.out.println("Contest "+winIndex+ " won with a guess of " +winPrice+"");
		}
 		
			// question number 4 on the exam is about arrays and you need a for loop to answer it.
	}

}
