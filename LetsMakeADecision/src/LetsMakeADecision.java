/*
 * Savanna Shaver
 */
import java.util.Scanner;
public class LetsMakeADecision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		//Init
		String cont1Prize = "nothing";
		String cont2Prize = "nothing"; 
		
		String boxPrize = "A nice rock";
		String pocketPrize = "Free 100 on an assignment";
		String dollarPrize = "Cris $1 bill";
		
		System.out.println("Welcome to lets meake a decision\n "
				+ "Contestant 1 Enter to \"keep\" to keep the dollar\n "
				+ "\"pocket\"\n"
				+ "\"box\"");
		String answer = keyboard.nextLine();
		if(answer.equals("box"))
		{
			cont1Prize = boxPrize; 
			System.out.println("Contestant 2 \nEnter \"keep\" or \"pocket\"");
			answer = keyboard.nextLine();
			if (answer.equals("pocket"))
			{
			 cont2Prize = pocketPrize;
			}
			else if(answer.equals("keep"))
			{
			 cont2Prize = dollarPrize;
			}
			else
			{
				System.out.println("No you get nothing! Good day Sir");
				
			}
		}
				

	}

}
