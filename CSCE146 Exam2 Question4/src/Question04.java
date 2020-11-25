/*
 * <<Savanna Shaver>>
 * CSCE 146 Exam01 Question04
 * Provided code. Do not alter the code that says "Do not alter"
 * Make sure this at least compiles (no syntax errors)
 * You may write additional methods to help
 */
//Do not alter------------------------------------------------------------------------
public class Question04 
{
	public Candy[] heap;//public for testing purposes
	public int lastIndex;//First null element
		
	public void add(Candy aData)
	{
//------------------------------------------------------------------------------------	
		//Write your code here
		if(lastIndex >= heap.length)
			return;
		heap[lastIndex] = aData;
		bubbleUp();
		lastIndex++;
		
	}//Do not alter
	
	//Write any additional helper properties or methods here
	private void bubbleUp() {
		int index = lastIndex; 
		while(index > 0 && heap[(index-1)/2].compareTo(heap[index])>0) 
		
		{
			Candy temp = heap[(index-1)/2]; 
			heap[(index-1)/2] = heap[index]; 
			heap[index] = temp;
			index = (index-1)/2; 
		}
	}
	//--------------------------------------------------------------------------------
	
	//Test your code here. You may alter this as needed.
	public static void main(String[] args)
	{
		Candy[] array = {
				new Candy(100.0),
				new Candy(80.0),
				new Candy(60.0),
				new Candy(40.0),
				new Candy(20.0),
				new Candy(10.0),
				new Candy(30.0),
				new Candy(50.0),
				new Candy(70.0),
				new Candy(90.0)
		};
		Question04 minHeap = new Question04();
		minHeap.heap = new Candy[array.length];
		for(Candy c : array)
			minHeap.add(c);
		for(Candy c: minHeap.heap)
		{
			System.out.print(c+" ");
		}
	}
	//--------------------------------------------------------------------------------

}//Do not alter
/*Solution Description
 * For this problem I had to create an add method for a min heap of Candy using an array implemenation
 * To achieve this I first created a if statement inside the add method that checks to 
 * makes sure I at least have the first element in the heap, if I don't the program will do nothing. Otherwise
 * the first null element is set equal to the first data in the heap. I then create another method
 * called bubbleUp. In bubbleUp I create an if statement and check if the parent is greater than 
 * the child if it is I create a Candy temp variable and set it to the parent value. I then
 * reassign the parent value to equal the current heap index which is the lastIndex value.
 * Then I reassign the heap at this index at the temp value. Then the index value equals the parent
 * value now and we can add accordingly. Then I went back to my first add method and added lastIndex++ so
 * that the lastIndex will move to the new first null space after bubbleUp added data in its old space.
 */