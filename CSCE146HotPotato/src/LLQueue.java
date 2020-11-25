/*
 * Written by Savanna Shaver
 */
public class LLQueue <T> implements QueueI<T> { // this is a generic linked list that uses the interface QueueI

	private class ListNode // you create your node
	{
		T data;
		ListNode link;
		public ListNode(T aData, ListNode aLink) // creating your parameterized constructor
		{
			data = aData;
			link = aLink;
			
		}
	}

	private ListNode head;// have to have a head in linked list. Head is the first elemetn
	private ListNode tail; // tail is the actual last element
	private int size;
	// no need for previous, current or anything fancy for queues head and tail should be enough
	public LLQueue() // constructor 
	{
		head = tail = null; // setting these spots in the list to nothing. NOT THE DATA IS NOTHING, JUST THAT THEIR IS NO HEAD ELEMENT OF TAIL ELEMENT POINTER AT THE MOMENT
	}
	public void enqueue(T aData) 
	{
		ListNode newNode = new ListNode(aData,null); // creating a list another node. the setup should always have null in it (QUEUES part 01 29:29)
		if(head == null) // this is checking if the list is empty
		{
			head = tail = newNode; // so then you store both head and tail to the newNode( element) you created when using enqueue. Its the only item so it should be the head and the tail
			size = 1;
			return;
		}
		tail.link = newNode; // then the null tail link will now equal the newNode 
		tail = tail.link;// now we make the tail function link or pointer equal the newNode link?
		size ++; // for every item added to your list the size is one bigger
		
	}
	public T dequeue() // we remove and we return the first element
	{
		if(head == null) // if there isnt a head return that
			return null;
		T ret = head.data; // otherwise the return value equals the head data
		head = head.link; // then we advance the element further
		size--; //for every size removed from your list the size is one less
		return ret;
		 
		
	}
	public T peek() // observes first element
	{
		if(head == null) // if the element is empty return that 
			return null;
		return head.data; // else it will return the first element what ever it is
	}
	public void print()
	{
		for(ListNode temp = head; temp!= null; temp = temp.link) // so while the temp isnt empty then the temp is equal to the next link in the list. This is like i++
			System.out.println(temp.data); // print the data in the list 
			
	}
	public int size()
	{
		return this.size;
	}
}