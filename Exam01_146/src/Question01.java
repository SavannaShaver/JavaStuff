/*
 *Savanna Shaver
 * CSCE 146 Exam01 Question01
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
public class Question01 {

	public static boolean largerComponents(int[] a, int[] b)
	{
//-----------------------------------------------------------------------------------	
		//Write your solution here
		int count = 0;
		if(a.length != b.length)
		{
			return false;
		}
		else
		{
			for(int i = 0; i<a.length; i++)
			{
				if(a[i] > b[i])
				{
					count ++;
					if(count == a.length)
					{
						return true;
					}
				}
			}
			return false;
			
		}
		
		
		
	}//Do not alter this
	//Write any additional helper properties or methods here
	
	//--------------------------------------------------------------------------------
	//Test your code here. You may alter this as needed.
	public static void main(String[] args)
	{

		int[] test01 = {5,4,3};
		int[] test02 = {2,1,0};

		System.out.println(largerComponents(test01,test02));
	}
	//--------------------------------------------------------------------------------
}//Do not alter this

/*Solution Description
 * For this problem the first step to solving it was making sure it returned false if the size of the two arrays did not match. 
 * So, I set up an if statement that compares the length of array a to the length of array b and returns false if the
 *  two arrays are not the same length or size. Next, I created the else statement below, which I put a for loop in.
 *   The for loop will run the length of the first array a. I then created an if statement inside the for loop, to 
 *   check if the value at i in array a is bigger than the value i in array b. If the statement turned out to be
 *    true then the integer variable count would increase by one. The program will iterate this process for however 
 *    long the length of array a is and if at the end the count variable equals the length of array a then we know that
 *     all the values in the array a where bigger than b and it will return true. However, if the variable count does
 *      not equal the length of array a then we know that somewhere in array b there was a value greater than in a and
 *       the program will return false. Please note I am assuming that the question wanted the first array to be a and 
 *       that the second array to be b. 
 */