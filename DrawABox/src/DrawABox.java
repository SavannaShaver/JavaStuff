import java.util.Scanner;
public class DrawABox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a strictly positive length and width and I'll draw a box");
		int length = keyboard.nextInt();
		int width = keyboard.nextInt();
		
		if(length <=0 || width <=0)
		{
			System.out.println("Length or width was wrong");
			System.exit(0);
		}
		
		for(int i = 0; i < length; i++)
		{
		    for(int j = 0; j < width; j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println("");
		}

		

	}

}
