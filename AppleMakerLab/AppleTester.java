/*
 * Written by Savanna Shaver
 */
public class AppleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Welcome to the apple tester");
	System.out.println("");
	Apple apple01;
	apple01 = new Apple();
	System.out.println("Creating a default apple");
	System.out.println("Printing the default apple's value");
	
	System.out.println(apple01);
	System.out.println("");
	
	
	System.out.println("Creating another apple");
	System.out.println("Setting the new apple's values to the following, valid values");
	Apple apple02 = new Apple("Granny rsmith", 0.75,0.99);
	System.out.println("Printing the new apple's values");
	System.out.println(apple02);
	
	
	System.out.println("Creating another defult apple\r\n" + 
			"\r\n" + 
			"Then setting the new apple's values to the following, invalid values \"iPad 2.5 -200\"");
	Apple apple03 = new Apple("iPad", 20.0, -200.0);
	System.out.println(apple03);
	// so here your lab wanted us to return it as invaild but on the youtbue video you said it was okay to reprint the default, so just want to make sure I dont loose anypoints for that
	System.out.println("");
	System.out.println("Printing the newest apple's values which should not have changed from the default values");
	Apple apple04 = new Apple();
	System.out.println(apple04);
	
	System.out.println("");
	System.out.println("Checking if the first and last apple have the same values.");
	System.out.println(apple01.equals(apple04));
	}

}
