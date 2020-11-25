/*
 * CSCE 145 Exam02 Question01
 * Provided code
 * Do not alter
 * Make sure this compiles before submitting
 * Don't forget the Solution Description along with your Programming solution
 */
public class Question04CompilationTester {

	public static void main(String[] args) {
		Chef c;//Verifies the class exists
		c = new Chef();//Default Constructor
		Person p = c;//Chef Inherits from type Person (Chef is a Person)
		c = new Chef("Bob","Bob's Burgers"," Poblano Picasso Burger");//Param Constructor
		String s = c.toString();//toString method
		System.out.println(s);
	}

}
