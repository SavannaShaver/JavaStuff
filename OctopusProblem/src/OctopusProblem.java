/*
 * Savanna Shaver 
 */
import java.util.Scanner;
public class OctopusProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number greater than 0 and I'll count to it. Blub Blub");
		int input = keyboard.nextInt();
		keyboard.nextLine();
		if(input<=0)
		{
			System.out.println("No. Blub blub"); 
			System.exit(0);
		}
		for(int i=0; i<input; i++)
		{
			if(i%8 == 0)
			{
				System.out.println(i);
			}
		}
	}
	
		

}


