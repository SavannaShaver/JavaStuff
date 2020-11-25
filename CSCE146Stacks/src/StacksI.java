/*
 * Written by Savanna Shaver
 */
public interface StacksI <T>{
	// doesnt have any functional code just method def
		public void push(T aData); 
		public T pop(); // removes and returns the first item
		public T peek(); // returns the first item in the data doesnt remove
		public void print();

}
