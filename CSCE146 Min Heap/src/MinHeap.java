
public class MinHeap <T extends Comparable<T>>{
	
	private T[] heap; // creating the array
	public static final int DEF_SIZE = 128;// should be base two?
	private int lastIndex; //first null element
	public MinHeap()
	{
		init(DEF_SIZE);
	}
	public MinHeap(int size)
	{
		init(size);
	}
	private void init(int size)
	{
		if(size > 0) // if size is greater than 0
		{
			heap = (T[])(new Comparable[size]); // constructing the heap
			lastIndex = 0; // setting last index to 0 aka the root
		}
		else // if the size is less than 0
			init(DEF_SIZE); 
			
	}
	public void add(T aData)
	{
		if(lastIndex >= heap.length) // means the root is greater than the heap.length means we have no space in our array left
			return;
		heap[lastIndex] = aData; // the heaps root = aData
		//Todo bubble up
		bubbleUp();
		lastIndex++;
	}
	private void bubbleUp() {
		// TODO Auto-generated method stub
		int index = lastIndex; 
		while(index > 0 && heap[(index-1)/2].compareTo(heap[index])>0) // while this index is greater than zero and see the heap( at the parents index) then call compare to to see its heap at that index. So if the parent is greater than the child
		// its out of order so we have to swap.
		{
			T temp = heap[(index-1)/2]; // setting it to the parent value
			heap[(index-1)/2] = heap[index]; // reasign the parent to the current heap index
			heap[index] = temp; // we  then reasign heap at this index at the temp value
			index = (index-1)/2; // this will then add this 
		}
	}
	
	public T remove()
	{
		if(lastIndex == 0) // is the "root" 0 a zero value then the tree is empty
			return null;
		// otherwise
		T ret = heap[0]; // the return value should be the value at the root
		heap[0] = heap[lastIndex-1];// So the root now equals the root -1
		heap[lastIndex-1] = null; // the root -1 now equals null
		lastIndex--;
		bubbleDown();
		return ret;	
	}
	private void bubbleDown() {
		// TODO Auto-generated method stub
		int index = 0; 
		while(index*2+1 < lastIndex) // we have to do this till we reach the bounds of the tree
		{
			//above means that the left child is greater than the root
			int smallIndex = index*2+1;
			if(index*2+2 < lastIndex && heap[index*2+1].compareTo(heap[index*2+2])>0) //now is the right child greater than the root and is the left child compared to the right child greater
				smallIndex = index*2+2;	 // small index = right child 
			if(heap[index].compareTo(heap[smallIndex])>0) // iff the index compare to the "smallIndex" the right child is greater than construct a new var
			{
				T temp = heap[index]; // object temp = the heaps index at that point
				heap[index] = heap[smallIndex]; // the heap index is now set to the value on the right Child
				heap[smallIndex] = temp; // the right child value = temp
			}
			else
				break; // if we find the parent is smaller than the smallest child it will break the if statment cycle
			index = smallIndex; // if we dont break we have to set the index to the small index of the left side?
		
		}
	}
	public void print()
	{
		for(T h: heap)
		{
			if(h == null)
				break;
			System.out.println(h);	
		}
	}
	public void heapSort(T[] array) // you have to pass an array to sort it,
	{
		if(array == null) // if no array found then nothing happens
			return;
		MinHeap<T> mHeap = new MinHeap<T>(array.length); // created an instance of MinHeap generic and then created another instance inside of it the length of the array
		for(int i = 0; i<array.length; i++) // for the length of the array
			mHeap.add(array[i]); // we are adding all the objects in the array	
		
		for(int i=0; i<array.length; i++)
			array[i] = mHeap.remove(); // now we are removing them all
		
	}

}
	

	
	
	

