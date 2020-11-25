
/*
 * Savanna Shaver
 * CSCE 146 Exam01 Question02
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 * Testing is encouraged but remove all testing code before turning it in.
 */
//Do not alter-----------------------------------------------------------------------
public class Question02 
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
	public void insertDoubles()
	{
//-----------------------------------------------------------------------------------
		//Write your solution here
		
		
		ListNode temp = head;
		
		
		if(head == null)
		{
			return;
		}
		else
		{
			while(temp != null)
			{
				
				System.out.println(temp.data);
				ListNode newNode = new ListNode(temp.data *2 ,null);
				System.out.println(newNode.data);
			
				head = head.link;
				temp = head;
	
			
			}
			
			
		
		}
		
	}//Do not alter this
	//Write additional methods or properties here
			
	//--------------------------------------------------------------------------------
	//Test your code here. You may alter this as needed.
	public static void main(String[] args)
	{
		//Example
	
		Question02 intLL = new Question02();
		intLL.head = intLL.new ListNode(0, 
							intLL.new ListNode(1, 
									intLL.new ListNode(2,
											intLL.new ListNode(3,
													intLL.new ListNode(4,null)))));
		intLL.insertDoubles();
		//Printing Results
		for(Question02.ListNode temp = intLL.head;temp != null; temp = temp.link)
			System.out.println(temp.data);
			
	}
	//--------------------------------------------------------------------------------
}//Do not alter this

/*Solution Description
 * I started by creating the ListNode temp and set it equal to head. I then created the if statement
 *  to check  if the head was null and if it is it then we know the linked list is empty and that
 *   means the directions want us to return nothing. So i included a return statement inside the if
 *    statement that will of course return nothing to the console . I then created an else statement 
 *    to go off of the same if statement I was just working on, where I created a while loop inside 
 *    that else statement and it will run as long as the Listnode temp is not null. Now technically 
 *    for this problem that would mean it could run forever but I tried to deal  with that by limiting
 *     the values it reads by iterating through the list. So I first printed the data from the
 *      Listnode temp and then I created a new  instance of the ListNode called newNode and  I set it
 *       to have a value equal to the  Listnode temp’s data value times 2. I also set the link to 
 *       null, because I didn't want it to move anywhere new yet. Then I print the data from the
 *        newNode and it returns a value doubled from the temp. Lastly I make sure the program only 
 *        runs for the amount of numbers I have so I set the head to the next node over in the linked
 *         list and have the temp equal the head again. This will let it run  for the amount of numbers 
 *         given in the bottom tester area. 
 */