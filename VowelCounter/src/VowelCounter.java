
/*
 * Savanna Shaver
 */
import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Welcome to the vowel counter and sorter!");
	System.out.println("Enter a phrase!");
		
	char[] vowels = {'a','e','i', 'o','u','A','E','I','O','U'};
	
	
	
	int u = 0; //gets addeded to as u is typed 
	int o = 0;
	int iValue = 0;
	int e = 0;
	int a = 0;
	
	String phrase = keyboard.nextLine();
	
	for(int i = 0; i < phrase.length(); i++)
	{
		
		char testing = (phrase.charAt(i)); // checks each charater inside the string
		
		
		if(testing == vowels[0])
		{
		  a++;
		}
		else if(testing == vowels[1])
		{
		  e++;
		}
		else if(testing == vowels[2])
		{
		  iValue++;
		}
		else if(testing == vowels[3])
		{
		  o++;
		}
		else if(testing == vowels[4])
		{
		  u++;
		}
		else if(testing == vowels[5])
		{
		  a++;
		}
		else if(testing == vowels[6])// lets me check for caps 
		{
		  e++;
		}
		else if(testing == vowels[7])
		{
		  i++;
		}
		else if(testing == vowels[8])
		{
		  o++;
		}
		else if(testing == vowels[9])
		{
		  u++;
		}




	
	}
	
	int[] count = new int[5];// creates an array of five 
	count[0] = a;
	count[1] = e; 
	count[2] = iValue; 
	count[3] = o; 
	count[4] = u; 
	
	boolean hasSwapped = true;
	while(hasSwapped == true)
	{
		hasSwapped = false;
		for(int i = 0; i < count.length-1; i++)
		{
			if(count[i] >count[i+1])
			{
				int check = count[i];
				count[i] = count[i+1];
				count[i+1] = check;
				hasSwapped = true; 
				
				char copy2 = vowels[i];
				vowels[i] = vowels[i+1];
				vowels[i+1] = copy2;
				hasSwapped = true; 
			}
		}
	}
		
	for(int i = 0; i <count.length; i++)// keeps going for the amount inside count
	{
			System.out.println(vowels[i] + " " + count[i]); // prints the accending order
	}
		
	System.out.println();
	
	
	}
	

}
