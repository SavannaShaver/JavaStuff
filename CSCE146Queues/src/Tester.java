/*
 * Written by Savanna Shaver
 */
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueI<Integer> q;  // we created a type for intergers but we could have done any type because the interface is generic
		q = new LLQueue(); // this is constructing  for a queue you have to call from another class
		//q = new ArrayQueue();
		for(int i =0; i <10; i++)
		{
			q.enqueue(i);
		}
		q.print();
		int val = q.dequeue(); // this is removing the value 0
		int val2 = q.dequeue(); // this right after it will remove the value 1
		q.print();
	}

}


//LLQueue and //ArrayQueue() work the same exact way the LL is just using a linked list while //Array is using an array