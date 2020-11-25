package tester;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] a = {2,4,6,8};
		//Put your code here
		//int result = a[0]; //keeps track of the results
		//for(int i=1;i<a.length;i++)
		//{
		//result *= a[i]; //adds the current index to the result
		//}
		//System.out.println(result);
		//System.out.println(a[0]);//prints the result
		System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid");
		Scanner keyboard = new Scanner(System.in);
		String date = keyboard.nextLine();
		System.out.println(date);
		
		int[] a = {1,2,3,4,5,6,7,8,9}; 

	    int[][] b = new int[3][3]; 

	 
	    for(int i = 0; i <a.length; i++) 

	    { 

	     for(int j = 0; j < a.length; j++) 

	     { 

	     System.out.println(" " + (i) + "," +(j)+""); 

	     } 

	} 
		

	}

}
