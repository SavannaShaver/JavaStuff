
public class Question6Review {
	public double [] heap;
	private int lastIndex;
	
	public void add(double value)
	{
		if(lastIndex >= heap.length)
			return;
		heap[lastIndex] = value;
		bubbleUp();
		lastIndex++;
	}
	
	private void bubbleUp()
	{
		int index = this.lastIndex;
		while(index >0 && heap[(index-1)/2] > heap[index])
		{
			double temp = heap[(index-1)/2];
			heap[(index-1)/2] = heap[index];
			heap[index] = temp;
			index = (index-1)/2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question6Review dHeap = new Question6Review();
		//double[] array = {1.0,2.0,3.0,4.0,5.0,6.0};
		double[] array = {3.0,1.0,5.0,2.0,6.0,4.0};
		dHeap.heap = new double[array.length];
		for(double j : array)
			dHeap.add(j);
		System.out.println("Heap in breadth order");
		for(double j : dHeap.heap)
			System.out.print(j+",");
	}

}
