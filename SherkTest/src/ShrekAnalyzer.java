import java.util.Scanner;
import java.io.*; // allows you to read the files must have!!
public class ShrekAnalyzer {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Analyzer. \n Enter a word and will count how many times it  appears in a file");
		String word = keyboard.nextLine();
		System.out.println("The word " + word + " was found " + lookForWord(word) + " times"); // comes from the statci method below
	}
	
	public static int lookForWord(String word) // string word would be the word they typed in the main method.
	{
		//static and dynamic have to return something void main doesnt
		int ret = 0;
		try
		{
			Scanner fileScanner = new Scanner(new File("./fakeprizeList.txt")); // allows us to open our document in the try block to read
			while(fileScanner.hasNext()) // this allows to look word for word in the file
			{
				String next = fileScanner.next(); //is the next word in the file
				System.out.println(next);
				//if(next.contentEquals(word)) // checks to see if the word you are on equals the word entered
				//if(next.equalsIgnoreCase(word))
				if(next.toUpperCase().contains(word.toUpperCase()))
				{
					ret ++;
				}
		
			}
			fileScanner.close(); //must have
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ret;
	}
}
