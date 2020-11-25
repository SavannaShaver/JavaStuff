
public class LLStack<T> implements StacksI<T> { 
	private class ListNode
	{
		T data;
		ListNode link;
		public ListNode(T aData, ListNode aLink)
		{
			data = aData;
			link = aLink;
		}
	}
	private ListNode head; // only refrence for a stack
	public LLStack()
	{
		head = null;
	}
	public void push( T aData) // adding an element to the beginging
	{
		ListNode newNode = new ListNode(aData,head);
		head = newNode;
	}
	public T pop() // removing somthing
	{
		if(head == null)
			return null;
		T ret = head.data; // trying to acess data hear so it cant be null
		head = head.link;
		return ret;
	}
	public T peek()
	{
		if(head == null)
			return null;
		return head.data;
	}
	public void print()
	{
		for(ListNode temp = head; temp != null; temp = temp.link)
		{
			System.out.println(temp.data);
		}
	}
}
