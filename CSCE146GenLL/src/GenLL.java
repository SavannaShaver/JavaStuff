
public class GenLL <T> { // that gives a generic list of whatever type t is   
	private class ListNode// this is a node , outside of this class its inaccesable
	{
		//groups data together
		T data;
		ListNode link;// ListNode is an object type and link holds a memory address 
		
		 public ListNode(T aData,ListNode aLink)// parameterized constructor so we can make a instance (object) for the data
		 {
			 data = aData; // aData only holds a memory address 
			 link = aLink;
		 }
	
	}
	
	private ListNode head; // First element inside of a list structure // 
	private ListNode current; // current node of interest  suppose to help modify information outside of something?
	private ListNode previous; // one node behind current
	// we cant set head current or previous to anything directly
	public GenLL()
	{
		head = current = previous = null; //he says head is pointing to current and current is pointing to previous and that means they all point to null
	    // we have now created a linking structure 
	}
	public void add(T aData) // THIS WILL ALLOW us to add a link to a node at the very end of the list 
	{
		//aData is the information being set in the nodes data spot
		ListNode newNode = new ListNode(aData,null);
		if(head == null) // this is checking if the list is empty 
		{
			head = current = newNode; // points head and current towards new node
			return; 
		}
		ListNode temp = head; // holds the mermory address starting from the head
		while(temp.link != null ) // checking the end of the list // link is the memory address of the next object
			temp = temp.link; // setting temp to equal its neghibor // moving forward
		temp.link = newNode; //this becomes our last
		
	}
	
	public void print()
	{
		ListNode temp = head; 
		while(temp !=null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	
	public void addAfterCurrent(T aData) 
	{
		if(current == null)
		{
			return;
		}	
		ListNode newNode = new ListNode(aData,current.link); //we need it to refer to the data already in current.
		current.link = newNode;
	}
	
	public T getCurrent() // gives access to the data that is stored for current
	{
		if(current == null)
			return null;
		return current.data; // will return the data aka the num of current
	}
	public void setCurrent(T aData) // this data really shouldnt be null
	{
		if(aData == null || current == null)
			return;
		current.data = aData; // allows us to access data at current but we cant move it around yet it is still stuck behind head
	}
	
	public void gotoNext() //we are resigning the next memory address as current 
	{
		if(current != null)
		{
			previous = current;
			current = current.link;
		}
	}
	public void reset()
	{
		current = head; // this will move current back to head
		previous = null;
	}
	
	public boolean hasMore() // this function will tell us if there are any spots in the list that are null
	{
		return current != null;
	}
	public void removeCurrent()
	{
		if(current == head)
		{
			head = head.link;
			current = head;
		}
		else
		{
			previous.link = current.link;
			current = current.link;
		}
	}
}
