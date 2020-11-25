
public class Question1Review {
	public static int fibonacci(int number)
	{
		if(number <=0)
			return 0;
		if(number == 1 || number == 2 )
		{
			return 1;
		}
		else
		{
			return fibonacci(number-1)+ fibonacci(number-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int value = 7;
		//System.out.print("The 7th value in the fib squence is:" + fibonacci(value));
		int value = 10;
		System.out.print("The 10th value in the fib squence is:" + fibonacci(value));
	}

}
