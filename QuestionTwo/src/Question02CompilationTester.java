/*
 * CSCE 145 Exam02 Question02
 * Provided code
 * Do not alter
 * Make sure this compiles before submitting.
 * Don't forget the Solution Description along with your Programming solution.
 */
public class Question02CompilationTester {

	public static void main(String[] args) {
		Waffle w;//Verifies the class exists
		w = new Waffle();//Default Constructor
		Waffle w2 = new Waffle();
		String s = w.toString();//toString method
		boolean b = w.equals(w2);//equals method
		boolean b2 = w.hasMorePockets(w2);//hasMorePockets method
		Waffle w3 = Waffle.cloneWaffle(w);//Static clone waffle method
		
		
	}

}
