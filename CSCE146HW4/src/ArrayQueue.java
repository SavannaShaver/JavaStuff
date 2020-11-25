
public class ArrayQueue <T> implements QueueI <T>{ 
	private T[] queue; // is an array
	private int headIndex; // first element
	private int tailIndex; // first NULL element or 1 past the last element. IT ISNT THE LAST ELEMENT
	public static final int DEF_SIZE = 100; 
	public ArrayQueue() // created the default constructor
	{
		init(DEF_SIZE);  
	}
	public ArrayQueue(int size) // paramterized constructor we only want to be able to change the size of the array
	{
		init(size);
	}
	private void init(int size)
	{
		headIndex = tailIndex = 0; // 
		if(size >= 1) // this is checking to see if the size is valid for an array
			queue = (T[])(new Object[size]); // type cast the array two and then your constructing a new object of that array size
		else
			queue = (T[])(new Object[DEF_SIZE]); // this is just a default size of the array if the array isnt greater than 1
	}
	public void enqueue(T aData)
	{
		// queue[headIndex] is calling the first spot in the array
		// if headIndex == tailIndex is true there isnt any space for a new element
		if(queue[headIndex] != null && headIndex == tailIndex)   
			return;
		queue[tailIndex] = aData;  // so then if there is room we set the array's tail to our data(aData)
		tailIndex = (tailIndex+1)%queue.length; // this will advance the tail in a circluar way		
	}
	public T dequeue()
	{
		// we are saying ret = the first spot in the array. THis saves a refrence of the data in that spot
		T ret = queue[headIndex];
		headIndex = (headIndex + 1)% queue.length;// then we move forward circularlly. by i THINK 1 
		return ret; // then return ret which should now be one number to the right of the orginal headIndex and now our new head
	}
	public T peek()
	{
		return queue[headIndex]; // this is returing our first element
	}
	public void print()
	{
		System.out.println(queue[headIndex]); // this prints our first spot in the array
		for(int i = (headIndex + 1)% queue.length; i != tailIndex; i = (i +1)%queue.length) // cant start at 0 because you dont know if that is where head is starting
			//so now print the circluar fasihon to show the other numbers. You want to print till you get to the tailIndex 
			//i increases by i +1%queue.length
 			System.out.println(queue[i]);
	}
	
}
