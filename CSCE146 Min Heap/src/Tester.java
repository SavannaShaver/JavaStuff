
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinHeap<Integer> iHeap = new MinHeap<Integer>(); // creating a instance of MinHeap integer, something different would happen for doubles? 
		Integer[] iArray = {5,1,4,3,6,2}; // created an array with the values we are suppose to work with
		iHeap.heapSort(iArray); // the iheap for intergers . heapSort which is in our minHeap class
		for(Integer i : iArray) // printing all the numbers in the iArray through the heap
			System.out.println(i);
	}

}
