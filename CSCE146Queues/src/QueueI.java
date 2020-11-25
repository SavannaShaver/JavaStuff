
public interface QueueI <T> // we cant construct a interface like a class. So no using new . This is a generic queue
{
  // doesnt have any functional code just method def
	public void enqueue(T aData); 
	public T dequeue(); // removes and returns the last item
	public T peek(); // returns the first item in the data doesnt remove
	public void print();
	
	
}
