
public class IntLLtester {

	public static void main(String[] args) {
	 IntLL iLL; // instance variable
	 iLL = new IntLL(); // we are creating a default constructor but not a parametrized consturcot
	
	for(int i = 4; i>=0; i--)
		iLL.add(i);
	
	iLL.print();
	iLL.addAfterCurrent(22);
	iLL.print();
	
	iLL.gotoNext();
	iLL.addAfterCurrent(23);
	iLL.print();
	
	iLL.setCurrent(42);
	iLL.print();
	
	iLL.removeCurrent(); // should remove 42
	iLL.print();
	}

}
