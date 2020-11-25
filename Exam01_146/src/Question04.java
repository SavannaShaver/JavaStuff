
/*
 * Savanna Shaver
 * CSCE 146 Exam01 Question04
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 * Testing is encouraged but remove all testing code before turning it in.
 */
//Do not alter------------------------------------------------------------------------
public class Question04 
{
	public class ListNode//Public for testing purposes
	{
		public double data;
		public ListNode link;
		public ListNode(double aData, ListNode aLink)
		{
			data = aData;
			link = aLink;
		}
	}
	public ListNode head;//Public for testing purposes
	public ListNode tail;//Public for testing purposes
		
	public double dequeue()
	{
//------------------------------------------------------------------------------------	
		//Write your code here

			if(head == null) 
				return 0.0;
			else
			{
				double ret = head.data; 
				head = head.link; 
				return ret;
			}
	
	

	}//Do not alter
	
	//Write any additional helper properties or methods here
	
	//--------------------------------------------------------------------------------
	
	public double enqueue(double data)
	{
		
		ListNode newNode = new ListNode(data,null);
		if(head == null) 
		{
			head = newNode; 
			tail = newNode;
			return 0.0;
		}
		tail.link = newNode; 
		tail = newNode;	
		return data;
	}
			

	
	//Test your code here. You may alter this as needed.
	public static void main(String[] args)
	{
		
		Question04 dQ = new Question04();
		for(double i=0;i<5;i++)
			dQ.enqueue(i);
		for(Question04.ListNode temp = dQ.head; temp != null; temp = temp.link)
			System.out.println(temp.data);
		
		
		//dQ.dequeue();
		System.out.println(dQ.dequeue());
		dQ.dequeue();
		//Printing Results
		System.out.println(dQ.dequeue());
		
	}
	//--------------------------------------------------------------------------------

}//Do not alter

/*Solution Description
*  For this problem I had to create a working queue, which I did by adding the enqueue method 
 *  and making it create a queue of double values from 0 to 4. Next in the problem I created my dequeue method
 *  which checks to make sure if the null is empty and if it is it will return 0.0. If the null is not empty then my
 *  code will create a double variable called ret and set it to the head data. Depending on how many times dequeue is called
 *  the head data will change to the next item each time making ret that new value of head. So if you were to call dequeue one time 
 *  with the numbers from the program than the answer would not be 1.0 it would just return 0.0 not because dequeue is empty 
 *  but because dequeue had not started at the head till called. So if dequeue was called 3 times than the program will return 2.0.
 */