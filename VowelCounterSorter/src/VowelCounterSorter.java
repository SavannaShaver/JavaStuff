/*
 * Savanna Shaver
 */
import java.util.Scanner;
public class VowelCounterSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the vowel counter and sorter!");
		System.out.println("Enter a phrase!");
		
		//String[] vowels = {"A","a","E","e","I","i", "O","o", "U","u"};
		
		int u = 0;
		int o = 0;
		int i = 0;
		int e = 0;
		int a = 0;
		
		
		
		String phrase = keyboard.nextLine();
		
		for(int j = 0; j < phrase.length(); j++)
		{
			
			char testing = (phrase.charAt(j));
			
			if(testing == 'a')
			{
			 a ++;
			}
			else if(testing == 'A' )
			{
			 a ++;
			}
			else if(testing == 'e' )
			{
			 e ++;
			}
			else if(testing == 'E' )
			{
			 e ++;
			}
			else if(testing == 'i' )
			{
			 i ++;
			 
			}
			else if(testing == 'I' )
			{
			 i ++;
			}
			else if(testing == 'o' )
			{
			 o ++;
			}
			else if(testing == 'O' )
			{
			 o ++;
			}
			else if(testing == 'u' )
			{
			 u ++;
			}
			else if(testing == 'U' )
			{
			 u ++;
			}
			
			
			
			
						
		}
		
		
	int vowels[0] = (int)a;
	int vowels[1] = e; 
	int vowels[2] = i; 
	int vowels[3] = o; 
	int vowels[4] = u; 
	
	

	boolean hasSwapped = true;
	while(hasSwapped == false)
	{
		boolean hasNotSwapped = true;
		for(int s = 0; s< vowels.length(); s ++)
		{
			if(vowels[s] <vowels[s-1])
			{
				int firstCheck = vowels[s];
				vowels[s] = vowels[s-1];
				vowels[s-1] = firstCheck;
				hasSwapped = true; 
				
			}
		}
	}
		
	//prints the sorted array
	for(int s = 0; s <vowels.length; s++)
	{
		System.out.print(vowels[s] +"");
	}
		
		
		
		System.out.println();
		System.out.println("u " + u + "");
		System.out.println("o " + o + "");
		System.out.println("i "+ i + "");
		System.out.println("e " + e + "");
		System.out.println("a "+ a+ "");
	}

}
