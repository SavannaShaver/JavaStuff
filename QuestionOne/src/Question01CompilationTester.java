/*
 * CSCE 145 Exam02 Question01
 * Provided code
 * Do not alter
 * Make sure this compiles before submitting.
 * Don't forget the Solution Description along with your Programming solution.
 */
public class Question01CompilationTester {

	public static void main(String[] args) {
		Waffle w;//Verifies the class exists
		w = new Waffle();//Default Constructor
		w = new Waffle("Brussels",20);//Parameterized Constructor
		w.getType();//Accessor for Type
		w.getPockets();//Accessor for Pockets
		w.setType("Belgian");//Mutator for Type
		w.setPockets(15);//Mutator for Pockets
	}

}
