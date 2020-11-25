/*
 * Written By Savanna Shaver
 */
public class BSTTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedBST<Integer>  iBST = new LinkedBST<Integer>(); //creating the object and giving it a type
		//LinkedBST<Object>  BST = new LinkedBST<Object>(); cant do this because the data s
	iBST.add(8);
	iBST.add(2);
	iBST.add(12);
	iBST.add(1);
	iBST.add(4);
	iBST.add(10);
	iBST.add(16);
	iBST.printPreorder();
	System.out.println(" ");
	iBST.printInorder();// prints values in accending order
	
	System.out.println(iBST.search(4));
	System.out.println(iBST.search(8));
	System.out.println(iBST.search(2));
	System.out.println(iBST.search(12));
	System.out.println(iBST.search(9));
	iBST.remove(4);
	iBST.remove(16);
	iBST.printInorder();
	iBST.remove(8);
	iBST.printInorder();
	}

}
