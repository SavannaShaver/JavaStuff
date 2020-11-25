import java.util.Scanner;
public class SimpleRecursion {

	public static void main(String[] args) {
		
	
	//countDown(5);
		System.out.println(fibo(10));
	
	System.out.println(factorial(3));
	
	}
	public static void countDown(int i) // i is our starting value (Halting Condition)
	{
		if(i < 0) // checks to see if i is less than 0
			return;
		System.out.println(i);
		countDown(i-1); // recalls out countdown method (Recursive Call)
	}
	
	public static int factorial(int number) // factorial has to return a value thus use int
	{
		if(number <= 0)
			return 1;
		else
		{
			return number * factorial(number-1); 
		}
	}
	public static int gcd(int a,int b)
	{
		if(b == 0)
			return a;
		else 
			return gcd(b,a%b);
	}
	public static int fibo(int number)
	{
		if(number == 1 || number == 2)
			return 1;
		else 
			return fibo(number-1) + fibo(number-2);
	}

}
