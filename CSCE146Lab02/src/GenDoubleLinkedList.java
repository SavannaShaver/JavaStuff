/*
 * Written By: Savanna Shaver
 */
public class GenDoubleLinkedList <T>
{
	private class ListNode
	{
		T data;
		ListNode nextLink, prevLink;
		public ListNode(T aData,ListNode aNext, ListNode aPrev)
		{
			data = aData;
			nextLink = aNext;
			prevLink = aPrev;
		}
	}
	private ListNode head;
	private ListNode current;
	public GenDoubleLinkedList()
	{
		head = current = null;
	}
	public void gotoNext()
	{
		if(current == null)
			return;
		current = current.nextLink;
	}
	public void gotoPrev()
	{
		if(current == null)
			return;
		current = current.prevLink;
	}
	public boolean hasMore()
	{
		return current != null;
	}
	public void reset()
	{
		current = head;
	}
	public T getCurrent()
	{
		if(current == null)
			return null;
		return current.data;
	}
	public void setCurrent(T aData)
	{
		if(current != null)
			current.data = aData;
	}
	public void add(T aData) // adds to the end of the linked list
	{
		ListNode newNode = new ListNode(aData,null,null);
		if(head == null)
		{
			head = newNode;
			current = head;
			return;
		}
		ListNode temp = head;
		while(temp.nextLink != null)
			temp = temp.nextLink;
		temp.nextLink = newNode; // this is what does the adding to the end
		newNode.prevLink = temp; // this is connecting the link backwards to the last data file
	}
	public void addAfterCurrent(T aData)
	{
		if(current == null)
			return;
		ListNode newNode = new ListNode(aData,current.nextLink,current);
		if(current.nextLink != null)
			current.nextLink.prevLink = newNode;
	}
	public void removeCurrent()
	{
		if(current == null)
			return;
		if(current == head)
		{
			head = head.nextLink;
			if(head != null)
				head.prevLink = null;
			current = head;
			return;
		}
		current.prevLink.nextLink = current.nextLink;
		if(current.nextLink != null)
			current.nextLink.prevLink = current.prevLink;
		current = current.nextLink;
	}
	public void print()
	{
		ListNode temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.nextLink;
		}
	}
	public boolean contains(T aData)
	{
		for(ListNode temp = head; temp != null; temp = temp.nextLink)
			if(temp.data.equals(aData))
				return true;
		return false;
	}
}
