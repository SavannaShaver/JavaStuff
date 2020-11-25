/*
 * Written by Savanna Shaver
 */
public class ArrayStack <T> implements StacksI <T>
{
		private T[] stack;
		private int head; // first null element
		public static final int DEF_SIZE = 100;
		public ArrayStack()
		{
			init(DEF_SIZE);
		}
		public ArrayStack(int size)
		{
			init(size);
		}
		public void init(int size)
		{
			head = 0;
			if(size >=1) // making sure we dont have an empty stack 
			{
				stack =(T[])(new Object[size]); // makes your stack the size of your array
			}
			else
			{
				stack = (T[])(new Object[DEF_SIZE]);
			}
		}
		public void push(T aData)
		{
			if(head >= stack.length) // is sayingt that the head is outside of the stack length means the stack is full
			{
				return;
			}
			stack[head] = aData;
			head++;
		}
		public T pop()
		{
			if(head == 0)// checks to see if their is anything in the stack. IF ITS TRUE THEN ITS EMPTY
			{
				return null;
			}
			T ret = stack[head-1]; // this will pop off an element of the stack
			head--;
			return ret;
		}
		public T peek()
		{
			if(head == 0)
				return null;
			return stack[head-1]; // returns the value of head
		}
		public void print()
		{
			for(int i = head-1;i >=0;i--)
				System.out.println(stack[i]);
		}
		
		//17:38
}
