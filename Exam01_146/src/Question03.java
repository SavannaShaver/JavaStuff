
/*
 * Savanna Shaver
 * CSCE 146 Exam01 Question03
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 * Testing is encouraged but remove all testing code before turning it in.
 */
//Do not alter-----------------------------------------------------------------------
public class Question03 
{
	public class ListNode//public for testing purposes
	{
		public int data;//public for testing purposes
		public ListNode link;//public for testing purposes
		public ListNode(int aData, ListNode aLink)
		{
			data = aData;
			link = aLink;
		}
	}
	public ListNode head;//public for testing purposes
	public int getMaxValue()
	{
//-----------------------------------------------------------------------------------
		//Write your solution here

		ListNode temp = head;
		
		int max;
		if( head == null)
		{
			return 0;
		}
		else
		{
		
			max = head.data;
		}
		
		while(temp != null)
		{	
			if(max < temp.data)
			{
				
				max = temp.data;
			}
				head = head.link;
				temp = head;	
		}
		
		 return max;

	}//Do not alter this
	//Write additional methods or properties here
			
	//--------------------------------------------------------------------------------
	//Test your code here. You may alter this as needed.
	public static void main(String[] args)
	{
		//Example
		
		Question03 intLL = new Question03();
		intLL.head = intLL.new ListNode(4, 
				intLL.new ListNode(7, 
						intLL.new ListNode(5,
								intLL.new ListNode(8,
										intLL.new ListNode(1,null)))));
		
		for(Question03.ListNode temp = intLL.head; temp != null; temp = temp.link)
			System.out.println(temp.data);
		
		
		System.out.println(intLL.getMaxValue()); //This is what will print the max
	}
	//--------------------------------------------------------------------------------
}//Do not alter this

/*Solution Description
 * For this problem I first had to create a list node for the variable temp and set it to the head element.
 *  Then I created an integer variable called max which represents the highest  number in the linked list that 
 *  needs to be returned in the end. The next thing I did was check the program to see if the list was empty, if the
 *   head was null then the program would just return 0. Otherwise the problem would set max to equal the head data value. 
 *   Next I wrote a while statement that continues to loop as long as the variable temp is not null. I then created an if
 *    statement that checked to see if the data value of max was greater than the data value of the variable temp. If the
 *     valve temp was higher than the value max, the program will make the max variable  equal to temp value. Then it will
 *      iterate through making temp equal to the next value in the linked list and compare if the new temp value is greater
 *       than max. Which it will keep doing till it gets to the end of the list. If the max number is already higher than the
 *        temp value than the program will just move temp forward one each time. After you get to the end of the list the program 
 *        will leave the while loop and return the variable max and it will equal whatever the highest value in the list was.
 *         Then the max value of the linked list will be printed to the console. 
 */