/*
 * Written by Savanna Shaver
 */
public interface QueueI <T>
{
  // doesnt have any functional code just def
	public void enqueue(T aData);
	public T dequeue();
	public T peek();
	public void print(); // prints all the elements
	
	
}
