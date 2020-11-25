/*
 * Written by Savanna Shaver
 */
public class Tester {

	public static void main(String[] args) {
	
		StacksI<Integer> stack;
		//stack = new ArrayStack<Integer>();
		stack = new LLStack<Integer>();
		for(int i=0;i<10; i++)
		{
			stack.push(i);
			
		}
		stack.print();
		int val = stack.pop();
		int val2 = stack.pop();  // takes from the last printed word
		stack.print();
	}

}
