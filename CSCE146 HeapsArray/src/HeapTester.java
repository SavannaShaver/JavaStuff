
public class HeapTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxHeap<Integer> iHeap = new MaxHeap<Integer>(); // created a type integer
		// if we used <Object> that would be wrong because that is not comparable
		MaxHeap<String> sHeap = new MaxHeap<String>(); // this is comparable as well 
		sHeap.add("a");
		sHeap.add("aAa");
		sHeap.add("aa");
		sHeap.add("aaaaa");
		sHeap.add("aaaaaaa");
		//sHeap.add("aaaaaaaaa");
		sHeap.print();
		
		sHeap.remove();// is removing the largest
		sHeap.print();
		
	}

}
