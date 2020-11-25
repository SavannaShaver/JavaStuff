/*
 * <<Savanna Shaver>>
 * CSCE 146 Exam02 Question01
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter-----------------------------------------------------------------------
public class Question01 {

	public static void sort(Waffle[] waffles)
	{
//-----------------------------------------------------------------------------------	
		//Write your solution here

		int size = waffles.length;
		if(size < 2)
			return;
		int mid = size/2;
		int leftSize = mid;
		int rightSize = size - mid;
		Waffle[] left = new Waffle[leftSize];
		Waffle[] right = new Waffle[rightSize];
		for(int i=0; i <mid; i++)
			left[i] = waffles[i];
		for(int i = mid; i< size; i++)
		{
			right[i-mid] = waffles[i];
		}
		sort(left);
		sort(right);
		merge(left,right,waffles);
		
	}//Do not alter this
	//Write any additional helper properties or methods here
	public static void merge(Waffle[] left,Waffle[] right,Waffle[] waffles)
	{
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0;
		int j = 0;
		int k = 0;
		while(i <leftSize && j < rightSize)
		{
			if(left[i].getPockets() <= right[j].getPockets())
			{
				waffles[k] = left[i];
				i++;
				k++;
			}
			else
			{
				waffles[k] = right[j];
				j++;
				k++;
			}
			
		}
		while(i< leftSize)
		{
			waffles[k] = left[i];
			k++;
			i++;
		}
		while(j<rightSize)
		{
			waffles[k] = right[j];
			k++;
			j++;
		}
	}
	//--------------------------------------------------------------------------------
	//Test your code here. You may alter this as needed.
	public static void main(String[] args)
	{
		Waffle[] array = {new Waffle(10),
				new Waffle(5),
				new Waffle(3),
				new Waffle(1),
				new Waffle(8),
				new Waffle(6)};
		sort(array);
		for(Waffle w : array)
			System.out.println(w);
	}
	//--------------------------------------------------------------------------------
}//Do not alter this


/*Solution Description
 * For this problem I wrote a sorting algorithm for an array of Waffles that runs with a Big O time complexity of O(nlg(n)).  
 * I created a merge sort method to get my desired result of the values being printed in order from lowest to highest, the reason
 * I chose merge sort over quick sort was because though quick sort also has a similar average big O complexity to that of the 
 * problem when stating the Big O complexity your typically asking for its worst case and quicksort's is actually 0(n)^2. After deciding
 *  to sort the problem with merge sort whose complexity is 0(nlg(n). I then had to write the merge sort to work with an array of a type object, its very similar to a 
 *  merge sort method with just integers but instead I had to create new Waffle types in the main method. In the sort method the big change
 *  with using Waffles is I was measuring by the amount of pockets in them so I had to use getPockets() to pull from my Waffle class the 
 *  amount each waffle had of pockets and then compare each waffle in the arrays to one another. My program will merge each time the left and right array
 *  together by putting the side that is smallest in first then adding the other side behind until there are no array's left to compare
 *  and we just have one big merged array in the correct order. Lastly in the question it said to assume I had no null elements so 
 *  I didn't do anything to look for null elements.
 
 */