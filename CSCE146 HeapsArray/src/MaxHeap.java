/*
 * Written by Savanna Shaver
 */
public class MaxHeap <T extends Comparable<T>> { // nead the extends stuff to make the node comparable
	
	private T[] heap; // creating the array
	private int size; // First null element in our array
	public static final int DEF_SIZE = 128;// should be base two?
	
	public MaxHeap() // default
	{
		init(DEF_SIZE);
	}
	public MaxHeap(int aSize) // parametrized
	{
		init(aSize); 
	}
	private void init(int aSize) // created to intiailze each one of the values
	{
		if(aSize <= 0)
		{
			init(DEF_SIZE);
			return;
		}
		//now that the size is assume to be 128 we construct the array below
		heap = (T[])(new Comparable[aSize]);
		size = 0;
	}
	
	public void add(T aData) // array cant be resized 
	{
		if(heap[heap.length-1] != null) // this means the array is full
			return;
		heap[size] = aData; // heap at he last index is assigned to aData
		//bubble up
		bubbleUp();// adds 
		size++;
	}
	private void bubbleUp()
	{
		//we dont nee recurison yay
		int index = size; // the index is at the end
		while(index > 0 && heap[(index-1)/2].compareTo(heap[index])<0)// tells us if the value added is greater so we can swap the intergers place in the heap 
		{
			//index > 0 : we arent at the root
			// heap[index-1)/2] tells us our parent node value so we can then compare it to the child heap[index] < 0
			
			T temp = heap[(index-1)/2]; // we store the parent value
			heap[(index-1)/2] = heap[index];//we then resign it to the index
			heap[index] = temp;//then the heap index from before gets swapped to the parent value
			index = (index-1)/2;//
			
		}

	}
	public T remove() // heaps can only!!! ever remove from the root 
	{
		T ret = heap[0]; // we set ret to the root
		heap[0] = heap[size-1]; // we then replace the root from the last value in the heap
		heap[size-1] = null;// removing the dublicate value?		
		size --;// go down one
		//bubble down
		bubbleDown();
		return ret;
	}
	
	private void bubbleDown()
	{
		
		int index = 0; // starts at the root 
		while(index* 2+1 < size) // size is the first null index. So anything below is in bounds of the tree
		{
			
			int bigIndex = index*2+1;
			if(index*2+2 < size && heap[index*2+1].compareTo(heap[index*2+2])<0)// checks the right child to see if it is suppose to go left or right 
			{
				bigIndex = index*2+2;
			}
			if(heap[index].compareTo(heap[bigIndex])<0)// if this isnt true than the parents value is larger than the child and we need the loop to stop
			{
				T temp = heap[index];
				heap[index]=heap[bigIndex];
				heap[bigIndex]= temp;
			}
			else
				break;
			index = bigIndex; 
		}

	}
	public T peek()
	{
		return heap[0];
	}
	public void print()
	{
		for(int i=0; i<size; i++)
		{
			System.out.println(heap[i]);
		}
	}
}



